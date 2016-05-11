package com.wizardlyshop.foodmaster;
import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
public class FavoritesActivity extends Activity{
	SQLiteDatabase db;
	FMSQLiteOpenHelper helper;	
	Typeface typeface; //외부폰트용			
	private MyAdapter adapter,adapterForRandom;
	ArrayList <Integer> selectedImg=new ArrayList<Integer>();
	ArrayList <Integer> randomSelectedImgId=new ArrayList<Integer>();
	ArrayList <Integer> selectedFoodNameId=new ArrayList<Integer>();
	ArrayList <Integer> randomSelectedFoodNameId=new ArrayList<Integer>();
	ArrayList <String> dbResult=new ArrayList<String>();
	ListView lv;
	String selectedFoodCode;
	int randomIndex;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		loadTypeface(); ////외부폰트 적용을 위한 폰트로딩 메서드 호출			
		setContentView(R.layout.tab_favorites);
		helper=new FMSQLiteOpenHelper	////DB 연동 :
				(FavoritesActivity.this,        // 현재 화면의 context
						"favorites.db",// 파일명
						null,                // 커서팩토리
						1);                        // 버전명
		////	adapter만들기	////	:data와 widget을 연결함
		adapter=new MyAdapter(this, //화면 그려줄 context
				selectedImg, selectedFoodNameId, //data
				R.layout.row_favorites); //하나의 행을 나타낼 layout
		adapterForRandom=new MyAdapter(this, //화면 그려줄 context
				selectedImg, selectedFoodNameId, //data
				R.layout.row_favorites); //하나의 행을 나타낼 layout		
		//3.view만들기: listView선언, adapter과 연결
		lv=(ListView)findViewById(R.id.listViewFavorites);
	}
	public void setContentView(int viewId) { ////외부폰트 적용을 위한 오버라이딩
		View view=LayoutInflater.from(this).inflate(viewId, null);
		ViewGroup group=(ViewGroup)view;
		int childCnt=group.getChildCount();
		for(int i=0;i<childCnt;i++){
			View v=group.getChildAt(i);
			if(v instanceof TextView){
				((TextView)v).setTypeface(typeface);
			}
		}
		super.setContentView(view);
	}
	public void loadTypeface(){                ////폰트로딩 ()
		if(typeface==null)	typeface=Typeface.createFromAsset(getAssets(), "NanumPen.ttf"); //assets폴더에 넣은 외부폰트명
	}
	protected Dialog onCreateDialog(int id){ //다이얼로그를 생성해서 완성된 다이얼로그를 리턴한다.	
		AlertDialog.Builder builder=new AlertDialog.Builder(FavoritesActivity.this);
		//AlertDialog.Builder를 통해서 dialog 객체를 생성
		switch(id){
		case 1: builder.setTitle(R.string.favoritesDialogTitle); builder.setMessage(R.string.favoritesDialogQuestionDelete);
		builder.setPositiveButton(R.string.favoritesDialogDelete, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {	delete();	}	////삭제 처리	
		});	//확인 버튼
		builder.setNegativeButton(R.string.favoritesDialogCancel, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {}
		});	//취소 버튼
		break;
		}
		return builder.create();
	}
	public void select(){
		db=helper.getReadableDatabase();        //DB 객체를 얻어옴. 읽기 전용.
		Cursor c=db.query("favorites", null, null, null, null, null, null);        //셀렉 * from tb효과
		dbResult.clear();	//초기화
		while(c.moveToNext()){
			String _foodcode=c.getString(c.getColumnIndex("_foodcode"));
			dbResult.add(_foodcode);
		}
	}
	public void delete(){
		db=helper.getWritableDatabase();        //DB 객체를 얻어옴. 쓰기 전용.
		String query="_foodcode='"+selectedFoodCode+"'";	//선택된 음식을 즐겨찾기에서 삭제
		db.delete("favorites", query, null);
		onResume();
	}
	protected void onResume() {
		super.onResume();
		select();	////DB 셀렉
		selectedImg.clear();
		selectedFoodNameId.clear();
		for(String foodcode:dbResult){
			selectedImg.add(this.getResources().getIdentifier(foodcode, "drawable",  this.getPackageName()));
			selectedFoodNameId.add(this.getResources().getIdentifier(foodcode, "string",  this.getPackageName()));
		}		
		adapter.img=selectedImg;
		adapter.foodNameId=selectedFoodNameId;
		lv.setAdapter(adapter);
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				if(randomIndex>0){
					selectedFoodCode=dbResult.get(randomIndex);	
				}else{
					selectedFoodCode=dbResult.get(arg2);	
				}
				showDialog(1);
			}
		});		
		Button btnRandom=(Button)findViewById(R.id.buttonRandom);	////랜덤 선택 구현
		btnRandom.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if(selectedFoodNameId.size()>0){	//항목수가 1개이상 있을 때만 실행(안하면 랜덤인자에 0가 들어가서 에러 발생함)
					FoodMasterGlobals.gPlaySoundButtonClick();	//사운드 출력 : 버튼 효과음
					Random r=new Random();
					randomIndex=r.nextInt(selectedFoodNameId.size());	//랜덤범위 설정 및 랜덤값 추출
					randomSelectedImgId.clear();	////초기화
					randomSelectedFoodNameId.clear();
					randomSelectedImgId.add(selectedImg.get(randomIndex));
					randomSelectedFoodNameId.add(selectedFoodNameId.get(randomIndex));
					adapterForRandom.img=randomSelectedImgId;
					adapterForRandom.foodNameId=randomSelectedFoodNameId;
					lv.setAdapter(adapterForRandom);	//어댑터 교체(랜덤어댑터)
				}
			}
		});
		////리스트 선택시
		Button btnShowList=(Button)findViewById(R.id.buttonShowList);
		btnShowList.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				FoodMasterGlobals.gPlaySoundButtonClick();	//사운드 출력 : 버튼 효과음
				lv.setAdapter(adapter);	//어댑터 교체(기본)
			}
		});		
	}
}

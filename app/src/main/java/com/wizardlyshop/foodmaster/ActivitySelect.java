package com.wizardlyshop.foodmaster;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.ANY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.BOILED;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.CHARCOAL;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.CHEWY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.COLD;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.COLLEAGUE;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.COUPLE;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.CRUNCHY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.CRYSPY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.DESSERT;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.FISHY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.FRIED;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.FRIEND;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.GREASY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.HOT;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.LIGHT;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.MEAL;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.OVEN;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.RELISHES;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SALTY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SNACK;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SOFT;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SOLO;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SOUP;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SOUR;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SPICY;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.STEAMED;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.STIRFRIED;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.SWEET;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.TABLEDHOTE;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.TEADRINK;
import static com.wizardlyshop.foodmaster.EnumFoodAttribute.UNCOOKED;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.wizardlyshop.foodmaster.util.UtilBackPressCloseHandler;
public class ActivitySelect extends AppCompatActivity implements View.OnClickListener{
	////############	멤버			############////
	Typeface typeface; //외부폰트용			
	MyAdapter adapter;	//adapter
	private TextView questionText;
	private LinearLayout[] questionLayout;
	int index=0,questionId[],randomIndex;
	LinkedList <Food> matchingList=new LinkedList<Food>(); //선택된 속성과 일치하는 음식 index들을 저장
	LinkedList <Food> matchingListMemory[]=new LinkedList[6]; //윗 값 백업용 메모리
	ArrayList <Integer> selectedImg=new ArrayList<Integer>();
	HashMap <String , Food> foodObj;
	ArrayList <Integer> selectedFoodNameId=new ArrayList<Integer>();
	ListView lv;
	SQLiteDatabase db;
	FMSQLiteOpenHelper helper;	
	String selectedFoodCode;
	private UtilBackPressCloseHandler mUtilBackPressCloseHandler;	// 백 버튼 종료 처리용
	////############	메서드		############////
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		loadTypeface(); ////외부폰트 적용을 위한 폰트로딩 메서드 호출			
		setContentView(R.layout.activity_select);
		mUtilBackPressCloseHandler = new UtilBackPressCloseHandler(this);	// 백 버튼 종료 처리용
		questionId=LoadData.loadQuestionId();	////데이터 로드	//질문 텍스트 배열 데이터 로드.
		int[] questionLayoutId=LoadData.loadQuestionLayoutId();	//프레임별 ID 로드
		int[] buttonId=LoadData.loadButtonId();	//버튼 ID 로드
		foodObj=new LoadFoodData().loadingFoods();	////데이터 로드(음식)
		final int BTN_COUNT=buttonId.length;	////리스너 달기
		Button[] btn=new Button[BTN_COUNT];
		for(int i=0;i<BTN_COUNT;i++){
			btn[i]=(Button)findViewById(buttonId[i]);
			btn[i].setOnClickListener(this);
		}
		questionText=(TextView)findViewById(R.id.questionText);
		questionText.setText(questionId[index]);
		questionLayout=new LinearLayout[7];
		for(int i=0;i<7;i++)	questionLayout[i]=(LinearLayout)findViewById(questionLayoutId[i]);
		adapter=new MyAdapter(this,	selectedImg, selectedFoodNameId, R.layout.row);	////adapter만들기
		helper=new FMSQLiteOpenHelper(ActivitySelect.this, "favorites.db", null,	1);	////SQLite3 에 추가 작업
	}
	public void onClick(View v) {
		EnumFoodAttribute eFood=ANY;
		if(index==0){	switch(v.getId()){
		case R.id.button1: eFood=SOLO;		break;	case R.id.button2: eFood=COUPLE; 	break;	case R.id.button3: eFood=FRIEND; 	break;	
		case R.id.button4: eFood=COLLEAGUE;	break;	case R.id.buttonAny1: eFood=ANY;	break;
		case R.id.button5: Toast.makeText(ActivitySelect.this,"다시 입력하세요",Toast.LENGTH_SHORT).show(); return;	}
		matchingFood(index,eFood);	//비교 실행
		questionText.setText(questionId[++index]);	questionLayout[0].setVisibility(View.INVISIBLE);	questionLayout[1].setVisibility(View.VISIBLE);
		}else if(index==1){	switch(v.getId()){
		case R.id.button6: eFood=SNACK; 	break;	case R.id.button7: eFood=MEAL;	break;	case R.id.buttonRelishes: eFood=RELISHES; 	break;
		case R.id.buttonTabledhote: eFood=TABLEDHOTE; 	break;	case R.id.buttonTeaDrink: eFood=TEADRINK; 	break;	
		case R.id.buttonDessert: eFood=DESSERT;	break;	case R.id.buttonAny2: eFood=ANY;	break;	}
		matchingFood(index,eFood);	//비교 실행			
		questionText.setText(questionId[++index]);	questionLayout[1].setVisibility(View.INVISIBLE);	questionLayout[2].setVisibility(View.VISIBLE);
		}else if(index==2){	switch(v.getId()){	//여기서부터 ListView 나타내기 위한 처리가 시작됨.
		case R.id.button8: eFood=CRYSPY; 	break;	case R.id.button9: eFood=CRUNCHY; 	break;	case R.id.button10: eFood=CHEWY; 	break;
		case R.id.button11: eFood=SOFT;		break;	case R.id.buttonSoup: eFood=SOUP;	break;	case R.id.buttonAny3: eFood=ANY; 	break;	}
		matchingFood(index,eFood);	//비교 실행
		prepareListView(R.id.listView1,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
		questionText.setText(questionId[++index]);	questionLayout[2].setVisibility(View.INVISIBLE);	questionLayout[3].setVisibility(View.VISIBLE);
		}else if(index==3){	switch(v.getId()){
		case R.id.button12: eFood=BOILED; 	break;	case R.id.button13: eFood=FRIED; 	break;	case R.id.button14: eFood=OVEN; 	break;	
		case R.id.button15: eFood=CHARCOAL; break;	case R.id.buttonUnCooked: eFood=UNCOOKED; break;	case R.id.buttonStirFried: eFood=STIRFRIED; break;
		case R.id.buttonSteamed: eFood=STEAMED; break;	case R.id.buttonAny4: eFood=ANY; 	break;	}
		matchingFood(index,eFood);	//비교 실행
		prepareListView(R.id.listView2,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
		questionText.setText(questionId[++index]);	questionLayout[3].setVisibility(View.INVISIBLE);	questionLayout[4].setVisibility(View.VISIBLE);
		}else if(index==4){	switch(v.getId()){
		case R.id.button16: eFood=HOT; 		break;	case R.id.button17: eFood=COLD;		break;	case R.id.buttonAny5: eFood=ANY; 	break;	}
		matchingFood(index,eFood);	//비교 실행
		prepareListView(R.id.listView3,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
		questionText.setText(questionId[++index]);	questionLayout[4].setVisibility(View.INVISIBLE);	questionLayout[5].setVisibility(View.VISIBLE);
		}else if(index==5){	switch(v.getId()){
		case R.id.button18: eFood=SWEET;	break;	case R.id.button19: eFood=SOUR;	break;	case R.id.button20: eFood=SPICY;	break;	
		case R.id.button21: eFood=LIGHT;	break;	case R.id.buttonGreasy: eFood=GREASY;	break;	case R.id.buttonFishy: eFood=FISHY;	break;
		case R.id.buttonSalty: eFood=SALTY;	break;	case R.id.buttonAny6: eFood=ANY; break;	}
		matchingFood(index,eFood);	//비교 실행
		prepareListView(R.id.listView4,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
		questionText.setText(questionId[++index]);	questionLayout[5].setVisibility(View.INVISIBLE);	questionLayout[6].setVisibility(View.VISIBLE);
		}else if(index==6 && v.getId()==R.id.buttonRandom){	////마지막 결과 화면에서 랜덤 버튼을 눌렀을 때의 처리
			prepareListView(R.id.listView4,true);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
		}
	}//end onCreate();
	private void matchingFood(int layoutIndex,EnumFoodAttribute currentAttribute){	//선택 값과 음식의 속성값을 매칭하는 메서드
		int matchingListSize=matchingList.size();
		int matchingListIndex=0;	//matchingListSize
		if(layoutIndex==0){	//최초 비교는 전체 음식과 비교하고 이후에는 매칭리스트로 비교함.
			if(currentAttribute.equals(EnumFoodAttribute.ANY)){	////아무거나를 선택시 처리	
				Iterator <Food> itFood=foodObj.values().iterator();
				while(itFood.hasNext())matchingList.add(itFood.next()); //모든 음식을 매칭리스트에 넣음.
				//back버튼으로 되돌아 올 경우를 위한 matchingList값 저장
				matchingListMemory[layoutIndex]=(LinkedList<Food>) matchingList.clone();
			}else{ ////아무거나 외의 것을 선택시 처리
				Iterator <Food>itFood;
				Iterator<EnumFoodAttribute> itAttributes;
				Food tempFood;
				itFood=foodObj.values().iterator();	//모든 음식
				while(itFood.hasNext()){	//선택 속성과 일치한 음식만 리스트에 저장.				
					tempFood=itFood.next();	//다음 음식을 임시 음식객체에 넣고
					itAttributes=tempFood.attributes.iterator();	//임시 음식객체의 속성들을 이터레이터로
					while(itAttributes.hasNext()){	//리스트의 각 음식의 속성값들과 비교
						//해당 속성이 있으면 매칭리스트에 임시 음식을 추가
						if(itAttributes.next().equals(currentAttribute)) matchingList.add(tempFood);
					}
				}
				//back버튼으로 되돌아 올 경우를 위한 matchingList값 저장
				matchingListMemory[layoutIndex]=(LinkedList<Food>) matchingList.clone();
			}
		}else if(layoutIndex>=1 && layoutIndex<=5){	//2 단계 부터 마지막 단계까지는 매칭리스트로  비교함.
			if(!currentAttribute.equals(EnumFoodAttribute.ANY)){ //아무거나 아닐때  매칭리스트에 대한 처리를 함
				Iterator<EnumFoodAttribute> itAttributes;
				boolean hasValue=false;	//값 찾음 확인을 위한 플래그
				for(int i=0;i<matchingListSize;i++){
					//현재 선택한 속성과  매칭 리스트 음식의 속성이 일치하지 않으면..
					itAttributes=matchingList.get(matchingListIndex).attributes.iterator();
					hasValue=false;	//플래그 초기화
					while(itAttributes.hasNext()){
						if(itAttributes.next().equals(currentAttribute)){	//속성이 같은게 있으면
							hasValue=true;	//값 찾음 플래그를 true로 세팅
							break;	//while 빠져나감
						}
					}
					if(!hasValue){	//선택 속성이 없으면 매칭리스트에서 뺌
						matchingList.remove(matchingListIndex);	//매칭리스트에서 삭제
						matchingListIndex--;	//remove로 인해 index가 당겨진 다음 아이템을 가리키도록 -- 처리
					}
					matchingListIndex++;
				}
			}
			//back버튼으로 되돌아 올 경우를 위한 matchingList값 저장
			matchingListMemory[layoutIndex]=(LinkedList<Food>) matchingList.clone();
		}
	}
	public void setContentView(int viewId) { ////외부폰트 적용을 위한 오버라이딩
		View view=LayoutInflater.from(this).inflate(viewId, null);
		ViewGroup group=(ViewGroup)view;
		int childCnt=group.getChildCount();
		for(int i=0;i<childCnt;i++){
			View v=group.getChildAt(i);
			if(v instanceof TextView) ((TextView)v).setTypeface(typeface);
		}
		super.setContentView(view);
	}
	public void loadTypeface(){	if(typeface==null) typeface=Typeface.createFromAsset(getAssets(), "NanumPen.ttf");	}	////폰트로딩 ()
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		ListView lv;
		if(keyCode==KeyEvent.KEYCODE_BACK){
			if(index==0) return false;
			else if(index==1) matchingList.clear();	//메모리 초기화
			else if(index==2){
				matchingList=(LinkedList<Food>) matchingListMemory[0].clone();	//메모리 가져오기
			}else if(index==3){
				matchingList=(LinkedList<Food>) matchingListMemory[1].clone();	//메모리 가져오기
			}else if(index==4){	////여기부터 adapter처리 추가
				matchingList=(LinkedList<Food>) matchingListMemory[2].clone();	//메모리 가져오기
				prepareListView(R.id.listView1,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
			}else if(index==5){
				matchingList=(LinkedList<Food>) matchingListMemory[3].clone();	//메모리 가져오기
				prepareListView(R.id.listView2,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
			}else if(index==6){
				matchingList=(LinkedList<Food>) matchingListMemory[4].clone();	//메모리 가져오기
				prepareListView(R.id.listView3,false);	////리스트뷰 Data/어댑터/뷰/연결 일괄작업 사용자정의 메서드
			}
			questionLayout[index].setVisibility(View.INVISIBLE);	////화면 역전환...
			index--;
			questionLayout[index].setVisibility(View.VISIBLE);
			questionText.setText(questionId[index]);
		}
		return true;
	}
	public void prepareListView(int listViewId,boolean isRandomSelected){
		selectedImg.clear();	////리스트뷰 1.Data 준비
		selectedFoodNameId.clear();	//배열 초기화
		if(!isRandomSelected){
			for(Food matchingFood:matchingList){
				selectedImg.add(this.getResources().getIdentifier(matchingFood.id, "drawable",  this.getPackageName()));
				selectedFoodNameId.add(this.getResources().getIdentifier(matchingFood.id, "string",  this.getPackageName()));
			}
		}else{
			if(matchingList.size()>0){	//항목수가 1개이상 있을 때만 실행(안하면 랜덤인자에 0가 들어가서 에러 발생함)
				Random r=new Random();	////랜덤하게 선택
				randomIndex=r.nextInt(matchingList.size());	//랜덤범위 설정 및 랜덤값 추출
				Food randomFood=matchingList.get(randomIndex);
				selectedImg.add(this.getResources().getIdentifier(randomFood.id, "drawable",  this.getPackageName()));
				selectedFoodNameId.add(this.getResources().getIdentifier(randomFood.id, "string",  this.getPackageName()));
			}
		}
		adapter.img=selectedImg;	////2.adapter 세팅
		adapter.foodNameId=selectedFoodNameId;
		lv=(ListView)findViewById(listViewId);	////3.view만들기: listView선언
		lv.setAdapter(adapter);	////4.adapter과 연결	
		lv.setOnItemClickListener(new OnItemClickListener() {	////아이템 클릭시 다이얼로그가 뜨도록 구현
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
				showDialog(1);
				if(randomIndex>0){	selectedFoodCode=matchingList.get(randomIndex).id;	}	
				else{				selectedFoodCode=matchingList.get(arg2).id;			}	
			}
		});
	}
	protected Dialog onCreateDialog(int id){ //다이얼로그를 생성해서 완성된 다이얼로그를 리턴한다.        
		AlertDialog.Builder builder=new AlertDialog.Builder(ActivitySelect.this);	//dialog 객체를 생성
		switch(id){
		case 1: builder.setTitle(R.string.favoritesDialogTitle); builder.setMessage(R.string.favoritesDialogQuestion);
		builder.setPositiveButton(R.string.favoritesDialogOk, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which){	insert(selectedFoodCode);	}	//1.D 저장.
		});	//확인 버튼
		builder.setNegativeButton(R.string.favoritesDialogCancel, new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {}
		}); //취소 버튼
		break;
		}
		return builder.create();
	}	
	public void insert(String foodCode){
		db=helper.getWritableDatabase();	//DB 객체를 얻어옴. 쓰기가능.
		ContentValues values=new ContentValues();
		values.put("_foodcode",foodCode);
		db.insert("favorites", null, values);	//테이블명,널컬럼핵, 데이터(ContentValues)
	}
	public void select(){
		db=helper.getReadableDatabase();	//DB 객체를 얻어옴. 읽기 전용.
		Cursor c=db.query("favorites", null, null, null, null, null, null);	//select * from tb효과
		while(c.moveToNext()){
			String _foodcode=c.getString(c.getColumnIndex("_foodcode"));
		}
	}

	@Override
	public void onBackPressed() {
		mUtilBackPressCloseHandler.onBackPressed();	// 백 버튼 종료 처리
	}
}
package com.wizardlyshop.foodmaster;
import java.util.ArrayList;
import com.wizardlyshop.foodmaster.R;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class MyAdapter extends BaseAdapter{
	Context context;
	ArrayList <Integer> img;
	ArrayList <Integer> foodNameId;
	int layout;
	LayoutInflater inf;
	
	public MyAdapter(Context context, ArrayList <Integer> img, ArrayList <Integer> foodNameId, int layout) {
		this.context=context;
		this.img=img;
		this.foodNameId=foodNameId;
		this.layout=layout;
		inf=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	@Override
	public int getCount() { //list항목의 개수 리턴
		return img.size();
	}

	@Override
	public Object getItem(int position) { //해당 position의 data값 리턴
		return foodNameId.get(position)+img.get(position);
	}

	@Override
	public long getItemId(int position) { //해당 position의 고유id값 리턴
		return position;
	}

	@Override
	//해당 data와 위젯을 연결 후 View를 리턴
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView==null){
			convertView=inf.inflate(layout,null);
		}//최초에 한번씩만 행의 객체를 만든다.
		
		ImageView iv=(ImageView)convertView.findViewById(R.id.imageView1);
		TextView tv=(TextView)convertView.findViewById(R.id.textView1);
		
//		//외부 폰트 적용
//		Typeface typeFace=Typeface.createFromAsset(this.context.getAssets(), "NanumPen.ttf");
//		tv.setTypeface(typeFace);
		
		iv.setImageResource(img.get(position));
		tv.setText(foodNameId.get(position));
		
		return convertView;
	}
	
}
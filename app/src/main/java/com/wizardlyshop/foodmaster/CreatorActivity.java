package com.wizardlyshop.foodmaster;
import com.wizardlyshop.foodmaster.R;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
	Test
 */
public class CreatorActivity extends Activity{
	Typeface typeface;	//외부폰트용
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		loadTypeface(); ////외부폰트 적용을 위한 폰트로딩 메서드 호출
		setContentView(R.layout.creator);
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

	public void loadTypeface(){		////폰트로딩 ()
		if(typeface==null){
			typeface=Typeface.createFromAsset(getAssets(), "NanumPen.ttf"); //assets폴더에 넣은 외부폰트명
		}
	}	
}

package com.wizardlyshop.foodmaster;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ViewFlipperActivity extends Activity{
	////음성 출력용
	private SoundPool soundpool;
	private int soundID[]=new int[1];

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        playIntroVoice();
        loadGlobalSound();
		
        Button btn=(Button)findViewById(R.id.buttonStart);
        btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				FoodMasterGlobals.gPlaySoundButtonClick();	//사운드 출력 : 버튼 효과음
				Intent intent;
				intent=new Intent(getApplicationContext(), TabHostActivity.class);
				startActivity(intent);
			}
		});
        
    }
    
    public void playIntroVoice(){
        ////앱 실행시 "오늘은 뭐 먹지?" 음성 출력
        soundpool=new SoundPool(
        		1,	//최대 넣을 음악파일의 갯수
        		AudioManager.STREAM_MUSIC,	//stream 타입
        		0);	//음질, 기본값:0
        soundID[0]=soundpool.load(
        		ViewFlipperActivity.this,	//현재화면의 context
        		R.raw.today,			//재생할 음악
        		1);	//재생 우선순위
		soundpool.play(
				soundID[0],	//위에서 선언한 soundID
				1f,	//왼쪽 볼륨 float, 0.0f~1.0f(큰소리)
				1f,	//오른쪽 볼륨 
				0, 	//우선순위
				0,	//반복횟수, 0:반복없음, -1:무한반복, 자연수:반복횟수
				1.1f);	//재생속도, float
    }
    public void loadGlobalSound(){
		////글로벌 음성 로딩 처리
        FoodMasterGlobals.gSoundpool=new SoundPool(
        		1,	//최대 넣을 음악파일의 갯수
        		AudioManager.STREAM_MUSIC,	//stream 타입
        		0);	//음질, 기본값:0
        FoodMasterGlobals.gSoundID[0]=FoodMasterGlobals.gSoundpool.load(
        		ViewFlipperActivity.this,	//현재화면의 context
        		R.raw.button6,			//재생할 음악
        		1);	//재생 우선순위
    }
}


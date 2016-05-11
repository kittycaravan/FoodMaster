package com.wizardlyshop.foodmaster;

import android.media.SoundPool;

public class FoodMasterGlobals {
	public static SoundPool gSoundpool; ////음성 출력용
	public static int gSoundID[]=new int[1]; ////음성 출력용

	
	public static void gPlaySoundButtonClick(){
		gSoundpool.play(	////사운드 출력: 버튼 누름 효과음
				gSoundID[0],	//위에서 선언한 soundID
				0.01f,	//왼쪽 볼륨 float, 0.0f~1.0f(큰소리)
				0.01f,	//오른쪽 볼륨 
				0, 	//우선순위
				0,	//반복횟수, 0:반복없음, -1:무한반복, 자연수:반복횟수
				2);	//재생속도, float		
	}	
}

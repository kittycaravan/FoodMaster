package com.wizardlyshop.foodmaster.util;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
/**
 * Created by 호양이 on 2019-08-15.
 */
public class UtilVersionInfo {
    //앱버전 코드
    static public String getAppVersionCode(Context context){
        PackageInfo packageInfo = null;         //패키지에 대한 전반적인 정보
        //PackageInfo 초기화
        try{
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }catch (PackageManager.NameNotFoundException e){
            return "";
        }
        return packageInfo.versionCode + "";
    }

    //앱버전 명
    static public String getAppVersionName(Context context){
        PackageInfo packageInfo = null;         //패키지에 대한 전반적인 정보
        //PackageInfo 초기화
        try{
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }catch (PackageManager.NameNotFoundException e){
            return "";
        }
        return packageInfo.versionName;
    }
}
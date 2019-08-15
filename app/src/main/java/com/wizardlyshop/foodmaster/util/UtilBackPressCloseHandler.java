package com.wizardlyshop.foodmaster.util;
import android.app.Activity;
import android.widget.Toast;

import com.wizardlyshop.foodmaster.R;
/**
 * Created by 호양이 on 2019-08-15.
 */
public class UtilBackPressCloseHandler {
    private long backKeyPressedTime = 0;
    private Toast toast;
    private Activity activity;
    public UtilBackPressCloseHandler(Activity context) {
        this.activity = context;
    }
    public void onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            showGuide();
            return;
        } else {
            activity.finish();
            toast.cancel();
        }
    }
    public void showGuide() {
        toast = Toast.makeText(activity, R.string.alert_back_btn_exit, Toast.LENGTH_SHORT);
        toast.show();
    }
}

package com.varela.varelaandroidtoolslibrary;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

public class Appearance {

    private Activity activity;

    public Appearance(Activity activity){
        this.activity = activity;
    }

    /* Function to change color of status bar */
    private void modify_status_bar(int color){
        Window window = activity.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(activity, color));
    }
}

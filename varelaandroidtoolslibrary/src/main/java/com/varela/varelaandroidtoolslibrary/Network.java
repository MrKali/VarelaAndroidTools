package com.varela.varelaandroidtoolslibrary;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;

public class Network {

    private Context context;

    public Network(Context context){
        this.context = context;
    }

    /* Function to check if network is available */
    public boolean isConnectedToNetwork(){
        ConnectivityManager connectivityManager
                =  (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // if version is equal or bigger than marshmallow
            if (connectivityManager != null && connectivityManager.getActiveNetwork() != null) {
                Log.d("InternetStatus", "Disconnected");
                return true;
            }else {
                Log.d("InternetStatus", "Connected");
                return false;
            }
        }else {
            // if version is lower than marshmallow
            if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null){
                Log.d("InternetStatus", "Disconnected");
                return true;
            }else {
                Log.d("InternetStatus", "Connected");
                return false;
            }
        }
    }
}

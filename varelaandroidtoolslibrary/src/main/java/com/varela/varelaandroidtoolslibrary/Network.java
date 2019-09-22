package com.varela.varelaandroidtoolslibrary;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

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

    static public void test(Context context){
        Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
    }
}

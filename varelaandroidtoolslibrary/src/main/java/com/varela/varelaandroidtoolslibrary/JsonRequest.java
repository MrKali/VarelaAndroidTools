package com.varela.varelaandroidtoolslibrary;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonRequest{
    private JSONObject parameters;
    private Map<String, String> headers;
    private String URL;
    private JsonObjectRequest jsonObjectRequest;
    private int method;
    private VolleyResponseListener volleyResponseListener;
    private RequestQueue queue;

    public JsonRequest(Context context){
        parameters = new JSONObject();
        headers = new HashMap<>();
        queue = Volley.newRequestQueue(context);
    }

    private void createRequest(){
        jsonObjectRequest = new JsonObjectRequest
                (method, URL, null, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        volleyResponseListener.onResponse(response);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        volleyResponseListener.onError(error);
                    }
                });

    }

    public void execute(){
        createRequest();
        queue.add(jsonObjectRequest);
    }

    public void putParameter(String parameter, String value){
        try {
            parameters.put(parameter, value);
        }catch (Exception e){
            Log.e("JsonRequest", e.toString());
        }
    }

    public void putHeader(String header, String value){
        headers.put(header, value);
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public void setMethod(int method) {
        this.method = method;
    }

    public void setVolleyResponseListener(VolleyResponseListener volleyResponseListener) {
        this.volleyResponseListener = volleyResponseListener;
    }
}
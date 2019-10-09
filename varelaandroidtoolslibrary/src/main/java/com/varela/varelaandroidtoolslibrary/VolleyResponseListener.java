package com.varela.varelaandroidtoolslibrary;

import com.android.volley.VolleyError;

public interface VolleyResponseListener {
    void onResponse(Object response);

    void onError(VolleyError message);
}


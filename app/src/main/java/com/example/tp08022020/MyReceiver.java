package com.example.tp08022020;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        int status = NetworkUtil.getConnectivityStatusString(context);
        Log.e("test", "");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (status == NetworkUtil.NETWORK_STATUS_NOT_CONNECTED) {
            //  new (context).execute();
                Toast.makeText(context,"not connected",Toast.LENGTH_LONG).show();
            } else {
             //   new ResumeForceExitPause(context).execute();
                Toast.makeText(context,"connected",Toast.LENGTH_LONG).show();



            }
        }
    }
}

package com.example.gloovir.webstarter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TurnOnReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("no condition", "onReceive: ");
        String name;
        name = intent.getAction();
        if (name == "android.intent.action.SCREEN_ON") {
            Log.d("onReceive", "onReceive: ");
        }
    }
}

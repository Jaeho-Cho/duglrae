package com.kaist.safetydriving;

import android.content.Context;

/**
 * Created by user on 2016-08-10.
 */
public class PluginTargetRegister {
    private final Context mContext;
    private PluginTargetCall callPlugin;
    private PluginTargetSMS smsPlugin;


    public PluginTargetRegister(Context context) {
        this.mContext = context;
        callPlugin = new PluginTargetCall(context);
        smsPlugin = new PluginTargetSMS(context);
    }

    public void registerTargetListener() {
        callPlugin.registerCallListener();
        smsPlugin.registerSMSStatetListener();
    }

    public void unregisterTargetListener() {
        callPlugin.unregisterCallListener();
        smsPlugin.unregisterSMSStateListener();
    }
}

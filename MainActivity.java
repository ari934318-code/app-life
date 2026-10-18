package com.ari.planner;

import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        registerPlugin(CountdownPlugin.class);
        super.onCreate(savedInstanceState);
    }
}

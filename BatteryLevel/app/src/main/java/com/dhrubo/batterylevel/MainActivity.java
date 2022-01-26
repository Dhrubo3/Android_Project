package com.dhrubo.batterylevel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtBatteryLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtBatteryLevel = findViewById(R.id.txt_battery_Level);

        this.registerReceiver(this.myBatteryReceiver,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    BroadcastReceiver myBatteryReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int batteryLevel = intent.getIntExtra("level", 0);
            System.out.println("Battery Level: " + batteryLevel );


txtBatteryLevel.setText("Battery Level is : " + batteryLevel + "%");
        }
    };

}
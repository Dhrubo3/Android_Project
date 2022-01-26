package com.dhrubo.countdowntimer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplaseActivity {
    public class MainActivity extends AppCompatActivity {


        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                //    Intent intent = new Intent( SplaseActivity.this, MainActivity.class);
                //   SplaseActivity.this.startActivity(intent);
                    SplaseActivity.this.finish();
                }
            },1200);
        }
    }

    private void finish() {
    }

    private void startActivity(Intent intent) {
    }
}

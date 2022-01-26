package com.dhrubo.torch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnTorch;
    boolean isTorchOn = false;
    CameraManager cameraManager;
    String cameraID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boolean isTorchAvailable = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);
        btnTorch = findViewById(R.id.btn_torch);

        if(!isTorchAvailable){
            btnTorch.setEnabled(false);
            btnTorch.setText("Torch is Not Available");
        }

        try {
            cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            cameraID = cameraManager.getCameraIdList()[0];
        }catch (Exception e){}

        btnTorch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchTorch(isTorchOn);
                if (isTorchOn){

                    isTorchOn = false;
                    btnTorch.setText("TURN ON TORCH");
            }else {

                    isTorchOn = true;
                    btnTorch.setText("TURN OFF TORCH");
                }
                switchTorch(isTorchOn);
                }
        });
    }

    public void switchTorch(boolean status){
        try {
            cameraManager.setTorchMode(cameraID, status);
        }catch (Exception e){}

    }
}
package com.dhrubo.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtbody;
    Button btnSend;
    EditText edtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        txtbody = findViewById(R.id.txt_email_body);
        btnSend = findViewById(R.id.btn_send);
        edtInput = findViewById(R.id.edit_input);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/html");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, "ahmed.dhrubo@northsouth.edu");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "This is a the email subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT,edtInput.getText().toString());
                startActivity(emailIntent);
            }
        });
    }
}
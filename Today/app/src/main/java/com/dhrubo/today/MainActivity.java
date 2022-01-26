package com.dhrubo.today;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtDateTime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    txtDateTime = findViewById(R.id.txt_datetime);

 //   String dateTImeFormat = "MM/dd/yyyy hh:mm a";
 //     String dateTImeFormat = "MMM dd,yyyy h:mm aa";
     //   String dateTImeFormat = "MMMM dd,yyyy h:mm aa";
     //   String dateTImeFormat = "E, MMMM dd,yyyy h:mm:ss aa";
       // String dateTImeFormat = "EEEE, MMMM dd,yyyy h:mm:ss aa";


        Date date = Calendar.getInstance().getTime();
     //   txtDateTime.setText(DateFormat.format(dateTImeFormat,date));
        txtDateTime.setText(date.toString());
    }
}
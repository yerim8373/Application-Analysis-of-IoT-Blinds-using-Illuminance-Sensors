package com.cookandroid.aa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmActivity extends AppCompatActivity {

    private TimePicker tp_set_alarm;
    private ToggleButton tgbtn_blind_height;
    private CheckBox ck_mon, ck_tues, ck_wed, ck_thur, ck_fri, ck_sat, ck_sun;
    private Button btn_check_alarm, btn_cancel_alarm;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        tp_set_alarm = findViewById(R.id.tp_set_alarm);
        tgbtn_blind_height = findViewById(R.id.tgbtn_blind_height);

        ck_mon = findViewById(R.id.ck_mon);
        ck_tues = findViewById(R.id.ck_tues);
        ck_wed = findViewById(R.id.ck_wed);
        ck_thur = findViewById(R.id.ck_thur);
        ck_fri = findViewById(R.id.ck_fri);
        ck_sat = findViewById(R.id.ck_sat);
        ck_sun = findViewById(R.id.ck_sun);

        btn_check_alarm = findViewById(R.id.btn_check_alarm);
        btn_cancel_alarm =findViewById(R.id.btn_cancel_alarm);

        btn_check_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(AlarmActivity.this, ControlActivity.class);
//                startActivity(intent);
                finish();
            }
        });

        btn_cancel_alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(AlarmActivity.this, ControlActivity.class);
//                startActivity(intent);
                finish();
            }
        });
    }
}

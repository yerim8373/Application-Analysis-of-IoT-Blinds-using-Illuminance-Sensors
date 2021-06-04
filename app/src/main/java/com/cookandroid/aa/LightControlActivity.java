package com.cookandroid.aa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;

import androidx.appcompat.app.AppCompatActivity;

public class LightControlActivity extends AppCompatActivity {

    private EditText et_current_light;
    private NumberPicker np_light_select;
    private Button btn_check_light, btn_cancel_light;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_control);

        et_current_light = findViewById(R.id.et_current_light);
        np_light_select = findViewById(R.id.np_light_select);
        btn_check_light = findViewById(R.id.btn_check_light);
        btn_cancel_light =findViewById(R.id.btn_cancel_light);

        np_light_select.setMinValue(0);
        np_light_select.setMaxValue(10);
        np_light_select.setWrapSelectorWheel(false);

        btn_check_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LightControlActivity.this, ControlActivity.class);
                startActivity(intent);
            }
        });

        btn_cancel_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LightControlActivity.this, ControlActivity.class);
                startActivity(intent);
            }
        });

    }
}

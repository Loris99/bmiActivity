package com.example.bmi_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt_height;
    private EditText edt_weight;
    private TextView bmi_value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bmi_calulation();

    }

    private void bmi_calulation() {
        edt_height = findViewById(R.id.edt_height);
        edt_weight = findViewById(R.id.edt_weight);
        bmi_value = findViewById(R.id.bmi_value);
    }

    public void calculate_bmi(View view) {
        double height = Double.parseDouble(edt_height.getText().toString());
        double weight = Double.parseDouble(edt_weight.getText().toString());
        double result = weight / (weight * weight);
        String res = Double.toString(result);
        bmi_value.setText(res);
        bmi_value.setVisibility(View.VISIBLE);



    }
}

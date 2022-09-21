package com.example.widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButton1 = findViewById(R.id.radioButton1);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 = findViewById(R.id.radioButton3);
        ToggleButton toggleButton1 = findViewById(R.id.toggleButton1);

//        toggleButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if (isChecked) {}
//
//        }
    }

    public void onCheckedChanged(View view) {
        boolean checked = ((ToggleButton) view).isChecked();
        switch (view.getId()) {
            case R.id.toggleButton1:
                if (checked)
                    Toast.makeText(this, "ToggleButton is Enabled", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "ToggleButton is Disabled", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        //which checkbox was clicked
        switch (view.getId()){
            case R.id.checkBox1:
                if (checked)
                    Toast.makeText(this, "CheckBox1 has been clicked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "CheckBox1 has not been clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                if (checked)
                    Toast.makeText(this, "CheckBox2 has been clicked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "CheckBox2 has not been clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        //which radiobutton was clicked
        switch (view.getId()){
            case R.id.radioButton1:
                if (checked)
                    Toast.makeText(this, "radioButton1 has been clicked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "radioButton1 has not been clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButton2:
                if (checked)
                    Toast.makeText(this, "radioButton2 has been clicked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "radioButton2 has not been clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.radioButton3:
                if (checked)
                    Toast.makeText(this, "radioButton3 has been clicked", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(this, "radioButton3 has not been clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
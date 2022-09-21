package com.example.widgets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
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

}
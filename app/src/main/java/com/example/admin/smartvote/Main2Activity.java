package com.example.admin.smartvote;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.edit_Text);
                String text = editText.getText().toString();
                String textOne = "1111111111111";
                String textTwo = "2222222222222";
                boolean check = false;
                if ((text.equals(textOne)) || (text.equals(textTwo))) {
                    check = true;
                }
                if (editText.length() == 13) {
                    if (check == true) {
                        new AlertDialog.Builder(Main2Activity.this)
                                .setTitle("ผลการตตรวจสอบสิทธิ์เลือกตั้ง")
                                .setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง")
                                .setCancelable(false)
                                .setPositiveButton("OK", null).show();
                    } else {
                        new AlertDialog.Builder(Main2Activity.this)
                                .setTitle("ผลการตตรวจสอบสิทธิ์เลือกตั้ง")
                                .setMessage("คุณไม่มีสิทธิ์เลือกตั้ง")
                                .setCancelable(false)
                                .setPositiveButton("OK", null).show();
                    }
                } else {
                    Toast t = Toast.makeText(Main2Activity.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
    }
}

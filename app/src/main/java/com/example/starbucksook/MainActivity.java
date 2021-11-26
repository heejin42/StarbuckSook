package com.example.starbucksook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.start_activity_main_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String idtext;
//                String pwtext;
//
//                idtext=edit_id.getText().toString();
//                pwtext=edit_pw.getText().toString();

                //objTV.setText(idtext+"님 \n Book N Study에 오신 것을 환영합니다!");

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);

//                Bundle extras = new Bundle();
//                extras.putString("id", idtext);
//                extras.putString("pw", pwtext);

//                intent.putExtras(extras);
                startActivity(intent);

            }
        });

    }
}


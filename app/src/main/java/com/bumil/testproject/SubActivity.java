package com.bumil.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        String userId = intent.getStringExtra("userId");

        /*
        if(userId.equals(""))aa
            Toast.makeText(this, "입력한 아이디가 없습니다!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "입력한 아이디는"+ userId + " 입니다.", Toast.LENGTH_SHORT).show();
         */

        Person person = (Person) intent.getSerializableExtra("신상");

        Toast.makeText(this, person.toString(), Toast.LENGTH_SHORT).show();
    }

    public void onClick(View view) {
        finish();
    }
}

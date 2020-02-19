package com.bumil.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "토스트토스트 테스트", Toast.LENGTH_LONG).show();
        //Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        //vibrator.vibrate(3000);

        EditText editId = (EditText) findViewById(R.id.edit_id);
        EditText editPassword = (EditText) findViewById(R.id.edit_password);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        //editId.setText(">_<");
        //editId.setTextColor(0xFFFF0000);
        //editId.setTextSize(TypedValue.COMPLEX_UNIT_SP, 70);
    }

    public void onClick(View view) {

        switch (view.getId()){

            case R.id.edit_id:
                break;

            case R.id.edit_password:
                break;

            case R.id.btn_login:
                //Toast.makeText(this, "'종료'버튼을 누르시면 홈화면으로 돌아갑니다.", Toast.LENGTH_SHORT).show();
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(500);

                EditText editId = (EditText) findViewById(R.id.edit_id);
                String id = editId.getText().toString();

                //인텐트에 사용자 정의 클래스를 넣어 두번째 액티비티에 보낸다.
                Intent intent = new Intent(this, SubActivity.class);
                intent.putExtra("신상", new Person("래리 페이지", "남성", "구글"));
                intent.putExtra("userId", id);
                //startActivity(intent);
                startActivityForResult(intent, 0);
                break;
        }
    }
}

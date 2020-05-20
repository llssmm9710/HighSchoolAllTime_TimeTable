package com.example.highschoolalltime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_hom, btn_timetable, btn_cafeteria, btn_bullentin_board, btn_my_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hom = findViewById(R.id.btn_1);//어플 메인 화면으로  이동 버튼
        btn_timetable = findViewById(R.id.btn_2);//시간표 화면으로  이동 버튼
        btn_cafeteria = findViewById(R.id.btn_3);//급식표 화면으로  이동 버튼
        btn_bullentin_board = findViewById(R.id.btn_4);//게시판 화면으로 이동 버튼
        btn_my_page = findViewById(R.id.btn_5);//My Page 화면으로 이동 버튼


        btn_timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//시간표 화면 담당자로 버튼2번만 구현
                Intent intent = new Intent(MainActivity.this, AddTimeTableActivity.class);//시간표 화면을 구성할 Activity를 따로 생성하였으며 시간표 화면으로 이동하기 위한 버튼을 클릭 시 화면을 전환하기 위해 이동할 Activity를 정의
                startActivity(intent);//정의한 Activity 시작
            }
        });
    }
}

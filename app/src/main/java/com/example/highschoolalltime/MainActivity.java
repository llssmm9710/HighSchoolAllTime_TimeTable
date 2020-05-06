package com.example.highschoolalltime;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button btn_hom, btn_timetable, btn_cafeteria, btn_bullentin_board, btn_my_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_hom = findViewById(R.id.btn_1);
        btn_timetable = findViewById(R.id.btn_2);
        btn_cafeteria = findViewById(R.id.btn_3);
        btn_bullentin_board = findViewById(R.id.btn_4);
        btn_my_page = findViewById(R.id.btn_5);


        btn_timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeTableActivity.class);
                startActivity(intent);
            }
        });
    }
}

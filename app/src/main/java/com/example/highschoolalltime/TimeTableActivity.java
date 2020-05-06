package com.example.highschoolalltime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.sql.Time;

public class TimeTableActivity extends AppCompatActivity {

    private Button add;
    public Spinner day, time;
    String result[] = {"m", "tu", "w", "t", "f"};
    String[] re_day, re_time;
    String sub, text;
    TextView subject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        add = findViewById(R.id.btn_add);
        day = findViewById(R.id.sp_day);
        time = findViewById(R.id.sp_time);
        re_day = getResources().getStringArray(R.array.day);
        re_time = getResources().getStringArray(R.array.time);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub = "tv_result_";

                text = day.getSelectedItem().toString();
                for(int i = 0; i < re_day.length; i++){if(text.equals(re_day[i])){sub = sub + result[i];}}
                text = time.getSelectedItem().toString();
                for(int i = 0; i < re_time.length; i++){if(text.equals(re_time[i])){sub = sub + re_time[i];}}

                switch (sub){
                    case "tv_result_m1":
                        subject = findViewById(R.id.tv_result_m1); break;
                    case "tv_result_m2":
                        subject = findViewById(R.id.tv_result_m2); break;
                    case "tv_result_m3":
                        subject = findViewById(R.id.tv_result_m3); break;
                    case "tv_result_m4":
                        subject = findViewById(R.id.tv_result_m4); break;
                    case "tv_result_m5":
                        subject = findViewById(R.id.tv_result_m5); break;
                    case "tv_result_m6":
                        subject = findViewById(R.id.tv_result_m6); break;
                    case "tv_result_m7":
                        subject = findViewById(R.id.tv_result_m7); break;

                    case "tv_result_tu1":
                        subject = findViewById(R.id.tv_result_tu1); break;
                    case "tv_result_tu2":
                        subject = findViewById(R.id.tv_result_tu2); break;
                    case "tv_result_tu3":
                        subject = findViewById(R.id.tv_result_tu3); break;
                    case "tv_result_tu4":
                        subject = findViewById(R.id.tv_result_tu4); break;
                    case "tv_result_tu5":
                        subject = findViewById(R.id.tv_result_tu5); break;
                    case "tv_result_tu6":
                        subject = findViewById(R.id.tv_result_tu6); break;
                    case "tv_result_tu7":
                        subject = findViewById(R.id.tv_result_tu7); break;

                    case "tv_result_w1":
                        subject = findViewById(R.id.tv_result_w1); break;
                    case "tv_result_w2":
                        subject = findViewById(R.id.tv_result_w2); break;
                    case "tv_result_w3":
                        subject = findViewById(R.id.tv_result_w3); break;
                    case "tv_result_w4":
                        subject = findViewById(R.id.tv_result_w4); break;
                    case "tv_result_w5":
                        subject = findViewById(R.id.tv_result_w5); break;
                    case "tv_result_w6":
                        subject = findViewById(R.id.tv_result_w6); break;
                    case "tv_result_w7":
                        subject = findViewById(R.id.tv_result_w7); break;

                    case "tv_result_t1":
                        subject = findViewById(R.id.tv_result_t1); break;
                    case "tv_result_t2":
                        subject = findViewById(R.id.tv_result_t2); break;
                    case "tv_result_t3":
                        subject = findViewById(R.id.tv_result_t3); break;
                    case "tv_result_t4":
                        subject = findViewById(R.id.tv_result_t4); break;
                    case "tv_result_t5":
                        subject = findViewById(R.id.tv_result_t5); break;
                    case "tv_result_t6":
                        subject = findViewById(R.id.tv_result_t6); break;
                    case "tv_result_t7":
                        subject = findViewById(R.id.tv_result_t7); break;

                    case "tv_result_f1":
                        subject = findViewById(R.id.tv_result_f1); break;
                    case "tv_result_f2":
                        subject = findViewById(R.id.tv_result_f2); break;
                    case "tv_result_f3":
                        subject = findViewById(R.id.tv_result_f3); break;
                    case "tv_result_f4":
                        subject = findViewById(R.id.tv_result_f4); break;
                    case "tv_result_f5":
                        subject = findViewById(R.id.tv_result_f5); break;
                    case "tv_result_f6":
                        subject = findViewById(R.id.tv_result_f6); break;
                    case "tv_result_f7":
                        subject = findViewById(R.id.tv_result_f7); break;
                }

                AlertDialog.Builder ad = new AlertDialog.Builder(TimeTableActivity.this);
                ad.setIcon(R.mipmap.ic_launcher);
                ad.setTitle("과목 추가");
                ad.setMessage("과목 명");

                final EditText et = new EditText((TimeTableActivity.this));
                ad.setView(et);

                ad.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String reText = et.getText().toString();
                        subject.setText(reText);
                        dialog.dismiss();
                    }
                });

                ad.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                ad.show();
            }
        });
    }
}

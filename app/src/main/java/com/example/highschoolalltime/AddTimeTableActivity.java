package com.example.highschoolalltime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
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

public class AddTimeTableActivity extends AppCompatActivity {

    private Button add;
    String result[] = {"m", "tu", "w", "t", "f"};
    String[] re_day, re_time;
    String sub, text;
    TextView tv_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        add = findViewById(R.id.btn_add);
        re_day = getResources().getStringArray(R.array.day);
        re_time = getResources().getStringArray(R.array.time);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }
    void show(){
        re_day = getResources().getStringArray(R.array.day);
        re_time = getResources().getStringArray(R.array.time);

        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_add, null);
        ad.setView(view);
        final Button submit = (Button) view.findViewById(R.id.buttonSubmit);
        final Button done = (Button) view.findViewById(R.id.buttonDone);
        final EditText subject = (EditText) view.findViewById(R.id.edittextSubject);
        final Spinner day = (Spinner) view.findViewById(R.id.edittextDay);
        final Spinner time = (Spinner) view.findViewById(R.id.edittextTime);

        final AlertDialog dialog = ad.create();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub_text = subject.getText().toString();

                sub = "tv_result_";

                text = day.getSelectedItem().toString();
                for(int i = 0; i < re_day.length; i++){if(text.equals(re_day[i])){sub = sub + result[i];}}
                text = time.getSelectedItem().toString();
                for(int i = 0; i < re_time.length; i++){if(text.equals(re_time[i])){sub = sub + re_time[i];}}

                switch (sub){
                    case "tv_result_m1":
                        tv_result = findViewById(R.id.tv_result_m1); break;
                    case "tv_result_m2":
                        tv_result = findViewById(R.id.tv_result_m2); break;
                    case "tv_result_m3":
                        tv_result = findViewById(R.id.tv_result_m3); break;
                    case "tv_result_m4":
                        tv_result = findViewById(R.id.tv_result_m4); break;
                    case "tv_result_m5":
                        tv_result = findViewById(R.id.tv_result_m5); break;
                    case "tv_result_m6":
                        tv_result = findViewById(R.id.tv_result_m6); break;
                    case "tv_result_m7":
                        tv_result = findViewById(R.id.tv_result_m7); break;

                    case "tv_result_tu1":
                        tv_result = findViewById(R.id.tv_result_tu1); break;
                    case "tv_result_tu2":
                        tv_result = findViewById(R.id.tv_result_tu2); break;
                    case "tv_result_tu3":
                        tv_result = findViewById(R.id.tv_result_tu3); break;
                    case "tv_result_tu4":
                        tv_result = findViewById(R.id.tv_result_tu4); break;
                    case "tv_result_tu5":
                        tv_result = findViewById(R.id.tv_result_tu5); break;
                    case "tv_result_tu6":
                        tv_result = findViewById(R.id.tv_result_tu6); break;
                    case "tv_result_tu7":
                        tv_result = findViewById(R.id.tv_result_tu7); break;

                    case "tv_result_w1":
                        tv_result = findViewById(R.id.tv_result_w1); break;
                    case "tv_result_w2":
                        tv_result = findViewById(R.id.tv_result_w2); break;
                    case "tv_result_w3":
                        tv_result = findViewById(R.id.tv_result_w3); break;
                    case "tv_result_w4":
                        tv_result = findViewById(R.id.tv_result_w4); break;
                    case "tv_result_w5":
                        tv_result = findViewById(R.id.tv_result_w5); break;
                    case "tv_result_w6":
                        tv_result = findViewById(R.id.tv_result_w6); break;
                    case "tv_result_w7":
                        tv_result = findViewById(R.id.tv_result_w7); break;

                    case "tv_result_t1":
                        tv_result = findViewById(R.id.tv_result_t1); break;
                    case "tv_result_t2":
                        tv_result = findViewById(R.id.tv_result_t2); break;
                    case "tv_result_t3":
                        tv_result = findViewById(R.id.tv_result_t3); break;
                    case "tv_result_t4":
                        tv_result = findViewById(R.id.tv_result_t4); break;
                    case "tv_result_t5":
                        tv_result = findViewById(R.id.tv_result_t5); break;
                    case "tv_result_t6":
                        tv_result = findViewById(R.id.tv_result_t6); break;
                    case "tv_result_t7":
                        tv_result = findViewById(R.id.tv_result_t7); break;

                    case "tv_result_f1":
                        tv_result = findViewById(R.id.tv_result_f1); break;
                    case "tv_result_f2":
                        tv_result = findViewById(R.id.tv_result_f2); break;
                    case "tv_result_f3":
                        tv_result = findViewById(R.id.tv_result_f3); break;
                    case "tv_result_f4":
                        tv_result = findViewById(R.id.tv_result_f4); break;
                    case "tv_result_f5":
                        tv_result = findViewById(R.id.tv_result_f5); break;
                    case "tv_result_f6":
                        tv_result = findViewById(R.id.tv_result_f6); break;
                    case "tv_result_f7":
                        tv_result = findViewById(R.id.tv_result_f7); break;
                }
                tv_result.setText(sub_text);

                dialog.dismiss();
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}

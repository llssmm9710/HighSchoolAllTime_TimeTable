package com.example.highschoolalltime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AddTimeTableActivity extends AppCompatActivity {

    private Button add;//추가버튼
    String result[] = {"m", "tu", "w", "t", "f"};//String을 이용해 데이터 저장 할 위치값 찾을 시 추가할 문자열
    String[] re_day, re_time;//Spiner값을 비교할 배열
    String sub, text;//TextView ID값과 입력한 데이터를 갖을 임시 변수
    TextView tv_result;//Edit Text로 입력 받은 데이터를 삽입할 TextView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        add = findViewById(R.id.btn_add);//버튼 아이디 값 불러오기
        re_day = getResources().getStringArray(R.array.day);//Spiner의 값을 비교할 변수 불러오기
        re_time = getResources().getStringArray(R.array.time);//Spiner의 값을 비교할 변수 불러오기

        add.setOnClickListener(new View.OnClickListener() {//버튼 클릭 이벤트
            @Override
            public void onClick(View v) {
                show();//데이터 입력 화면으로 전환하는 함수
            }
        });
    }
    void show(){
        //re_day = getResources().getStringArray(R.array.day);
        //re_time = getResources().getStringArray(R.array.time);

        AlertDialog.Builder ad = new AlertDialog.Builder(this);//데이터를 입력받을 화면 다이얼로그로 띄우기 위한 Builder
        LayoutInflater inflater = getLayoutInflater();//다이얼로그 내 띄울 Layout 불러오기
        View view = inflater.inflate(R.layout.dialog_add, null);
        ad.setView(view);//불러온 Layout을 다이얼로그에 띄우기
        final Button submit = (Button) view.findViewById(R.id.buttonSubmit);//다이얼로그 내 버튼 ID정의(Posivive<확인> 버튼)
        final Button done = (Button) view.findViewById(R.id.buttonDone);//다이얼로그 내 버튼 ID정의(Negative<취소> 버튼)
        final EditText subject = (EditText) view.findViewById(R.id.edittextSubject);//과목명을 입력받을 Edit Text ID 정의
        final Spinner day = (Spinner) view.findViewById(R.id.edittextDay);//요일 입력받을 Spiner ID 정의
        final Spinner time = (Spinner) view.findViewById(R.id.edittextTime);//수업시간 입력받을 Spiner ID 정의

        final AlertDialog dialog = ad.create();//다이얼로그 생성
        submit.setOnClickListener(new View.OnClickListener() {//Positive(확인) 버튼
            @Override
            public void onClick(View v) {
                String sub_text = subject.getText().toString();//Edit Text 임시 저장 변수

                sub = "tv_result_";//TextView ID값을 String으로 비교하기 위한 임시 문자열 변수 초기화

                text = day.getSelectedItem().toString();//Sriner로 입력받은 요일 임시 저장
                for(int i = 0; i < re_day.length; i++){if(text.equals(re_day[i])){sub = sub + result[i];}}//for문을 이용해 반복적으로 임시 저장한 요일 값을 요일 배열과 비교해 참인 경우 초기화 했던 문자열 뒤에 추가
                text = time.getSelectedItem().toString();//Sriner로 입력받은 수강시간 임시 저장
                for(int i = 0; i < re_time.length; i++){if(text.equals(re_time[i])){sub = sub + (i+1);}}//for문을 이용해 반복적으로 임시 저장한 수강시간 값을 요일 배열과 비교해 참인 경우 문자열 뒤에 추가

                switch (sub){//Switch문을 이용해 문자열과 Layout 내 TextView ID 값들과 비교해 TextView ID값을 정의, <m:월, t:화, w:수, tu:목, f:금>, 문자열 제일 뒤는 수강 시간으로 ID값을 지정
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
                tv_result.setText(sub_text);//Switch문으로 지정한 TextView에 입력받은 과목명을 삽입

                dialog.dismiss();//다이얼로그 종료
            }
        });
        done.setOnClickListener(new View.OnClickListener() {//Negative<취소> 버튼
            @Override
            public void onClick(View v) {
                dialog.dismiss();//<취소> 버튼을 클릭 시 값을 입력 받았음에도 아무런 동작 없이 다이얼로그 종료
            }
        });
        dialog.show();//다이얼로그 화면에 띄우는 함수
    }
}

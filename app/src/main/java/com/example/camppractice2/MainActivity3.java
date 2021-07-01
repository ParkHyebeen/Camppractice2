package com.example.camppractice2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText et1, et2, et3;
    TextView textview1, textview2, textview3 ;
    CheckBox checkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        

        et1 = findViewById(R.id.etAme);
        et2 = findViewById(R.id.etCala);
        et3 = findViewById(R.id.etCamo);
        textview1 = findViewById(R.id.txtNum);
        textview2 = findViewById(R.id.txtDc);
        textview3 = findViewById(R.id.txtSum);
        checkbox = findViewById(R.id.checkBox);



    }

    public void onBBB(View view) {

        //1.아메리카노 개수 가져와서 * 1000
        String ame= et1.getText().toString();
        int iame = Integer.parseInt(ame);

        int cost1= iame*1000;

        //2.카페라떼 개수 가져와서 * 1500
        String cala= et2.getText().toString();
        int icala = Integer.parseInt(cala);

        int cost2= icala*1500;

        //3.카페모카 개수 가져와서 * 1700
        String camo= et3.getText().toString();
        int icamo = Integer.parseInt(camo);

        int cost3= icala*1700;

        //4.sum = 위에 금액 합계
        int num = iame+ icala + icamo ;
        int sum= cost1+ cost2 + cost3;

        //5.체크박스 안 눌렀을 경우 dc = 0 / 눌렀을 경우 dc = sum * 0.1
        double dc=0;
        if(checkbox.isChecked() == true) dc=sum*0.1;

        //6.버튼 누르면 주문 개수 / 할인금액 (dc) / 결제금액 (sum-dc) 보여주기

        double ssum;
        ssum=sum-dc;
        textview1.setText("주문개수: " + num +"개");
        textview2.setText("할인금액: " + (int)dc +"원");
        textview3.setText("결제금액: " + (int)ssum +"원");



    }
}
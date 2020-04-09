package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btnC,btnCE,btnBS,btnChia,btn7,btn8,btn9,btnNhan,btn4,btn5,btn6,btnTru,btn1,btn2,btn3,btnCong,btnAm,btnKhong,btnCham,btnBang;
    TextView tvInput,tvOutput;
    String xuli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnKhong=findViewById(R.id.btnKhong);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnAm=findViewById(R.id.btnAm);
        btnCham=findViewById(R.id.btnCham);
        btnBang=findViewById(R.id.Bang);
        btnCE=findViewById(R.id.btnCE);
        btnC=findViewById(R.id.btnC);
        btnBS=findViewById(R.id.btnBS);
        btnChia=findViewById(R.id.btnChia);
        btnNhan=findViewById(R.id.btnNhan);
        btnTru=findViewById(R.id.btnTru);
        btnCong=findViewById(R.id.btnCong);

        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });
        btnKhong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"9");
            }
        });
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"+");
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"-");
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"*");
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+"/");
            }
        });
        btnCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+".");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              tvOutput.setText("0");
            tvInput.setText("");
            }
        });
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                if(xuli=="") tvInput.setText("");
                else
                    tvInput.setText(xuli.substring(0,xuli.length()-1));
            }
        });
        btnBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli = tvInput.getText().toString();
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String ketqua="";
                try{
                    Scriptable scriptable = rhino.initSafeStandardObjects();
                    ketqua = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();

                }
                catch (Exception e){
                    ketqua ="0";
                }
                tvOutput.setText(ketqua);
            }
        });

    }
}

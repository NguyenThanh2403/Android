package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnCE,btnBS,btnChia,btn7,btn8,btn9,btn4,btn5,btn6,btnTru,btn1,btn2,btn3,btnCong,btnAm,btn0,btnCham;
    TextView tvInput,tvOutput;
    String xuli;
    List<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = new ArrayList<>();
        for(int i = 0;i < 20 ;i++)
                items.add("Tien" + (i+1));
        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                items
                );
        Spinner spinner = findViewById(R.id.Math1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,items.get(position),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner.setAdapter(adapter);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnCham=findViewById(R.id.btnCham);
        btnCE=findViewById(R.id.btnCE);
        btnBS=findViewById(R.id.btnBS);
        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvOutput.setText("0");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                if (xuli.equals("0")==true) tvInput.setText("0");
                else tvInput.setText(xuli + "0");
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

        btnCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                tvInput.setText(xuli+".");
            }
        });

        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                if(xuli.equals("")==true) tvInput.setText("0");
                else  if(xuli.equals("0")==true)tvInput.setText("0");
                else if(xuli.length()==1)tvInput.setText("0");
                else tvInput.setText(xuli.substring(0,xuli.length()-1));
            }
        });
        btnAm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuli=tvInput.getText().toString();
                if(xuli.substring(0,1).equals("-")==false) {tvInput.setText("-"+xuli);}
                else if(xuli.substring(0,1).equals("-")==true) {tvInput.setText(xuli.substring(1,xuli.length()));}
            }
        });

    }
}

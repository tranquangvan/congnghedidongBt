package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText etNumber1;
    EditText etNumber2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.idResult);
        etNumber1 = (EditText)findViewById(R.id.idNumber1);
        etNumber2 = (EditText)findViewById(R.id.idNumber2);

    }

    public void onAdd(View view) {
        int number1 = Integer.parseInt(etNumber1.getText().toString());
        int number2 = Integer.parseInt(etNumber2.getText().toString());
        int sum = number1 + number2;
        textView.setText("Result is "+sum);
    }

    public void onSub(View view) {
        int number1 = Integer.parseInt(etNumber1.getText().toString());
        int number2 = Integer.parseInt(etNumber2.getText().toString());
        int sub = number1 - number2;
        textView.setText("Result is "+sub);
    }

    public void onMul(View view) {
        int number1 = Integer.parseInt(etNumber1.getText().toString());
        int number2 = Integer.parseInt(etNumber2.getText().toString());
        int mul = number1 * number2;
        textView.setText("Result is "+mul);
    }

    public void onDiv(View view) {
        int number1 = Integer.parseInt(etNumber1.getText().toString());
        int number2 = Integer.parseInt(etNumber2.getText().toString());
        int div = number1/number2;
        textView.setText("Result is "+div);
    }
}
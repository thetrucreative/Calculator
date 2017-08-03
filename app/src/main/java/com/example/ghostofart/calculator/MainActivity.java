package com.example.ghostofart.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener
{
    private Button btnAdd, btnSub, btnDivide, btnMul;
    private TextView result;
    private EditText firstNum, SecondNum;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }

    private void initialise()
    {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSubtract);
        btnMul = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        firstNum = (EditText) findViewById(R.id.FirstNumber);
        SecondNum = (EditText) findViewById(R.id.SecondNumber);
        result = (TextView) findViewById(R.id.result);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDivide.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        String num1 = firstNum.getText().toString();
        String num2 = SecondNum.getText().toString();

        switch (view.getId())
        {
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnMultiply:
                try
                {
                    int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                    result.setText(String.valueOf(multiplication));
                }
                catch (Exception e)
                {
                    result.setText("Sorry, Cannot Multiply!!");
                }
                break;
            case R.id.btnDivide:
                try
                {
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    result.setText(String.valueOf(division));
                }
                catch (Exception e)
                {
                    result.setText("Sorry, Cannot Divide!!");
                }

                break;

        }
    }
}

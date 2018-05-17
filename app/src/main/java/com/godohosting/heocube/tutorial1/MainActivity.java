package com.godohosting.heocube.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R. id.result);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());

        result.setText(Integer.toString(n1+n2));
    }
    public void subClick(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R. id.result);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());

        result.setText(Integer.toString(n1-n2));
    }

    public void multiClick(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R. id.result);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());

        result.setText(Integer.toString(n1*n2));
    }
    public void divideClick(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R. id.result);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());

        result.setText(Integer.toString(n1/n2));
    }

}

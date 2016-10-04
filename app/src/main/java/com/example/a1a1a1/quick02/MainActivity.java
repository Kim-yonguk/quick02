package com.example.a1a1a1.quick02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int countnum=0;
    private int max=100;
    private int min=0;
    private int num=0;
    Random ran=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onclick_send(View view)
    {
        TextView textView=(TextView) findViewById(R.id.Text_result);
        num=ran.nextInt(100);

        String str="Your number is " + String.valueOf(num) +"?";
        textView.setText(str);

    }
    public void onclick_bigger(View view)
    {
        min=num;
        countnum++;

        TextView textView = (TextView) findViewById(R.id.Text_result);

        num=(min+max)/2;

        String str="Your number is " + String.valueOf(num) +"?";
        textView.setText(str);
    }
    public void onclick_smaller(View view)
    {
        max=num;
        countnum++;
        TextView textView = (TextView) findViewById(R.id.Text_result);

        num=(min+max)/2;

        String str="Your number is " + String.valueOf(num) +"  ?  ";
        textView.setText(str);
    }
    public void onclick_bingo(View view)
    {
        TextView textView = (TextView) findViewById(R.id.Text_result);
        String str = "Bingo " + String.valueOf(num) +" is your number!" +"\n"+"your counter is "+countnum;
        textView.setText(str);
    }
}

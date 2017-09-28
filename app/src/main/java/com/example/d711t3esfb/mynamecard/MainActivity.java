package com.example.d711t3esfb.mynamecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int i=1;
    public void onClickButton(View view){

        if(i%2==1) {
            TextView textView = (TextView) findViewById(R.id.textView3);
            textView.setText("げり");
            i++;
        }else{
            TextView textView = (TextView) findViewById(R.id.textView3);
            textView.setText("上野颯樹");
            i++;
        }
    }
}

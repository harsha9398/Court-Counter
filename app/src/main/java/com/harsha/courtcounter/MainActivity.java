package com.harsha.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count;
    TextView team1;
    TextView team2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team2 = (TextView)findViewById(R.id.team2);
        team1 = (TextView)findViewById(R.id.team1);
    }
    public void point3(View view){
      count = Integer.parseInt(team1.getText().toString());
      team1.setText(Integer.toString(count+3));
    }
    public void point2(View view){
        count = Integer.parseInt(team1.getText().toString());
        team1.setText(Integer.toString(count+2));
    }
    public void freeThrow(View view){
        count = Integer.parseInt(team1.getText().toString());
        team1.setText(Integer.toString(count+1));
    }
    public void rPoint3(View view){
        count = Integer.parseInt(team2.getText().toString());
        team2.setText(Integer.toString(count+3));
    }
    public void rPoint2(View view){
        count = Integer.parseInt(team2.getText().toString());
        team2.setText(Integer.toString(count+2));
    }
    public void rFreeThrow(View view){
        count = Integer.parseInt(team2.getText().toString());
        team2.setText(Integer.toString(count+1));
    }
    public void reset(View view){
        int count1 = Integer.parseInt(team1.getText().toString());
        int count2 = Integer.parseInt(team2.getText().toString());
        team1.setText(Integer.toString(count1-count1));
        team2.setText(Integer.toString(count2-count2));
    }

}

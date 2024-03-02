package com.example.attendance;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b ;
    CheckBox rn1,rn2,rn3,rn4,rn5,rn6,rn7,rn8,rn9,rn10,rn11,rn12,rn13,rn14,rn15,rn16,rn17,rn18,rn19,rn20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.sub);
        rn1=findViewById(R.id.enr1);
        rn2=findViewById(R.id.enr2);
        rn3=findViewById(R.id.enr3);
        rn4=findViewById(R.id.enr4);
        rn5=findViewById(R.id.enr5);
        rn6=findViewById(R.id.enr6);
        rn7=findViewById(R.id.enr7);
        rn8=findViewById(R.id.enr8);
        rn9=findViewById(R.id.enr9);
        rn10=findViewById(R.id.enr1);
        rn11=findViewById(R.id.enr11);
        rn12=findViewById(R.id.enr12);
        rn13=findViewById(R.id.enr13);
        rn14=findViewById(R.id.enr14);
        rn15=findViewById(R.id.enr15);
        rn16=findViewById(R.id.enr16);
        rn17=findViewById(R.id.enr17);
        rn18=findViewById(R.id.enr18);
        rn19=findViewById(R.id.enr19);
        rn20=findViewById(R.id.enr2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView textView = (TextView) findViewById(R.id.textview);

                String present = "";
                String absent = "";
                if(rn1.isChecked()) {
                    absent += "1" + " ";
                } else {
                    absent += "1" + " ";
                }
                if(rn2.isChecked()) {
                    present += " 2 " + " ";
                } else {
                    absent += "2" + " ";

                }
                if(rn3.isChecked()) {
                    present += " 3 " + " ";
                } else {
                    absent += "3" + " ";

                }
                if(rn4.isChecked()) {
                    present += " 4" + " ";
                } else {
                    absent += "4" + " ";

                }
                if(rn5.isChecked()) {
                    present += " 5" + " ";
                } else {
                    absent += "5"+ " ";

                }
                if(rn6.isChecked()) {
                    present += " 6" + " ";
                } else {
                    absent += "6"+ " ";

                }
                if(rn7.isChecked()) {
                    present += " 7"+ " ";
                } else {
                    absent += "7"+ " ";

                }
                if(rn8.isChecked()) {
                    present += " 8" + " ";
                } else {
                    absent += "8"+ " ";

                }
                if(rn9.isChecked()) {
                    present += " 9" + " ";
                } else {
                    absent += "9"+ " ";
                   
                }
                if(rn1.isChecked()) {
                    present += " 1"+ " ";
                } else {
                    absent += "1"+ " ";

                }
                if(rn11.isChecked()) {
                    present += " 11" + " ";
                } else {
                    absent += "11"+ " ";

                }
                if(rn12.isChecked()) {
                    present += " 12"+ " ";
                } else {
                    absent += "12"+ " ";

                }
                if(rn13.isChecked()) {
                    present += " 13" + " ";
                } else {
                    absent += "13"+ " ";

                }
                if(rn14.isChecked()) {
                    present += " 14" + " ";
                } else {
                    absent += "14"+ " ";

                }
                if(rn15.isChecked()) {
                    present += " 15" + " ";
                } else {
                    absent += "15"+ " ";

                }
                if(rn16.isChecked()) {
                    present += " 16" + " ";
                } else {
                    absent += "15"+ " ";

                }
                if(rn17.isChecked()) {
                    present += " 17" + " ";
                } else {
                    absent += "17"+ " ";

                }
                if(rn18.isChecked()) {
                    present += " 18" + " ";
                } else {
                    absent += "18"+ " ";

                }
                if(rn19.isChecked()) {
                    present += " 19" + " ";
                } else {
                    absent += "19"+ " ";

                }
                if(rn2.isChecked()) {
                    present += " 2" + " ";
                } else {
                    absent += "2"+ " ";

                }
                // Toast is created to display the
                // message using show() method.
//                Toast.makeText(MainActivity.this,  t + "are Present", Toast.LENGTH_SHORT).show();
                textView.setText(present + " are Present\n");
                textView.setText(absent + " are Present");

                Bundle b = new Bundle();
                b.putString("present",present);
                b.putString("absent",absent);
                Intent intent = new Intent(MainActivity.this,fetch.class);
                intent.putExtras(b);
                startActivity(intent);
                present = "";
                absent = "";
            }
        });
    }
}
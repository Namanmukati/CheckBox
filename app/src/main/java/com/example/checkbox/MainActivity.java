package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5;
    Button btn,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();

    }
    public void addListenerOnButtonClick(){
        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        btn = (Button) findViewById(R.id.button);

        //Applying the Listener on Button click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items : ");
                if (cb1.isChecked()){
                    result.append("\npizza 100Rs");
                    totalAmount+=100;
                }
                if (cb2.isChecked()){
                    result.append("/nCofee 50Rs");
                    totalAmount+=50;
                }
                if (cb3.isChecked()){
                    result.append("\nBurger 200Rs");
                    totalAmount+=200;
                }
                result.append("\n Total :"+totalAmount +"Rs");
                //Displey the message on the toast
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
                }




                }

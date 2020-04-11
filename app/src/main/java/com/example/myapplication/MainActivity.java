package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button LogIn;
    private  int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "kiran", Toast.LENGTH_SHORT).show();

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Info=(TextView)findViewById(R.id.tvInfo);
        LogIn=(Button)findViewById(R.id.btnLogIn);

        Info.setText("No.of attempts :5");

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "kiran", Toast.LENGTH_SHORT).show();
                validate(Name.getText().toString(),Password.getText().toString());
            }

        });





    }
    private void validate(String UserName,String UserPassword){
        if((UserName=="Admin")&&(UserPassword=="1234"))
        {
            Intent intent = new Intent(MainActivity.this,Second.class);
            startActivity(intent);
        }
            else
                {
                counter--;
                Info.setText("No.of attempts:" +String.valueOf(counter));
                if(counter==0)
                {
                    LogIn.setEnabled(false);
                }

        }
    }
}

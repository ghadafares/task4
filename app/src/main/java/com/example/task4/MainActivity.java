package com.example.task4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements exampleDialog.exampleDialogListener{
    TextView tv_password,tv_username;
    Button btn_open;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_password=findViewById(R.id.tv_password);
        tv_username=findViewById(R.id.tv_username);
        btn_open=findViewById(R.id.btn_open);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }

            public void openDialog() {
            exampleDialog exampleDialog=new exampleDialog();
            exampleDialog.show(getSupportFragmentManager(),"exampleDialog");
            }

        });

    }

    @Override
    public void applyTexts(String username, String password) {
        tv_username.setText(username);
        tv_password.setText(password);
    }
}
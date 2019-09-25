package com.example.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText surname,password;
    private Button entry,quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        surname = findViewById(R.id.edt_name);
        password = findViewById(R.id.edt_password);
        entry = findViewById(R.id.btn_login);
        quit = findViewById(R.id.btn_return);

        entry.setOnClickListener(this);
        quit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_return:
                finish();
                break;
        }
    }

    private void login() {
        String userName = surname.getText().toString();
        String password1 = password.getText().toString();
        if (userName.equals("")&&password1.equals("")){
            Toast.makeText(MainActivity.this,"请输入用户名和密码",Toast.LENGTH_LONG).show();
            surname.setText("");
            password.setText("");
        }else {
            Intent intent = new Intent(MainActivity.this,One.class);
            intent.putExtra("name","欢迎"+userName+"来到您的空间");
            startActivity(intent);
        }
    }
}

package cn.goal.chat;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cn.goal.chat.util.DisplayUtil;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    public TextView register;
    public Button login;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DisplayUtil.setTranslucentStatus(this);

        init();
    }
    public void init() {
        register= (TextView) findViewById(R.id.register);
        register.setOnClickListener(this);
        login= (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register:
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.login:
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
                break;
            default:
                break;

        }
    }
}

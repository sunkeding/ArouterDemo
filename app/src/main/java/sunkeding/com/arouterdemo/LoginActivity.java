package sunkeding.com.arouterdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import sunkeding.com.arouterdemo.app.MyApp;
import sunkeding.com.arouterdemo.implicitjump.util.RouterJumpUtil;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc LoginActivity
 */
public class LoginActivity extends Activity {
    String routerUrl = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            routerUrl = extras.getString("routerUrl");
        }
    }

    public void login(View view) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        MyApp.isLogon = true;
        if (!TextUtils.isEmpty(routerUrl)) {
            RouterJumpUtil.goRouter(this, routerUrl);
        }
        finish();
    }
}

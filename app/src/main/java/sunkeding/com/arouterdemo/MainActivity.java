package sunkeding.com.arouterdemo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

import sunkeding.com.arouterdemo.constant.RouterPathConsatnt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. 应用内简单的跳转(通过URL跳转在'进阶用法'中)
                ARouter.getInstance().build(RouterPathConsatnt.CIRCLE_HOME_ROUTER).navigation();
            }
        });
        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri testUriMix = Uri.parse("arouter://m.aliyun.com" + RouterPathConsatnt.COACH_HOME_ROUTER);
                Bundle bundle = new Bundle();
                bundle.putString("value","skd");
                ARouter.getInstance().build(testUriMix).with(bundle).navigation();
            }
        });
        findViewById(R.id.bt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance()
                        .build("/test/webview")
                        .withString("url", "file:///android_asset/schame-test.html")
                        .navigation();
            }
        });
    }
}

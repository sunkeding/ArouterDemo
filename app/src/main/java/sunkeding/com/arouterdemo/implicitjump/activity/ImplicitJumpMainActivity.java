package sunkeding.com.arouterdemo.implicitjump.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import sunkeding.com.arouterdemo.R;
import sunkeding.com.arouterdemo.activity.WebviewActivity;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc ImplicitJumpMainActivity
 */
public class ImplicitJumpMainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_main);
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("skdscheme://www.skd.com/filter/action?studentId=100&teacherId=200"));
                startActivity(intent);
            }
        });
        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImplicitJumpMainActivity.this, WebviewActivity.class);
                intent.putExtra("url","file:///android_asset/schame-test.html");
                startActivity(intent);
            }
        });
    }
}

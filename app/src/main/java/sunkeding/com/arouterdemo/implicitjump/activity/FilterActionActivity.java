package sunkeding.com.arouterdemo.implicitjump.activity;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import sunkeding.com.arouterdemo.R;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc 测试隐式跳转
 */
public class FilterActionActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_action);
        TextView tv = findViewById(R.id.tv);
        Uri uri = getIntent().getData();
        Log.d("FilterActionActivity", "uri:" + uri);
        if (uri == null) {
            return;
        }
        String studentId = uri.getQueryParameter("studentId");
        String teacherId = uri.getQueryParameter("teacherId");
        tv.setText("隐式跳转---->" + "studentId" + studentId + "\n" + "teacherId=" + teacherId);
    }
}

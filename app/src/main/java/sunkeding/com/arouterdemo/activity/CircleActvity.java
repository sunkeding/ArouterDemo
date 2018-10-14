package sunkeding.com.arouterdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import sunkeding.com.arouterdemo.R;
import sunkeding.com.arouterdemo.constant.RouterPathConsatnt;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc CircleActvity
 */
@Route(path = RouterPathConsatnt.CIRCLE_HOME_ROUTER)
public class CircleActvity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        TextView tv_circle = findViewById(R.id.tv_circle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String tabindex = extras.getString("tabindex");
            String actionId = extras.getString("actionId");
            String s = "tabindex=" + tabindex + "\n" + "actionId=" + actionId;
            Log.d("CircleActvity", s);
            tv_circle.setText(s);

        }
    }
}

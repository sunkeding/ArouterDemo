package sunkeding.com.arouterdemo.arouter.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

import sunkeding.com.arouterdemo.R;
import sunkeding.com.arouterdemo.constant.RouterPathConsatnt;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc CircleActvity
 */
@Route(path = RouterPathConsatnt.COACH_HOME_ROUTER)
public class CoachActvity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach);
        Bundle extras = getIntent().getExtras();
        TextView tv_coach = findViewById(R.id.tv_coach);
        if (extras != null) {
            String value = extras.getString("value");
            tv_coach.setText("Arouter----->" + "路由跳转过来携带的参数value=" + value);
        }


    }
}

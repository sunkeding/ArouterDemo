package sunkeding.com.arouterdemo2.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;

import sunkeding.com.arouterdemo2.R;
import sunkeding.com.arouterdemo2.constant.RouterPathConsatnt;

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
    }
}

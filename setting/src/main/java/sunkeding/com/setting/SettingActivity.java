package sunkeding.com.setting;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

import arouterprovider.ILoginProvider;
import arouterprovider.RouterPath;
import sunkeding.com.aninterface.InterfaceServiceManager;

/**
 * @author: skd
 * @date 2018/10/21
 * @Desc SettingActivity
 */
public class SettingActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        findViewById(R.id.bt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 现在就是要找到LoginModuleInterface，执行gotoLogin方法,
                // 反射的方法可以拿到LoginModuleInterface的实现类sunkeding.com.login.LoginInterfaceImpl
                InterfaceServiceManager.getLoginInterface().gotoLogin(SettingActivity.this);


            }
        });
        findViewById(R.id.bt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //通过Arouter的IProvider策略
                ILoginProvider loginService = (ILoginProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_LOGIN_SERVICE).navigation();
                if (loginService != null) {
                    loginService.goToLogin2(SettingActivity.this);
                }


            }
        });
    }
}

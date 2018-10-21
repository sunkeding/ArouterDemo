package sunkeding.com.login;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import sunkeding.com.aninterface.InterfaceServiceManager;

/**
 * @author: skd
 * @date 2018/10/21
 * @Desc LoginActivity
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String settingModuleName = InterfaceServiceManager.getSettingInterface().getSettingModuleName();
        Log.d("LoginActivity", settingModuleName);
    }
}

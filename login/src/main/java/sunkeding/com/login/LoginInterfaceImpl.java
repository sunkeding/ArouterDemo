package sunkeding.com.login;

import android.app.Activity;
import android.content.Intent;

import sunkeding.com.aninterface.LoginModuleInterface;

/**
 * @author: skd
 * @date 2018/10/21
 * @Desc LoginInterfaceImpl
 */
public class LoginInterfaceImpl implements LoginModuleInterface {
    @Override
    public void gotoLogin(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));
    }
}

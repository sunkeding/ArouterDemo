package sunkeding.com.arouterdemo.implicitjump.util;

import android.content.Context;
import android.content.Intent;

import sunkeding.com.arouterdemo.LoginActivity;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc LoginUtil
 */
public class LoginUtil {
    public static void goToLogin(Context activity, String routerUrl) {
        Intent intent = new Intent(activity, LoginActivity.class);
        intent.putExtra("routerUrl", routerUrl);
        activity.startActivity(intent);
    }

    public static void goToLogin(Context activity) {
        goToLogin(activity, "");
    }
}

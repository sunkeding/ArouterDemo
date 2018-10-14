package sunkeding.com.arouterdemo.implicitjump.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import sunkeding.com.arouterdemo.app.MyApp;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc RouterJumpUtil
 */
public class RouterJumpUtil {
    public static void goRouter(Context activity, String routerUrl) {
//        "skdscheme://www.skd.com/filter/action?studentId=100&teacherId=200"

        String[] szPage = {
                "/filterold/action",
                "/filter/action"
        };
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(routerUrl)) {
            for (String s : szPage) {
                if (!MyApp.isLogon && routerUrl.contains(s)) {
                    LoginUtil.goToLogin(activity, routerUrl);
                    return;
                }
            }

            intent.setData(Uri.parse(routerUrl));
            activity.startActivity(intent);

        }


    }
}

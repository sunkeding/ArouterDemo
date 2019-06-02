package arouterprovider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

import sunkeding.com.login.LoginActivity;

/**
 * @author: skd
 * @date 2019-05-06
 * @Desc LoginService
 */
@Route(path = RouterPath.ROUTER_PATH_TO_LOGIN_SERVICE)
public class LoginService implements ILoginProvider {
    @Override
    public void goToLogin(Activity activity) {
        activity.startActivity(new Intent(activity, LoginActivity.class));

    }

    @Override
    public void goToLogin2(Activity activity) {
        Toast.makeText(activity, "来自LoginService的toast", Toast.LENGTH_SHORT).show();
    }

    /**
     * Do your init work in this method, it well be call when processor has been load.
     *
     * @param context ctx
     */
    @Override
    public void init(Context context) {

    }
}

package arouterprovider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;

import sunkeding.com.setting.SettingActivity;

/**
 * @author: skd
 * @date 2019-05-06
 * @Desc SettingService
 */
@Route(path = RouterPath.ROUTER_PATH_TO_SETTING_SERVICE)
public class SettingService implements ISettingProvider {
    @Override
    public void goToSetting(Activity activity) {
        activity.startActivity(new Intent(activity, SettingActivity.class));
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

package arouterprovider;

import android.app.Activity;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by chenran3 on 2017/12/8.
 */

public interface ILoginProvider extends IProvider {

    void goToLogin(Activity activity);
    void goToLogin2(Activity activity);
}

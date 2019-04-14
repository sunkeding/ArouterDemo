package netease;

import android.app.Application;

import sunkeding.com.login.LoginInterfaceImpl;

/**
 * @author: skd
 * @date 2019/4/14
 * @Desc LoginApp
 */
public class LoginApp extends Application implements IAppComponent {
    private Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }


    @Override
    public void init(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginModuleInterface(new LoginInterfaceImpl());
    }
}

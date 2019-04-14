package netease;

import android.app.Application;

import sunkeding.com.setting.SettingInterfaceImpl;

/**
 * @author: skd
 * @date 2019/4/14
 * @Desc SettingApp
 */
public class SettingApp extends Application implements IAppComponent {
    private Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }

    @Override
    public void init(Application app) {
        application = app;
        ServiceFactory.getInstance().setSettingModuleInterface(new SettingInterfaceImpl());
    }
}

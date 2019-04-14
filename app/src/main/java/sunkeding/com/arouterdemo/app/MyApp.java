package sunkeding.com.arouterdemo.app;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import netease.AppConfig;
import netease.IAppComponent;

/**
 * @author: skd
 * @date 2018/10/14
 * @Desc MyApp
 */
public class MyApp extends Application implements IAppComponent {
    public static boolean isLogon = false;

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.init(this); // 尽可能早，推荐在Application中初始化

        init(this);
    }


    @Override
    public void init(Application app) {

        //通过反射来初始化业务组件的方法
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> aClass = Class.forName(component);
                try {
                    Object object = aClass.newInstance();
                    if (object instanceof IAppComponent) {
                        IAppComponent appComponent = (IAppComponent) object;
                        appComponent.init(this);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}

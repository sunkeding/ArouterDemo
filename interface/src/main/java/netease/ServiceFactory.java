package netease;

import sunkeding.com.aninterface.LoginModuleInterface;
import sunkeding.com.aninterface.SettingModuleInterface;

/**
 * @author: skd
 * @date 2019/4/14
 * @Desc ServiceFactory
 */
public class ServiceFactory {
    LoginModuleInterface loginModuleInterface;
    SettingModuleInterface settingModuleInterface;
    static ServiceFactory mInstance;

    public static ServiceFactory getInstance() {
        if (mInstance == null) {
            synchronized (ServiceFactory.class) {
                if (mInstance == null) {
                    mInstance = new ServiceFactory();
                }
            }
        }

        return mInstance;
    }

    public LoginModuleInterface getLoginModuleInterface() {
        if (loginModuleInterface == null) {
            loginModuleInterface = new EmptyLoginService();
        }
        return loginModuleInterface;
    }

    public void setLoginModuleInterface(LoginModuleInterface loginModuleInterface) {
        this.loginModuleInterface = loginModuleInterface;
    }

    public SettingModuleInterface getSettingModuleInterface() {
        if (settingModuleInterface == null) {
            settingModuleInterface = new EmptySettingService();
        }
        return settingModuleInterface;
    }

    public void setSettingModuleInterface(SettingModuleInterface settingModuleInterface) {
        this.settingModuleInterface = settingModuleInterface;
    }

}

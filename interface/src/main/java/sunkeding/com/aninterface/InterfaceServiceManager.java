package sunkeding.com.aninterface;

/**
 * @author: skd
 * @date 2018/10/21
 * @Desc InterfaceServiceManager
 */
public class InterfaceServiceManager {
    public static LoginModuleInterface getLoginInterface() {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("sunkeding.com.login.LoginInterfaceImpl");
            try {
                LoginModuleInterface loginModuleInterface = (LoginModuleInterface) clazz.newInstance();
                return loginModuleInterface;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static SettingModuleInterface getSettingInterface() {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("sunkeding.com.setting.SettingInterfaceImpl");
            try {
                SettingModuleInterface settingModuleInterface = (SettingModuleInterface) clazz.newInstance();
                return settingModuleInterface;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}

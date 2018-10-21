package sunkeding.com.setting;

import sunkeding.com.aninterface.SettingModuleInterface;

/**
 * @author: skd
 * @date 2018/10/21
 * @Desc LoginInterfaceImpl
 */
public class SettingInterfaceImpl implements SettingModuleInterface {
    @Override
    public String getSettingModuleName() {
        return "我是Settingmodule的名称";
    }
}

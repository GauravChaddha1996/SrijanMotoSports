package com.srijan.motosports.features.login;

import com.srijan.motosports.database.DataManager;

public class LoginPresenterImpl implements LoginPresenterInterface {
    private DataManager manager;
    private LoginViewInterface viewInterface;

    public LoginPresenterImpl(LoginViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        manager = DataManager.getDataManager();
    }
}

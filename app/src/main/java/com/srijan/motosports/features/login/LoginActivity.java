package com.srijan.motosports.features.login;

import android.content.Intent;
import android.os.Bundle;

import com.srijan.motosports.R;
import com.srijan.motosports.base.BaseAppCompatActivity;
import com.srijan.motosports.features.home.HomeActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseAppCompatActivity implements LoginViewInterface {
    LoginPresenterImpl loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginPresenter = new LoginPresenterImpl(this);

    }

    @OnClick(R.id.button_login_continue)
    void onContinue() {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }


}

package com.srijan.motosports.features.home;

/**
 * Created by Batdroid on 10/1/17 for Srijan.
 */

public class HomePresenter implements HomePresenterInterface {
    private HomeViewInterface homeViewInterface;

    public HomePresenter(HomeViewInterface homeViewInterface) {
        this.homeViewInterface = homeViewInterface;
    }
}

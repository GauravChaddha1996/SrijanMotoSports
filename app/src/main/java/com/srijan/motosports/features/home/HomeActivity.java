package com.srijan.motosports.features.home;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.srijan.motosports.R;
import com.srijan.motosports.features.about.AboutUsFragment;
import com.srijan.motosports.features.cookyourcar.CookYourCarFragment;
import com.srijan.motosports.features.home.fragment.HomeFragment;
import com.srijan.motosports.features.models.ModelsFragment;
import com.srijan.motosports.features.races.RacesFragment;
import com.srijan.motosports.features.spareparts.SparePartsFragment;
import com.srijan.motosports.features.subscribe.SubscribeFragment;

import static com.srijan.motosports.R.mipmap.app_icon;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeViewInterface {

    private Fragment currentFragment;
    private Toolbar toolbar;
    private HomePresenter homePresenter;
    private DrawerLayout drawer;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        homePresenter = new HomePresenter(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(app_icon);
        setUpNavigationDrawer();
        setFragment(new HomeFragment());
        getSupportActionBar().setTitle("Srijan Motosports");
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        FragmentManager manager = getSupportFragmentManager();
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }else if(manager.getBackStackEntryCount()>0){
            super.onBackPressed();
        }else if(!(currentFragment instanceof HomeFragment)){
            setFragment(new HomeFragment());
        }else{
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            if (!(currentFragment instanceof HomeFragment)) {
                setFragment(new HomeFragment());
                getSupportActionBar().setTitle("Srijan Motosports");
            }
        } else if (id == R.id.nav_models) {
            if (!(currentFragment instanceof ModelsFragment)) {
                setFragment(new ModelsFragment());
                getSupportActionBar().setTitle("Models");
            }
        } else if (id == R.id.nav_races) {
            if (!(currentFragment instanceof RacesFragment)) {
                setFragment(new RacesFragment());
                getSupportActionBar().setTitle("Races");
            }
        } else if (id == R.id.nav_spare_parts) {
            if (!(currentFragment instanceof SparePartsFragment)) {
                setFragment(new SparePartsFragment());
                getSupportActionBar().setTitle("Spare Parts");
            }
        } else if (id == R.id.nav_cook_car) {
            if (!(currentFragment instanceof CookYourCarFragment)) {
                setFragment(new CookYourCarFragment());
                getSupportActionBar().setTitle("Cook your own car");
            }
        } else if (id == R.id.nav_about) {
            if (!(currentFragment instanceof AboutUsFragment)) {
                setFragment(new AboutUsFragment());
                getSupportActionBar().setTitle("About Us");
            }
        }
        else if (id == R.id.nav_subscribe) {
            if (!(currentFragment instanceof SubscribeFragment)) {
                setFragment(new SubscribeFragment());
                getSupportActionBar().setTitle("Subscribe!");
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setUpNavigationDrawer() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void setFragment(Fragment fragment) {
        currentFragment = fragment;
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_home, fragment);
        transaction.commit();
    }

    public void navigateToModels() {
        navigationView.setCheckedItem(R.id.nav_models);
        onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_models));
    }
    public void navigateToCookYourCar() {
        navigationView.setCheckedItem(R.id.nav_cook_car);
        onNavigationItemSelected(navigationView.getMenu().findItem(R.id.nav_cook_car));
    }
}

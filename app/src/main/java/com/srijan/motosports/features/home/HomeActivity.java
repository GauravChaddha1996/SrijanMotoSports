package com.srijan.motosports.features.home;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
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

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, HomeViewInterface {

    Fragment currentFragment;
    Toolbar toolbar;
    HomePresenter homePresenter;
    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        homePresenter = new HomePresenter(this);
        setSupportActionBar(toolbar);
        setUpNavigationDrawer();
        setFragment(new HomeFragment());
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setUpNavigationDrawer() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void setFragment(Fragment fragment) {
        currentFragment = fragment;
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_layout_home, fragment);
        transaction.commit();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            if (!(currentFragment instanceof HomeFragment)) {
                setFragment(new HomeFragment());
            }
        } else if (id == R.id.nav_models) {
            if (!(currentFragment instanceof ModelsFragment)) {
                setFragment(new ModelsFragment());
            }
        } else if (id == R.id.nav_races) {
            if (!(currentFragment instanceof RacesFragment)) {
                setFragment(new RacesFragment());
            }
        } else if (id == R.id.nav_spare_parts) {
            if (!(currentFragment instanceof SparePartsFragment)) {
                setFragment(new SparePartsFragment());
            }
        } else if (id == R.id.nav_cook_car) {
            if (!(currentFragment instanceof CookYourCarFragment)) {
                setFragment(new CookYourCarFragment());
            }
        } else if (id == R.id.nav_about) {
            if (!(currentFragment instanceof AboutUsFragment)) {
                setFragment(new AboutUsFragment());
            }
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

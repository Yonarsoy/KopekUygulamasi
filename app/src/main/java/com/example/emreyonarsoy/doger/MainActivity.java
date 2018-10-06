package com.example.emreyonarsoy.doger;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    public DrawerLayout mDrawerLayout;
    public ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Köpek Cinsleri");
          Fragment myFragment = null;
        Class fragmentClass = KopekCinsleri.class;
        try{
         myFragment = (Fragment) fragmentClass.newInstance();

        }catch (Exception e){
           e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        NavigationView nvDrawer = (NavigationView) findViewById(R.id.nv);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setupDrawerContent(nvDrawer);
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.f1content,myFragment).commit();
        mDrawerLayout.closeDrawers();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void selectItemDrawer(MenuItem menuItem){
        Fragment myFragment = null;
        Class fragmentClass;
        switch (menuItem.getItemId()){
            case R.id.cins:
                fragmentClass = KopekCinsleri.class;
                break;

            case R.id.egitim:
                fragmentClass = KopekEgitimi.class;
                break;

            case R.id.duygular:
                fragmentClass = KopekDuygulari.class;
                break;

            case R.id.isim:
                fragmentClass = KopekIsimleri.class;
                break;

            case R.id.sss:
                fragmentClass = SikcaSorulanSorular.class;
                break;

            case R.id.hktsu:
                fragmentClass = HangiKopekTuruSanaUygun.class;
                break;

            default:
                fragmentClass = KopekCinsleri.class;
        }
        try{
            myFragment = (Fragment) fragmentClass.newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
       fragmentManager.beginTransaction().replace(R.id.f1content,myFragment).commit();
        menuItem.setChecked(true);
        setTitle(menuItem.getTitle());
        mDrawerLayout.closeDrawers();
    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                selectItemDrawer(item);
                return true;
            }
        });
    }
}

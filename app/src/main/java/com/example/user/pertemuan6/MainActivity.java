package com.example.user.pertemuan6;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragment(new BEFragment());
    }

    private void changeFragment(Fragment fragment){
        FragmentManager manager = getFragmentManager();

        manager.beginTransaction()
                .replace(R.id.BKFragment, fragment)
                .commit();
    }

    public void onClickBE(View view){
        changeFragment(new BEFragment());
    }

    public void onClickDPA(View view){
        changeFragment(new DPAFragment());
    }

    public void onClickPresidium(View view){
        changeFragment(new PresidiumFragment());
    }
}

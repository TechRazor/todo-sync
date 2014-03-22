package net.techrazor.todo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class HomeActivity extends Activity {

    private FragmentManager mFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFragmentManager = getFragmentManager();
        initiateFragments();
    }

    private void initiateFragments() {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        HomeFragment mHomeFragment = (HomeFragment)
                mFragmentManager.findFragmentByTag("home_fragment");

        if (mHomeFragment == null) {
            mHomeFragment = new HomeFragment();
            fragmentTransaction.add(android.R.id.content, mHomeFragment, "home_fragment");
        }

        fragmentTransaction.commit();
    }

}

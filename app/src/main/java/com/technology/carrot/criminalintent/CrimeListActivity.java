package com.technology.carrot.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2018/1/15.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

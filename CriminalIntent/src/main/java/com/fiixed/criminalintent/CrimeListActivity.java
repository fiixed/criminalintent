package com.fiixed.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by abell on 11/21/13.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }



}

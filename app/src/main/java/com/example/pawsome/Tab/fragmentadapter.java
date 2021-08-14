package com.example.pawsome.Tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.pawsome.Tab.FirstFragment;
import com.example.pawsome.Tab.SecondFragment;
import com.example.pawsome.Tab.ThirdFragment;

public class fragmentadapter extends FragmentStateAdapter {
    public fragmentadapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            case 3:
                return new fourFragment();
            case 4:
                return new fiveFragment();
        }

        return new FirstFragment();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

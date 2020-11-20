package com.example.newsflash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;
;import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class LoginTabFragment extends Fragment {

    TabLayout tabLayout;
    FloatingActionButton google;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);
        tabLayout = root.findViewById(R.id.tab_layout_login);
        google = root.findViewById(R.id.sign_in_button);
        google.setTranslationY(300);
        google.setAlpha(v);

        tabLayout.setTranslationY(300);
        tabLayout.setAlpha(v);


        google.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        tabLayout.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();




        return root;
    }
}

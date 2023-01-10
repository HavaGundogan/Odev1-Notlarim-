package com.gundogan.freefitness;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class picture extends Fragment {

    public static picture newInstance(){
     return new picture();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View rootView =inflater.inflate(R.layout.fragment_picture,container,false);

        return rootView;
    }


}

package vhbandroidprogrammierung.de.spruecheapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vhbandroidprogrammierung.de.spruecheapp.R;

public class UserSayingsFragment extends Fragment {

    private FloatingActionButton fab;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_user_sayings,null);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.own_sayings);

        return x;

    }



}
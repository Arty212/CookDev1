package ru.startandroid.cookdev1.FragmentBase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.startandroid.cookdev1.R;

public class AbcMidFragment extends Fragment {
    Fragment fragmentabcmid;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentabcmid = new AbcMidFragment();
        View v = inflater.inflate(R.layout.fragment_abc_mid, null);
        ;return v;
        }
}

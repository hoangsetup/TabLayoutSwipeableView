package vn.com.hiworld.hoangdv.tablayoutswipeableview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.com.hiworld.hoangdv.tablayoutswipeableview.R;

/**
 * Created by hoangdv on 24/06/2015.
 */
public class MoviesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        return view;
    }
}
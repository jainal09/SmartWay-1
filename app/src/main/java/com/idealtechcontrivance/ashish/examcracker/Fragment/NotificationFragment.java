package com.idealtechcontrivance.ashish.examcracker.Fragment;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.idealtechcontrivance.ashish.examcracker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {

    private View view;
    private ProgressDialog progressDialog;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notification, container, false);
        getActivity().setTitle("Notification");

        return view;
    }

}

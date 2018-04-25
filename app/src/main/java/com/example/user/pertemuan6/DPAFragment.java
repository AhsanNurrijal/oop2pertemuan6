package com.example.user.pertemuan6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DPAFragment extends android.app.Fragment {

    String[] listDPA = {"DPA 1","DPA 2","DPA 3"};

    public DPAFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dpa2,container,false);

        ListView listView = (ListView) view.findViewById(R.id.list_dpa);
        listView.setAdapter(new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1,listDPA));

        return view;
    }

}
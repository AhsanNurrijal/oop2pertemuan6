package com.example.user.pertemuan6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PresidiumFragment extends android.app.Fragment {

    String[] listPresidium = {"Presidium 1","Presidium 2","Presidium 3"};

    public PresidiumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_presidium, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_presidium);
        listView.setAdapter(new ArrayAdapter<String>(view.getContext(),android.R.layout.simple_list_item_1,listPresidium));
        return inflater.inflate(R.layout.fragment_presidium, container, false);
    }

}

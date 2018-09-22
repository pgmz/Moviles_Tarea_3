package com.iteso.test;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iteso.test.beans.ItemProduct;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTechnology extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;


    public FragmentTechnology() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        recyclerView = view.findViewById(R.id.fragment_technology_recyclerview);
        recyclerView.setHasFixedSize(true);

        ArrayList<ItemProduct> products = new ArrayList<>();
        products.add(new ItemProduct(0,
                getString(R.string.fragment_technology_MAC_name),
                getString(R.string.fragment_technology_store_name),
                getString(R.string.fragment_technology_store_location),
                getString(R.string.fragment_technology_store_phone),
                getString(R.string.fragment_technology_MAC_description)));

        products.add(new ItemProduct(1,
                getString(R.string.fragment_technology_alienware_name),
                getString(R.string.fragment_technology_store_name),
                getString(R.string.fragment_technology_store_location),
                getString(R.string.fragment_technology_store_phone),
                getString(R.string.fragment_technology_alienware_description)));

        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AdapterProduct(view.getContext(), products);
        recyclerView.setAdapter(adapter);

        return view;
    }

}

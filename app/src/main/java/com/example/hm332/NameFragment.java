package com.example.hm332;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.jar.Attributes;


public class NameFragment extends Fragment {
    private NameAdapter adapter;
    private ArrayList<String> list;
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContact();
        adapter = new NameAdapter();
        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(adapter);
    }

    private void loadContact() {
        list =new ArrayList<>();
        list.add("Amina");
        list.add("Medina");
        list.add("Elina");
        list.add("Rustam");
        list.add("Almash");
        list.add("Rano");
        list.add("Aiana");
        list.add("Nuriza");
        list.add("Alia");
    }

}

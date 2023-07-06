package com.example.oneclickeats;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oneclickeats.adapter.MenuAdapter;
import com.example.oneclickeats.models.MenuModel;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView;
    List<MenuModel> menuModels;
    MenuAdapter menuAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View root = inflater.inflate(R.layout.fragment_menu, container, false);

       recyclerView = root.findViewById(R.id.menu_rec);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       menuModels = new ArrayList<>();

        menuModels.add(new MenuModel(R.drawable.img_1,"Breakfast","30%","Description Description","KFC"));
        menuModels.add(new MenuModel(R.drawable.dominosimg,"Breakfast","30%","Description Description","Dominos"));
        menuModels.add(new MenuModel(R.drawable.burgerimg,"Breakfast","30%","Description Description","Burger King"));
        menuModels.add(new MenuModel(R.drawable.phutimg,"Breakfast","30%","Description Description","Pizza Hut"));
        menuModels.add(new MenuModel(R.drawable.subwayimg,"Breakfast","30%","Description Description","Subway"));
        menuModels.add(new MenuModel(R.drawable.popeyeimg,"Breakfast","30%","Description Description","Popeyes"));
        menuModels.add(new MenuModel(R.drawable.islandimg,"Breakfast","30%","Description Description","Island Grill"));
        menuModels.add(new MenuModel(R.drawable.juicyimg,"Breakfast","30%","Description Description","Juicy Patty"));

        menuAdapter = new MenuAdapter(getContext(),menuModels);
        recyclerView.setAdapter(menuAdapter);
        menuAdapter.notifyDataSetChanged();
        return root;
    }
}
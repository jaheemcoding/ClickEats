package com.example.oneclickeats;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.oneclickeats.adapter.HomeHorAdapter;
import com.example.oneclickeats.adapter.HomeVerAdapter;
import com.example.oneclickeats.adapter.UpdateVerticalRec;
import com.example.oneclickeats.models.HomeHorModel;
import com.example.oneclickeats.models.HomeVerModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements UpdateVerticalRec {

    RecyclerView homeHorizontalRec,homeVerticalRec;
    ArrayList<HomeHorModel> homeHorModelList;
    HomeHorAdapter homeHorAdapter;
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

       View root = inflater.inflate(R.layout.fragment_home, container, false);

       homeHorizontalRec = root.findViewById(R.id.home_hor_rec);
       homeHorModelList = new ArrayList<>();


        homeHorModelList.add(new HomeHorModel(R.drawable.kfc,"Kentucky Fried Chicken"));
        homeHorModelList.add(new HomeHorModel(R.drawable.dominos,"Dominos Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.burgerking,"Burger King"));
        homeHorModelList.add(new HomeHorModel(R.drawable.pizzahut,"Pizza Hut"));
        homeHorModelList.add(new HomeHorModel(R.drawable.subway,"Subway"));
        homeHorModelList.add(new HomeHorModel(R.drawable.popeyes,"Popeyes"));
        homeHorModelList.add(new HomeHorModel(R.drawable.islandgrill,"Island Grill"));
        homeHorModelList.add(new HomeHorModel(R.drawable.juicy,"Juicy Patty"));


        homeHorAdapter = new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalRec.setHasFixedSize(true);

        homeVerticalRec = root.findViewById(R.id.hom_ver_rec);
        homeVerModelList = new ArrayList<>();

        homeVerAdapter = new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager((new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false)));

        return root;
    }

    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter = new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);
    }
}
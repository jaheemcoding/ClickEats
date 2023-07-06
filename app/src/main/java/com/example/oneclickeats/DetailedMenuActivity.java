package com.example.oneclickeats;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.oneclickeats.adapter.DetailMenuAdapter;
import com.example.oneclickeats.models.DetailMenuModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailMenuModel> detailedMenuModelList;
    DetailMenuAdapter menuAdapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        String type = getIntent().getStringExtra("type");

        recyclerView = findViewById(R.id.detail_rec);
        imageView = findViewById(R.id.detailed_img);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedMenuModelList = new ArrayList<>();
        menuAdapter = new DetailMenuAdapter(detailedMenuModelList);
        recyclerView.setAdapter(menuAdapter);

        if (type != null && type.equalsIgnoreCase("breakfast")) {

            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bigdeal, "Breakfast", "description", "5.0", "$1350", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.hwbigbox, "Breakfast", "description", "5.0", "$1350", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bbqzinger, "Breakfast", "description", "5.0", "$950", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.kfccs1, "Breakfast", "description", "5.0", "$1350", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bbqzingercombo, "Breakfast", "description", "5.0", "$1120", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.zinger, "Breakfast", "description", "5.0", "$975", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.family9, "Breakfast", "description", "5.0", "$4790", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.family12, "Breakfast", "description", "5.0", "$6300", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.wing5combo, "Breakfast", "description", "5.0", "$995", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.wings5, "Breakfast", "description", "5.0", "$875", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.wings10, "Breakfast", "description", "5.0", "$1700", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.party25, "Breakfast", "description", "5.0", "$3995", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.fries, "Breakfast", "description", "5.0", "$240", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.coleslaw, "Breakfast", "description", "5.0", "$250", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.biscuits, "Breakfast", "description", "5.0", "$125", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.mashedpotatoes, "Breakfast", "description", "5.0", "$210", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.pepsi, "Breakfast", "description", "5.0", "$245", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.dggrape, "Breakfast", "description", "5.0", "$210", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.up7, "Breakfast", "description", "5.0", "$210", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.cookie, "Breakfast", "description", "5.0", "$155", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.pies, "Breakfast", "description", "5.0", "$400", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }

        if (type != null && type.equalsIgnoreCase("Dominos")) {

            imageView.setImageResource(R.drawable.dominosimg);
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bbqlarge, "Breakfast", "description", "5.0", "$3900", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bbqmedium, "Breakfast", "description", "5.0", "$3200", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.meatzza, "Breakfast", "description", "5.0", "$4800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.pepperoni2, "Breakfast", "description", "5.0", "$3900", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.vegi, "Breakfast", "description", "5.0", "$3200", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.cbb, "Breakfast", "description", "5.0", "$1250", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.wedd, "Breakfast", "description", "5.0", "$1100", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.garlic, "Breakfast", "description", "5.0", "$850", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.lavacake, "Breakfast", "description", "5.0", "$800", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("Burger King")) {

            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkwhopperwc, "Breakfast", "description", "5.0", "$1390", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkdouble, "Breakfast", "description", "5.0", "$1625", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkbeaconwc, "Breakfast", "description", "5.0", "$1475", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.whopperjrwc, "Breakfast", "description", "5.0", "$1090", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkoriginal, "Breakfast", "description", "5.0", "$1640", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkclub, "Breakfast", "description", "5.0", "$1425", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bknuggets, "Breakfast", "description", "5.0", "$990", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bktendergrill, "Breakfast", "description", "5.0", "$1640", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkbec, "Breakfast", "description", "5.0", "$1020", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkhec, "Breakfast", "description", "5.0", "$1080", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkpie, "Breakfast", "description", "5.0", "$430", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.bkcookie, "Breakfast", "description", "5.0", "$170", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("Pizza Hut ")) {

            detailedMenuModelList.add(new DetailMenuModel(R.drawable.cheesepizza, "Breakfast", "description", "5.0", "$2200", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phuta4, "Breakfast", "description", "5.0", "$2700", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutpepperoni, "Breakfast", "description", "5.0", "$2800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutbbqc, "Breakfast", "description", "5.0", "$2800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phuthawaiian, "Breakfast", "description", "5.0", "$2800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutvege, "Breakfast", "description", "5.0", "$2800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutsup, "Breakfast", "description", "5.0", "$3100", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutmeatlovers, "Breakfast", "description", "5.0", "$3800", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutss, "Breakfast", "description", "5.0", "$3900", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutpeppsi, "Breakfast", "description", "5.0", "$400", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutsoda, "Breakfast", "description", "5.0", "$200", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutbootlewater, "Breakfast", "description", "5.0", "$130", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutcheesesticks, "Breakfast", "description", "5.0", "$650", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutstuffcheesesticks, "Breakfast", "description", "5.0", "$900", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.phutcinnamon, "Breakfast", "description", "5.0", "$800", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("Subway")) {

            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub1, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub2, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub3, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub4, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub5, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub6, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub7, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub8, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub9, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub10, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub12, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub13, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub14, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.sub15, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }
        if (type != null && type.equalsIgnoreCase("Popeyes")) {

            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes1, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes2, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes3, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes4, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes5, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes6, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes7, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes8, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes9, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyes10, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyescocacola, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyessprite, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));
            detailedMenuModelList.add(new DetailMenuModel(R.drawable.popeyewater, "Breakfast", "description", "5.0", "$", "10:00am : 10:00pm"));

            menuAdapter.notifyDataSetChanged();

        }
    }
}
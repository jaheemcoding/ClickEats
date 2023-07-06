package com.example.oneclickeats.adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.oneclickeats.R;
import com.example.oneclickeats.models.HomeHorModel;
import com.example.oneclickeats.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    ArrayList<HomeHorModel> list;

    boolean check = true;
    boolean select = true;
    int row_index = -1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.kfccs1, "KFC Cheese Sandwish", "10:00am - 10:00pm", "$1250", "5.0"));
            homeVerModels.add(new HomeVerModel(R.drawable.hwbigbox, "Hot Wing Big Box", "10:00am - 10:00pm", "$750", "5.0"));
            homeVerModels.add(new HomeVerModel(R.drawable.bbqzinger, "BBQ Zinger", "10:00am - 10:00pm", "$750", "5.0"));
            homeVerModels.add(new HomeVerModel(R.drawable.bigdeal, "KFC Big Deal", "10:00am - 10:00pm", "$1350", "5.0"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();

                if (position == 1) {
                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                    homeVerModels.add(new HomeVerModel(R.drawable.garlic, "Garlic Bread", "10:00am - 10:00pm", "$850", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.dom1, "Hot Wing Big Box", "10:00am - 10:00pm", "$750", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.dominosbbq, "Dominos BBQ Chicken Pizza", "10:00am - 10:00pm", "$750", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.dom2, "Dominos Cheese Pizza", "10:00am - 10:00pm", "$750", "5.0"));

                    updateVerticalRec.callBack(position, homeVerModels);

                } else if (position == 2) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                    homeVerModels.add(new HomeVerModel(R.drawable.bkwhopperwc, "Whopper With Cheese", "10:00am - 10:00pm", "$750", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.bkbeaconwc, "Whopper With Beacon and Cheese", "10:00am - 10:00pm", "$750", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.whopperjrwc, "Whopper Jr With Cheese", "10:00am - 10:00pm", "$750", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.bkdouble, "Double Whopper With Cheese", "10:00am - 10:00pm", "$750", "5.0"));

                    updateVerticalRec.callBack(position, homeVerModels);
                } else if (position == 3) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                    homeVerModels.add(new HomeVerModel(R.drawable.phutpizzapatty, "PizzaHut PizzaPatty", "10:00am - 10:00pm", "$375", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.phutpasta, "PizzaHut Tuscani Pasta", "10:00am - 10:00pm", "$375", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.phutpp, "PizzaHut Personal Pan Pizza", "10:00am - 10:00pm", "$1150", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.phuthawaiian, "PizzaHut Hawaiian", "10:00am - 10:00pm", "$2800", "5.0"));

                    updateVerticalRec.callBack(position, homeVerModels);

                } else if (position == 4) {

                    ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                    homeVerModels.add(new HomeVerModel(R.drawable.subwaychamp, "Subway The Champ", "9:00am - 4:00pm", "$1050", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.subwayclub, "Subway The Club", "9:00am - 4:00pm", "$1090", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sub6, "Egg and Cheese Sandwish", "9:00am - 4:00pm", "$950", "5.0"));
                    homeVerModels.add(new HomeVerModel(R.drawable.sub14, "Coffee", "9:00am - 4:00pm", "$1050", "5.0"));

                    updateVerticalRec.callBack(position, homeVerModels);

                }
                   else if (position == 5) {

                     ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                     homeVerModels.add(new HomeVerModel(R.drawable.popeyes1, "Chicken Sandwich Combo", "10:00am - 10:00pm", "$750dp", "5.0"));
                     homeVerModels.add(new HomeVerModel(R.drawable.popeyes2, "5Pc Tenders Combo", "10:00am - 10:00pm", "$750dp", "5.0"));
                     homeVerModels.add(new HomeVerModel(R.drawable.popeyes5, "4Pc Signature Chicken Combo", "10:00am - 10:00pm", "$750dp", "5.0"));
                     homeVerModels.add(new HomeVerModel(R.drawable.popeyes8, "Popeyes Fries", "10:00am - 10:00pm", "$750dp", "5.0"));

                    updateVerticalRec.callBack(position, homeVerModels);

                }

                    else if (position == 6) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.igrilljerkb, "Jerk Burger Combo", "9:00am - 4:00pm", "$1050", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.igrillbbq, "BBQ Chicken Sanwish Combo", "9:00am - 4:00pm", "$1090", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.igrillfamd, "Family Time Dinnnaah", "9:00am - 4:00pm", "$950", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.igrillfs, "Crispy Fish Sandwish", "9:00am - 4:00pm", "$1050", "5.0"));

                        updateVerticalRec.callBack(position, homeVerModels);
                }
                    else if (position == 7) {

                        ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

                        homeVerModels.add(new HomeVerModel(R.drawable.cheesepatty, "Juicy Chesse Patty", "10:00am - 10:00pm", "$750dp", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.megapatty, "Juicy Mega Patty", "10:00am - 10:00pm", "$750dp", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.chickenpatty, "Juicy Chicken Patty", "10:00am - 10:00pm", "$750dp", "5.0"));
                        homeVerModels.add(new HomeVerModel(R.drawable.cocobread, "Juicy CoCoBread", "10:00am - 10:00pm", "$750dp", "5.0"));

                        updateVerticalRec.callBack(position, homeVerModels);

                }
            }
        });
        if (select) {
            if (position == 0) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            }
        } else {
            if (row_index == position) {
                holder.cardView.setBackgroundResource(R.drawable.change_bg);
            } else {
                holder.cardView.setBackgroundResource(R.drawable.default_bg);
            }
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hor_img);
            name = itemView.findViewById(R.id.hor_text);
            cardView = itemView.findViewById(R.id.cardview);
        }
    }
}




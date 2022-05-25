package com.example.foodorder.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.Interface.ItemClickListener;
import com.example.foodorder.Model.Order;
import com.example.foodorder.R;

import java.util.ArrayList;
import java.util.List;

class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txt_cart_name, txt_price;
    public ImageView img_cart_count;
    private ItemClickListener itemClickListener;

    public void setTxt_cart_name(TextView txt_cart_name){
        this.txt_cart_name = txt_cart_name;
    }

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);
        txt_cart_name = (TextView) itemView.findViewById(R.id.cart_item_name);
        txt_price = (TextView) itemView.findViewById(R.id.cart_item_price);
        img_cart_count = (ImageView) itemView.findViewById(R.id.cart_item_count);
    }

    @Override
    public void onClick(View view) {

    }
}

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private List<Order> listData = new ArrayList<>();
    private Context context;

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.cart_layout,parent, false);
        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        TextDra

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

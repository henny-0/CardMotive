package com.example.cardmotive;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter <Card> {

    int count = 0;

    ArrayList <Card> cardArrayList;
    Context context;
    public Adapter(ArrayList<Card> cardArrayList, Context context){
        super(context, R.layout.carditem, cardArrayList);
        this.cardArrayList =cardArrayList;
        this.context = context;
    }

    public static class Viewholder{
        TextView textView;
        ImageView imageView;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        Card card = getItem(position);
        Viewholder viewholder;

        if (convertView == null){
            viewholder = new Viewholder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.carditem, parent,false);
            viewholder.imageView = convertView.findViewById(R.id.imageView);
            viewholder.textView = convertView.findViewById(R.id.textView);
            convertView.setTag(viewholder);
        } else{
            viewholder = (Viewholder) convertView.getTag();
        }

        viewholder.textView.setText(card.getText());
        viewholder.imageView.setImageResource(card.getBgID());


        return convertView;
    }
    
}

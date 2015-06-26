package com.lifeistech.android.createaflashcardapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ren on 2015/06/12.
 */
public class ArrayAdapter extends android.widget.ArrayAdapter{

    List<Words> vocab;
    private LayoutInflater layoutInflater;



    public ArrayAdapter(Context context, int textViewResourceId, List<Words> objects) {
        super(context, textViewResourceId, objects);

        vocab = objects;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    };

    @Override
    public int getCount(){
        return vocab.size();
    }

    @Override
    public Object getItem(int pig) {
        return vocab.get(pig);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Words item = (Words) getItem(position);

        if (null == convertView) {
            convertView = layoutInflater.inflate(R.layout.vocab_grid, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.hey);
        textView.setText(item.spell);

        return convertView;
    };

}

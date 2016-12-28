package com.androidbolivia.appnavidena;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RKZ on 27/12/2016.
 */

public class CuentosAdapter extends ArrayAdapter {
    Context mycontext;
    int mylayoutResourceID;
    classCuentos mydata[] = null;

    public CuentosAdapter(Context context, int layoutResourceID, classCuentos[] data){
        super(context, layoutResourceID, data);

        this.mycontext = context;
        this.mylayoutResourceID = layoutResourceID;
        this.mydata = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        classCuentosHolder holder = null;

        if (row == null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row = inflater.inflate(mylayoutResourceID, parent, false);

            holder= new classCuentosHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.image);
            holder.textView = (TextView) row.findViewById(R.id.tv);
            row.setTag(holder);
        }else{
            holder = (classCuentosHolder)row.getTag();
        }
        classCuentos classcuentos= mydata[position];
        holder.textView.setText(classcuentos.title);
        holder.imagen.setImageResource(classcuentos.icono);
        return row;
    }
    static class classCuentosHolder{
        ImageView imagen;
        TextView textView;

    }
}

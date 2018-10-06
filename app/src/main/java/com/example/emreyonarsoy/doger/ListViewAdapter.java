package com.example.emreyonarsoy.doger;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    //varriables
    Context mContext;
    LayoutInflater inflater;
    List<model> modellist;
    ArrayList<model> arrayList;

    public ListViewAdapter(Context context, List<model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder {
        TextView mTitleTv;
        ImageView mIconTv;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int position) {
        return modellist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.row, null);

            holder.mTitleTv = convertView.findViewById(R.id.mainTitle);
            holder.mIconTv = convertView.findViewById(R.id.mainIcon);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.mTitleTv.setText(modellist.get(position).getTitle());
        holder.mIconTv.setImageResource(modellist.get(position).getIcon());


        //listview item clicks
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (modellist.get(position).getTitle().equals("Affenpinscher")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Affenpinscher");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Afgan Tazısı")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Afgan Tazısı");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Aidi")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Aidi");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Ainu")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Ainu");
                    mContext.startActivity(intent);
                }
                //---------------------------------------------------------
                if (modellist.get(position).getTitle().equals("Airedale Terrier")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Airedale Terrier");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Akbaş")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Akbaş");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Akita İnu")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Akita İnu");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alabay (Alabai)")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alabay (Alabai)");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alaskan Malamute")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alaskan Malamute");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alman Av Terrieri")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alman Av Terrieri");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alman Çoban Köpeği")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alman Çoban Köpeği");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alman Kalın Tüylü Pointer")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alman Kalın Tüylü Pointer");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alman Kısa Tüylü Pointer")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alman Kısa Tüylü Pointer");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alman Spanieli")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alman Spanieli");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Alpine Dachsbracke")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Alpine Dachsbracke");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Amerikan Bulldog")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Amerikan Bulldog");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Amerikan Cocker Spaniel")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Amerikan Cocker Spaniel");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Amerikan Eskimo")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Amerikan Eskimo");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Amerikan Pitbull Terrier")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Amerikan Pitbull Terrier");
                    mContext.startActivity(intent);
                }
                if (modellist.get(position).getTitle().equals("Amerikan Staffordshire Terrier")){
                    Intent intent = new Intent(mContext,Kopek_Ozellik.class);
                    intent.putExtra("actionBarTitle","Amerikan Staffordshire Terrier");
                    mContext.startActivity(intent);
                }
                //----------------------------------------------------------------------------------------
            }
        });

        return convertView;
    }


    //filter
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        modellist.clear();
        if (charText.length() == 0) {
            modellist.addAll(arrayList);
        } else {
            for (model model : arrayList) {
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)) {
                    modellist.add(model);
                }

            }
        }
        notifyDataSetChanged();
    }
}

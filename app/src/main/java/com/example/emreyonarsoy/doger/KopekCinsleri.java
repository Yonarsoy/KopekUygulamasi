package com.example.emreyonarsoy.doger;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;


public class KopekCinsleri extends Fragment {
    View view;
    private MenuInflater menuInflater;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        //setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_kopek_cinsleri, container, false);
        view.findViewById(R.id.listView);
        tanimla();


        return view;
    }

    ListView listView;
    ListViewAdapter adapter;
    String[] title;
    int[] icon;

    public void tanimla() {
        ListView listView = view.findViewById(R.id.listView);
        ArrayList<model> kopek_cinsleri = new ArrayList<model>();
        title = new String[]{"Affenpinscher", "Afgan Tazısı", "Aidi", "Ainu", "Airedale Terrier" , "Akbaş" , "Akita İnu" ,
                "Alabay (Alabai)" , "Alaskan Malamute" , "Alman Av Terrieri" , "Alman Çoban Köpeği" , "Alman Kalın Tüylü Pointer" ,
                "Alman Kısa Tüylü Pointer" , "Alman Spanieli" , "Alpine Dachsbracke" , "Amerikan Bulldog" , "Amerikan Cocker Spaniel" , "Amerikan Eskimo" ,
                "Amerikan Pitbull Terrier" , "Amerikan Staffordshire Terrier"};

        icon = new int[]{R.drawable.affenpinscher_logo, R.drawable.afgan_tazisi_icon, R.drawable.aidi_icon,R.drawable.ainu_icon, R.drawable.airedale_terrier_icon, R.drawable.akbas_icon,R.drawable.akita_inu_icon, R.drawable.afgan_tazisi_icon, R.drawable.aidi_icon,R.drawable.affenpinscher_logo, R.drawable.afgan_tazisi_icon, R.drawable.aidi_icon,R.drawable.affenpinscher_logo, R.drawable.afgan_tazisi_icon, R.drawable.aidi_icon,R.drawable.affenpinscher_logo, R.drawable.afgan_tazisi_icon, R.drawable.aidi_icon,R.drawable.affenpinscher_logo, R.drawable.afgan_tazisi_icon};

        for (int i = 0; i < title.length; i++) {
            model model = new model(title[i], icon[i]);

            kopek_cinsleri.add(model);
        }

        adapter = new ListViewAdapter(getActivity(), kopek_cinsleri);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Kopek_Ozellik.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)) {
                    adapter.filter("");
                    listView.clearTextFilter();
                } else {
                    adapter.filter(newText);
                }
                return true;
            }

        });
       super.onCreateOptionsMenu(menu, inflater);
    }
}


package com.filipkesteli.probabaza;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Filip on 22.6.2016..
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] listaIme = {"Ivo", "Ana", "Pero", "Karlo"};
    private String[] listaPrezime = {"Ivic", "Anic", "Peric", "Karlic"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        myViewHolder.tvIme.setText(listaIme[position]);
        myViewHolder.tvPrezime.setText(listaPrezime[position]);
    }

    @Override
    public int getItemCount() {
        return listaIme.length;
    }

    /**
     * Referenca na CardView elemente -> public inner nested klasa -> moze instancirati objekte outer klase
     */
    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView tvIme;
        public TextView tvPrezime;

        public MyViewHolder(View itemView) {
            super(itemView);
            initCardWidgets();
        }

        private void initCardWidgets() {
            tvIme = (TextView) itemView.findViewById(R.id.tvIme);
            tvPrezime = (TextView) itemView.findViewById(R.id.tvPrezime);
        }
    }
}

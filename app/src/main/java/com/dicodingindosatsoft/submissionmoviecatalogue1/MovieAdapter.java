package com.dicodingindosatsoft.submissionmoviecatalogue1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class MovieAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<MovieModels> models = new ArrayList<>();


    public MovieAdapter(Context context) {
        this.context = context;
    }

    void setModels(ArrayList<MovieModels> models) {
        this.models = models;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int i) {
        return models.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_movie_xml, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        MovieModels models = (MovieModels) getItem(i);
        viewHolder.bind(models);
        return itemView;
    }

    private class ViewHolder {
        private final TextView xNama;
        private final TextView xTanggal;
        private final TextView xDesk;
        private final ImageView xImage;

        ViewHolder(View view) {
            xNama = view.findViewById(R.id.zname);
            xTanggal = view.findViewById(R.id.ztanggal);
            xDesk = view.findViewById(R.id.zdesk);
            xImage = view.findViewById(R.id.zimage);
        }

        void bind(MovieModels hero) {
            xNama.setText(hero.getJudul_movie());
            xTanggal.setText(hero.getTanggal_terbit());
            xDesk.setText(hero.getDesk_movie());
            Picasso.get().load(hero.getImage_movie()).placeholder(R.drawable.ic_placeholder).resize(110 + 100, 150 + 150).centerCrop().into(xImage);
        }
    }
}

package com.dicodingindosatsoft.submissionmoviecatalogue1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    private TypedArray dataPhoto, dataLokasi;
    private String[] dataName, dataTanggal, dataBahasa, dataDurasi, dataDescription;


    private String[] dataCrew1, dataCrew1Profesi;
    private String[] dataCrew2, dataCrew2Profesi;
    private String[] dataCrew3, dataCrew3Profesi;
    private String[] dataCrew4, dataCrew4Profesi;
    private String[] dataCrew5, dataCrew5Profesi;

    private TypedArray dataPhotoBilled1, dataPhotoBilled2, dataPhotoBilled3, dataPhotoBilled4, dataPhotoBilled5;
    private String[] dataBilled1, dataBilled1Profesi;
    private String[] dataBilled2, dataBilled2Profesi;
    private String[] dataBilled3, dataBilled3Profesi;
    private String[] dataBilled4, dataBilled4Profesi;
    private String[] dataBilled5, dataBilled5Profesi;

    private ArrayList<MovieModels> movieModels;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.ls_view);
        movieAdapter = new MovieAdapter(this);
        listView.setAdapter(movieAdapter);
        listView.setDivider(null);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent x = new Intent(MainActivity.this, DetailMovie.class);
                MovieModels models = movieModels.get(i);
                x.putExtra(DetailMovie.EXTRA_PERSON, models);
                startActivity(x);
            }
        });

    }

    private void prepare() {
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        dataName = getResources().getStringArray(R.array.data_name);
        dataLokasi = getResources().obtainTypedArray(R.array.data_lokasi);
        dataTanggal = getResources().getStringArray(R.array.data_tanggal);
        dataBahasa = getResources().getStringArray(R.array.data_bahasa);
        dataDurasi = getResources().getStringArray(R.array.data_durasi);
        dataDescription = getResources().getStringArray(R.array.data_description);


        dataCrew1 = getResources().getStringArray(R.array.data_crew_1);
        dataCrew1Profesi = getResources().getStringArray(R.array.data_crew_1_profesi);

        dataCrew2 = getResources().getStringArray(R.array.data_crew_2);
        dataCrew2Profesi = getResources().getStringArray(R.array.data_crew_2_profesi);

        dataCrew3 = getResources().getStringArray(R.array.data_crew_3);
        dataCrew3Profesi = getResources().getStringArray(R.array.data_crew_3_profesi);

        dataCrew4 = getResources().getStringArray(R.array.data_crew_4);
        dataCrew4Profesi = getResources().getStringArray(R.array.data_crew_4_profesi);

        dataCrew5 = getResources().getStringArray(R.array.data_crew_5);
        dataCrew5Profesi = getResources().getStringArray(R.array.data_crew_5_profesi);


        dataPhotoBilled1 = getResources().obtainTypedArray(R.array.data_photo_billed_1);
        dataBilled1 = getResources().getStringArray(R.array.data_billed_1);
        dataBilled1Profesi = getResources().getStringArray(R.array.data_billed_1_profesi);

        dataPhotoBilled2 = getResources().obtainTypedArray(R.array.data_photo_billed_2);
        dataBilled2 = getResources().getStringArray(R.array.data_billed_2);
        dataBilled2Profesi = getResources().getStringArray(R.array.data_billed_2_profesi);

        dataPhotoBilled3 = getResources().obtainTypedArray(R.array.data_photo_billed_3);
        dataBilled3 = getResources().getStringArray(R.array.data_billed_3);
        dataBilled3Profesi = getResources().getStringArray(R.array.data_billed_3_profesi);

        dataPhotoBilled4 = getResources().obtainTypedArray(R.array.data_photo_billed_4);
        dataBilled4 = getResources().getStringArray(R.array.data_billed_4);
        dataBilled4Profesi = getResources().getStringArray(R.array.data_billed_4_profesi);

        dataPhotoBilled5 = getResources().obtainTypedArray(R.array.data_photo_billed_5);
        dataBilled5 = getResources().getStringArray(R.array.data_billed_5);
        dataBilled5Profesi = getResources().getStringArray(R.array.data_billed_5_profesi);

    }

    private void addItem() {
        movieModels = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            MovieModels hero = new MovieModels();
            hero.setImage_movie(dataPhoto.getResourceId(i, -1));
            hero.setJudul_movie(dataName[i]);
            hero.setLokasi_movie(dataLokasi.getResourceId(i, -1));
            hero.setTanggal_terbit(dataTanggal[i]);
            hero.setBahasa_movie(dataBahasa[i]);
            hero.setDurasi_movie(dataDurasi[i]);
            hero.setDesk_movie(dataDescription[i]);


            hero.setCrew1_movie_1(dataCrew1[i]);
            hero.setCrew1_profesi_movie_1(dataCrew1Profesi[i]);

            hero.setCrew1_movie_2(dataCrew2[i]);
            hero.setCrew1_profesi_movie_2(dataCrew2Profesi[i]);

            hero.setCrew1_movie_3(dataCrew3[i]);
            hero.setCrew1_profesi_movie_3(dataCrew3Profesi[i]);

            hero.setCrew1_movie_4(dataCrew4[i]);
            hero.setCrew1_profesi_movie_4(dataCrew4Profesi[i]);

            hero.setCrew1_movie_5(dataCrew5[i]);
            hero.setCrew1_profesi_movie_5(dataCrew5Profesi[i]);

            hero.setPhoto_billed_movie_1(dataPhotoBilled1.getResourceId(i, -1));
            hero.setBilled_movie_1(dataBilled1[i]);
            hero.setData_billed_1_profesi(dataBilled1Profesi[i]);

            hero.setPhoto_billed_movie_2(dataPhotoBilled2.getResourceId(i, -1));
            hero.setBilled_movie_2(dataBilled2[i]);
            hero.setData_billed_2_profesi(dataBilled2Profesi[i]);

            hero.setPhoto_billed_movie_3(dataPhotoBilled3.getResourceId(i, -1));
            hero.setBilled_movie_3(dataBilled3[i]);
            hero.setData_billed_3_profesi(dataBilled3Profesi[i]);

            hero.setPhoto_billed_movie_4(dataPhotoBilled4.getResourceId(i, -1));
            hero.setBilled_movie_4(dataBilled4[i]);
            hero.setData_billed_4_profesi(dataBilled4Profesi[i]);

            hero.setPhoto_billed_movie_5(dataPhotoBilled5.getResourceId(i, -1));
            hero.setBilled_movie_5(dataBilled5[i]);
            hero.setData_billed_5_profesi(dataBilled5Profesi[i]);

            movieModels.add(hero);
        }
        movieAdapter.setModels(movieModels);
    }
}

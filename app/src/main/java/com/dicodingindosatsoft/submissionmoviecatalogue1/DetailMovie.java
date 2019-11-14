package com.dicodingindosatsoft.submissionmoviecatalogue1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Objects;

public class DetailMovie extends AppCompatActivity {
    public static final String EXTRA_PERSON = "extra_person";
    private TextView data_name;
    private TextView data_tanggal;
    private TextView data_bahasa;
    private TextView data_durasi;
    private TextView data_description;
    private ImageView data_photo;
    private ImageView data_lokasi;

    private TextView data_crew_1;
    private TextView data_crew_1_profesi;
    private TextView data_crew_2;
    private TextView data_crew_2_profesi;
    private TextView data_crew_3;
    private TextView data_crew_3_profesi;
    private TextView data_crew_4;
    private TextView data_crew_4_profesi;
    private TextView data_crew_5;
    private TextView data_crew_5_profesi;

    private ImageView data_photo_billed_1;
    private ImageView data_photo_billed_2;
    private ImageView data_photo_billed_3;
    private ImageView data_photo_billed_4;
    private ImageView data_photo_billed_5;
    private TextView data_billed_1;
    private TextView data_billed_1_profesi;
    private TextView data_billed_2;
    private TextView data_billed_2_profesi;
    private TextView data_billed_3;
    private TextView data_billed_3_profesi;
    private TextView data_billed_4;
    private TextView data_billed_4_profesi;
    private TextView data_billed_5;
    private TextView data_billed_5_profesi;

    private CardView crew_1;
    private CardView crew_2;
    private CardView crew_3;
    private CardView crew_4;
    private CardView crew_5;

    private int xdata_photo;
    private int xdata_lokasi;
    private String xdata_name;
    private String xdata_tanggal;
    private String xdata_bahasa;
    private String xdata_durasi;
    private String xdata_description;

    private String xdata_crew_1;
    private String xdata_crew_1_profesi;
    private String xdata_crew_2;
    private String xdata_crew_2_profesi;
    private String xdata_crew_3;
    private String xdata_crew_3_profesi;
    private String xdata_crew_4;
    private String xdata_crew_4_profesi;
    private String xdata_crew_5;
    private String xdata_crew_5_profesi;

    private int xdata_photo_billed_1;
    private int xdata_photo_billed_2;
    private int xdata_photo_billed_3;
    private int xdata_photo_billed_4;
    private int xdata_photo_billed_5;

    private String xdata_billed_1;
    private String xdata_billed_1_profesi;
    private String xdata_billed_2;
    private String xdata_billed_2_profesi;
    private String xdata_billed_3;
    private String xdata_billed_3_profesi;
    private String xdata_billed_4;
    private String xdata_billed_4_profesi;
    private String xdata_billed_5;
    private String xdata_billed_5_profesi;

    private MovieModels models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        models = getIntent().getParcelableExtra(EXTRA_PERSON);

        prepare();
        actionbar();
        getdata();
        setdata();


    }

    private void prepare() {

        data_photo = findViewById(R.id.data_photo);
        data_name = findViewById(R.id.data_name);
        data_lokasi = findViewById(R.id.data_lokasi);
        data_tanggal = findViewById(R.id.data_tanggal);
        data_bahasa = findViewById(R.id.data_bahasa);
        data_durasi = findViewById(R.id.data_durasi);
        data_description = findViewById(R.id.data_description);

        crew_1 = findViewById(R.id.crew_1);
        crew_2 = findViewById(R.id.crew_2);
        crew_3 = findViewById(R.id.crew_3);
        crew_4 = findViewById(R.id.crew_4);
        crew_5 = findViewById(R.id.crew_5);

        data_crew_1 = findViewById(R.id.data_crew_1);
        data_crew_1_profesi = findViewById(R.id.data_crew_1_profesi);

        data_crew_2 = findViewById(R.id.data_crew_2);
        data_crew_2_profesi = findViewById(R.id.data_crew_2_profesi);

        data_crew_3 = findViewById(R.id.data_crew_3);
        data_crew_3_profesi = findViewById(R.id.data_crew_3_profesi);

        data_crew_4 = findViewById(R.id.data_crew_4);
        data_crew_4_profesi = findViewById(R.id.data_crew_4_profesi);

        data_crew_5 = findViewById(R.id.data_crew_5);
        data_crew_5_profesi = findViewById(R.id.data_crew_5_profesi);

        data_photo_billed_1 = findViewById(R.id.data_photo_billed_1);
        data_billed_1 = findViewById(R.id.data_billed_1);
        data_billed_1_profesi = findViewById(R.id.data_billed_1_profesi);

        data_photo_billed_2 = findViewById(R.id.data_photo_billed_2);
        data_billed_2 = findViewById(R.id.data_billed_2);
        data_billed_2_profesi = findViewById(R.id.data_billed_2_profesi);

        data_photo_billed_3 = findViewById(R.id.data_photo_billed_3);
        data_billed_3 = findViewById(R.id.data_billed_3);
        data_billed_3_profesi = findViewById(R.id.data_billed_3_profesi);

        data_photo_billed_4 = findViewById(R.id.data_photo_billed_4);
        data_billed_4 = findViewById(R.id.data_billed_4);
        data_billed_4_profesi = findViewById(R.id.data_billed_4_profesi);

        data_photo_billed_5 = findViewById(R.id.data_photo_billed_5);

        data_billed_5 = findViewById(R.id.data_billed_5);
        data_billed_5_profesi = findViewById(R.id.data_billed_5_profesi);
    }

    private void actionbar() {
        ActionBar actionBar = getSupportActionBar();

        Objects.requireNonNull(actionBar).setTitle("Detail Movie");

        actionBar.setSubtitle("Movie Info");
    }

    private void getdata() {


        assert models != null;
        xdata_photo = models.getImage_movie();
        xdata_name = models.getJudul_movie();
        xdata_lokasi = models.getLokasi_movie();
        xdata_tanggal = models.getTanggal_terbit();
        xdata_bahasa = models.getBahasa_movie();
        xdata_durasi = models.getDurasi_movie();
        xdata_description = models.getDesk_movie();

        xdata_crew_1 = models.getCrew1_movie_1();
        xdata_crew_1_profesi = models.getCrew1_profesi_movie_1();

        xdata_crew_2 = models.getCrew1_movie_2();
        xdata_crew_2_profesi = models.getCrew1_profesi_movie_2();

        xdata_crew_3 = models.getCrew1_movie_3();
        xdata_crew_3_profesi = models.getCrew1_profesi_movie_3();

        xdata_crew_4 = models.getCrew1_movie_4();
        xdata_crew_4_profesi = models.getCrew1_profesi_movie_4();

        xdata_crew_5 = models.getCrew1_movie_5();
        xdata_crew_5_profesi = models.getCrew1_profesi_movie_5();


        xdata_photo_billed_1 = models.getPhoto_billed_movie_1();
        xdata_billed_1 = models.getBilled_movie_1();
        xdata_billed_1_profesi = models.getData_billed_1_profesi();

        xdata_photo_billed_2 = models.getPhoto_billed_movie_2();
        xdata_billed_2 = models.getBilled_movie_2();
        xdata_billed_2_profesi = models.getData_billed_2_profesi();


        xdata_photo_billed_3 = models.getPhoto_billed_movie_3();
        xdata_billed_3 = models.getBilled_movie_3();
        xdata_billed_3_profesi = models.getData_billed_3_profesi();


        xdata_photo_billed_4 = models.getPhoto_billed_movie_4();
        xdata_billed_4 = models.getBilled_movie_4();
        xdata_billed_4_profesi = models.getData_billed_4_profesi();


        xdata_photo_billed_5 = models.getPhoto_billed_movie_5();
        xdata_billed_5 = models.getBilled_movie_5();
        xdata_billed_5_profesi = models.getData_billed_5_profesi();

    }

    private void setdata() {

        Picasso.get().load(xdata_photo).resize(180 + 100, 250 + 150).centerCrop().into(data_photo);
        Picasso.get().load(xdata_lokasi).into(data_lokasi);
        Picasso.get().load(xdata_photo_billed_1).resize(200, 200).centerCrop().into(data_photo_billed_1);
        Picasso.get().load(xdata_photo_billed_2).resize(200, 200).centerCrop().into(data_photo_billed_2);
        Picasso.get().load(xdata_photo_billed_3).resize(200, 200).centerCrop().into(data_photo_billed_3);
        Picasso.get().load(xdata_photo_billed_4).resize(200, 200).centerCrop().into(data_photo_billed_4);
        Picasso.get().load(xdata_photo_billed_5).resize(200, 200).centerCrop().into(data_photo_billed_5);

        data_name.setText(xdata_name);
        data_tanggal.setText(xdata_tanggal);
        data_bahasa.setText(xdata_bahasa);
        data_durasi.setText(xdata_durasi);
        data_description.setText(xdata_description);

        if (xdata_crew_1_profesi.isEmpty()) {
            crew_1.setVisibility(View.GONE);
        } else {
            data_crew_1.setText(xdata_crew_1);
            data_crew_1_profesi.setText(xdata_crew_1_profesi);
        }

        if (xdata_crew_2_profesi.isEmpty()) {
            crew_2.setVisibility(View.GONE);

        } else {

            data_crew_2.setText(xdata_crew_2);
            data_crew_2_profesi.setText(xdata_crew_2_profesi);

        }

        if (xdata_crew_3_profesi.isEmpty()) {
            crew_3.setVisibility(View.GONE);
        } else {
            data_crew_3.setText(xdata_crew_3);
            data_crew_3_profesi.setText(xdata_crew_3_profesi);

        }

        if (xdata_crew_4_profesi.isEmpty()) {
            crew_4.setVisibility(View.GONE);
        } else {
            data_crew_4.setText(xdata_crew_4);
            data_crew_4_profesi.setText(xdata_crew_4_profesi);
        }

        if (xdata_crew_5_profesi.isEmpty()) {
            crew_5.setVisibility(View.GONE);

        } else {


            data_crew_5.setText(xdata_crew_5);
            data_crew_5_profesi.setText(xdata_crew_5_profesi);
        }


        data_billed_1.setText(xdata_billed_1);
        data_billed_1_profesi.setText(xdata_billed_1_profesi);

        data_billed_2.setText(xdata_billed_2);
        data_billed_2_profesi.setText(xdata_billed_2_profesi);


        data_billed_3.setText(xdata_billed_3);
        data_billed_3_profesi.setText(xdata_billed_3_profesi);


        data_billed_4.setText(xdata_billed_4);
        data_billed_4_profesi.setText(xdata_billed_4_profesi);


        data_billed_5.setText(xdata_billed_5);
        data_billed_5_profesi.setText(xdata_billed_5_profesi);

    }
}

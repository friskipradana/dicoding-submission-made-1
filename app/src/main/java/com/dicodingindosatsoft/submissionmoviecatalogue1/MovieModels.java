package com.dicodingindosatsoft.submissionmoviecatalogue1;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModels implements Parcelable {
    public static final Creator<MovieModels> CREATOR = new Creator<MovieModels>() {
        @Override
        public MovieModels createFromParcel(Parcel in) {
            return new MovieModels(in);
        }

        @Override
        public MovieModels[] newArray(int size) {
            return new MovieModels[size];
        }
    };
    private int image_movie, lokasi_movie;
    private String judul_movie, tanggal_terbit, bahasa_movie, durasi_movie, desk_movie;
    private String crew1_movie_1, crew1_profesi_movie_1;
    private String crew1_movie_2, crew1_profesi_movie_2;
    private String crew1_movie_3, crew1_profesi_movie_3;
    private String crew1_movie_4, crew1_profesi_movie_4;
    private String crew1_movie_5, crew1_profesi_movie_5;
    private int photo_billed_movie_1, photo_billed_movie_2, photo_billed_movie_3, photo_billed_movie_4, photo_billed_movie_5;
    private String billed_movie_1, data_billed_1_profesi;
    private String billed_movie_2, data_billed_2_profesi;
    private String billed_movie_3, data_billed_3_profesi;
    private String billed_movie_4, data_billed_4_profesi;
    private String billed_movie_5, data_billed_5_profesi;

    private MovieModels(Parcel in) {
        image_movie = in.readInt();
        lokasi_movie = in.readInt();
        judul_movie = in.readString();
        tanggal_terbit = in.readString();
        bahasa_movie = in.readString();
        durasi_movie = in.readString();
        desk_movie = in.readString();
        crew1_movie_1 = in.readString();
        crew1_profesi_movie_1 = in.readString();
        crew1_movie_2 = in.readString();
        crew1_profesi_movie_2 = in.readString();
        crew1_movie_3 = in.readString();
        crew1_profesi_movie_3 = in.readString();
        crew1_movie_4 = in.readString();
        crew1_profesi_movie_4 = in.readString();
        crew1_movie_5 = in.readString();
        crew1_profesi_movie_5 = in.readString();
        photo_billed_movie_1 = in.readInt();
        photo_billed_movie_2 = in.readInt();
        photo_billed_movie_3 = in.readInt();
        photo_billed_movie_4 = in.readInt();
        photo_billed_movie_5 = in.readInt();
        billed_movie_1 = in.readString();
        data_billed_1_profesi = in.readString();
        billed_movie_2 = in.readString();
        data_billed_2_profesi = in.readString();
        billed_movie_3 = in.readString();
        data_billed_3_profesi = in.readString();
        billed_movie_4 = in.readString();
        data_billed_4_profesi = in.readString();
        billed_movie_5 = in.readString();
        data_billed_5_profesi = in.readString();
    }

    public MovieModels() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image_movie);
        dest.writeInt(lokasi_movie);
        dest.writeString(judul_movie);
        dest.writeString(tanggal_terbit);
        dest.writeString(bahasa_movie);
        dest.writeString(durasi_movie);
        dest.writeString(desk_movie);
        dest.writeString(crew1_movie_1);
        dest.writeString(crew1_profesi_movie_1);
        dest.writeString(crew1_movie_2);
        dest.writeString(crew1_profesi_movie_2);
        dest.writeString(crew1_movie_3);
        dest.writeString(crew1_profesi_movie_3);
        dest.writeString(crew1_movie_4);
        dest.writeString(crew1_profesi_movie_4);
        dest.writeString(crew1_movie_5);
        dest.writeString(crew1_profesi_movie_5);
        dest.writeInt(photo_billed_movie_1);
        dest.writeInt(photo_billed_movie_2);
        dest.writeInt(photo_billed_movie_3);
        dest.writeInt(photo_billed_movie_4);
        dest.writeInt(photo_billed_movie_5);
        dest.writeString(billed_movie_1);
        dest.writeString(data_billed_1_profesi);
        dest.writeString(billed_movie_2);
        dest.writeString(data_billed_2_profesi);
        dest.writeString(billed_movie_3);
        dest.writeString(data_billed_3_profesi);
        dest.writeString(billed_movie_4);
        dest.writeString(data_billed_4_profesi);
        dest.writeString(billed_movie_5);
        dest.writeString(data_billed_5_profesi);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public int getImage_movie() {
        return image_movie;
    }

    public void setImage_movie(int image_movie) {
        this.image_movie = image_movie;
    }

    public int getLokasi_movie() {
        return lokasi_movie;
    }

    public void setLokasi_movie(int lokasi_movie) {
        this.lokasi_movie = lokasi_movie;
    }

    public String getJudul_movie() {
        return judul_movie;
    }

    public void setJudul_movie(String judul_movie) {
        this.judul_movie = judul_movie;
    }

    public String getTanggal_terbit() {
        return tanggal_terbit;
    }

    public void setTanggal_terbit(String tanggal_terbit) {
        this.tanggal_terbit = tanggal_terbit;
    }

    public String getBahasa_movie() {
        return bahasa_movie;
    }

    public void setBahasa_movie(String bahasa_movie) {
        this.bahasa_movie = bahasa_movie;
    }

    public String getDurasi_movie() {
        return durasi_movie;
    }

    public void setDurasi_movie(String durasi_movie) {
        this.durasi_movie = durasi_movie;
    }

    public String getDesk_movie() {
        return desk_movie;
    }

    public void setDesk_movie(String desk_movie) {
        this.desk_movie = desk_movie;
    }

    public String getCrew1_movie_1() {
        return crew1_movie_1;
    }

    public void setCrew1_movie_1(String crew1_movie_1) {
        this.crew1_movie_1 = crew1_movie_1;
    }

    public String getCrew1_profesi_movie_1() {
        return crew1_profesi_movie_1;
    }

    public void setCrew1_profesi_movie_1(String crew1_profesi_movie_1) {
        this.crew1_profesi_movie_1 = crew1_profesi_movie_1;
    }

    public String getCrew1_movie_2() {
        return crew1_movie_2;
    }

    public void setCrew1_movie_2(String crew1_movie_2) {
        this.crew1_movie_2 = crew1_movie_2;
    }

    public String getCrew1_profesi_movie_2() {
        return crew1_profesi_movie_2;
    }

    public void setCrew1_profesi_movie_2(String crew1_profesi_movie_2) {
        this.crew1_profesi_movie_2 = crew1_profesi_movie_2;
    }

    public String getCrew1_movie_3() {
        return crew1_movie_3;
    }

    public void setCrew1_movie_3(String crew1_movie_3) {
        this.crew1_movie_3 = crew1_movie_3;
    }

    public String getCrew1_profesi_movie_3() {
        return crew1_profesi_movie_3;
    }

    public void setCrew1_profesi_movie_3(String crew1_profesi_movie_3) {
        this.crew1_profesi_movie_3 = crew1_profesi_movie_3;
    }

    public String getCrew1_movie_4() {
        return crew1_movie_4;
    }

    public void setCrew1_movie_4(String crew1_movie_4) {
        this.crew1_movie_4 = crew1_movie_4;
    }

    public String getCrew1_profesi_movie_4() {
        return crew1_profesi_movie_4;
    }

    public void setCrew1_profesi_movie_4(String crew1_profesi_movie_4) {
        this.crew1_profesi_movie_4 = crew1_profesi_movie_4;
    }

    public String getCrew1_movie_5() {
        return crew1_movie_5;
    }

    public void setCrew1_movie_5(String crew1_movie_5) {
        this.crew1_movie_5 = crew1_movie_5;
    }

    public String getCrew1_profesi_movie_5() {
        return crew1_profesi_movie_5;
    }

    public void setCrew1_profesi_movie_5(String crew1_profesi_movie_5) {
        this.crew1_profesi_movie_5 = crew1_profesi_movie_5;
    }

    public int getPhoto_billed_movie_1() {
        return photo_billed_movie_1;
    }

    public void setPhoto_billed_movie_1(int photo_billed_movie_1) {
        this.photo_billed_movie_1 = photo_billed_movie_1;
    }

    public int getPhoto_billed_movie_2() {
        return photo_billed_movie_2;
    }

    public void setPhoto_billed_movie_2(int photo_billed_movie_2) {
        this.photo_billed_movie_2 = photo_billed_movie_2;
    }

    public int getPhoto_billed_movie_3() {
        return photo_billed_movie_3;
    }

    public void setPhoto_billed_movie_3(int photo_billed_movie_3) {
        this.photo_billed_movie_3 = photo_billed_movie_3;
    }

    public int getPhoto_billed_movie_4() {
        return photo_billed_movie_4;
    }

    public void setPhoto_billed_movie_4(int photo_billed_movie_4) {
        this.photo_billed_movie_4 = photo_billed_movie_4;
    }

    public int getPhoto_billed_movie_5() {
        return photo_billed_movie_5;
    }

    public void setPhoto_billed_movie_5(int photo_billed_movie_5) {
        this.photo_billed_movie_5 = photo_billed_movie_5;
    }

    public String getBilled_movie_1() {
        return billed_movie_1;
    }

    public void setBilled_movie_1(String billed_movie_1) {
        this.billed_movie_1 = billed_movie_1;
    }

    public String getData_billed_1_profesi() {
        return data_billed_1_profesi;
    }

    public void setData_billed_1_profesi(String data_billed_1_profesi) {
        this.data_billed_1_profesi = data_billed_1_profesi;
    }

    public String getBilled_movie_2() {
        return billed_movie_2;
    }

    public void setBilled_movie_2(String billed_movie_2) {
        this.billed_movie_2 = billed_movie_2;
    }

    public String getData_billed_2_profesi() {
        return data_billed_2_profesi;
    }

    public void setData_billed_2_profesi(String data_billed_2_profesi) {
        this.data_billed_2_profesi = data_billed_2_profesi;
    }

    public String getBilled_movie_3() {
        return billed_movie_3;
    }

    public void setBilled_movie_3(String billed_movie_3) {
        this.billed_movie_3 = billed_movie_3;
    }

    public String getData_billed_3_profesi() {
        return data_billed_3_profesi;
    }

    public void setData_billed_3_profesi(String data_billed_3_profesi) {
        this.data_billed_3_profesi = data_billed_3_profesi;
    }

    public String getBilled_movie_4() {
        return billed_movie_4;
    }

    public void setBilled_movie_4(String billed_movie_4) {
        this.billed_movie_4 = billed_movie_4;
    }

    public String getData_billed_4_profesi() {
        return data_billed_4_profesi;
    }

    public void setData_billed_4_profesi(String data_billed_4_profesi) {
        this.data_billed_4_profesi = data_billed_4_profesi;
    }

    public String getBilled_movie_5() {
        return billed_movie_5;
    }

    public void setBilled_movie_5(String billed_movie_5) {
        this.billed_movie_5 = billed_movie_5;
    }

    public String getData_billed_5_profesi() {
        return data_billed_5_profesi;
    }

    public void setData_billed_5_profesi(String data_billed_5_profesi) {
        this.data_billed_5_profesi = data_billed_5_profesi;
    }
}
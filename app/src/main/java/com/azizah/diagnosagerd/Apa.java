package com.azizah.diagnosagerd;

import android.os.Parcel;
import android.os.Parcelable;

public class Apa implements Parcelable {

private String nama, penjelasan;
private int foto;

    public Apa() {
    }

    public Apa(String nama, String penjelasan, int foto) {
        this.nama = nama;
        this.penjelasan = penjelasan;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPenjelasan() {
        return penjelasan;
    }

    public void setPenjelasan(String penjelasan) {
        this.penjelasan = penjelasan;
    }



    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.penjelasan);
        dest.writeInt(this.foto);
    }

    protected Apa(Parcel in) {
        this.nama = in.readString();
        this.penjelasan = in.readString();
        this.foto = in.readInt();
    }

    public static final Creator<Apa> CREATOR = new Creator<Apa>() {
        @Override
        public Apa createFromParcel(Parcel source) {
            return new Apa(source);
        }

        @Override
        public Apa[] newArray(int size) {
            return new Apa[size];
        }
    };
}

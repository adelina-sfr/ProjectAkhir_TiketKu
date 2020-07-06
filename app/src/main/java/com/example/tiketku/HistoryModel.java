package com.example.tiketku;

public class HistoryModel {

    private String mIdBook;
    private String mTanggal;
    private String mRiwayat;
    private String mTotal;

    public HistoryModel(String idBook, String tanggal, String riwayat, String total) {
        mIdBook = idBook;
        mTanggal = tanggal;
        mRiwayat = riwayat;
        mTotal = total;

    }

    public String getIdBook() {

        return mIdBook;
    }

    public String getTanggal() {

        return mTanggal;
    }

    public String getRiwayat() {

        return mRiwayat;
    }

    public String getTotal() {

        return mTotal;
    }

}

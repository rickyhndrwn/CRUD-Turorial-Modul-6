package com.crudtutorial;

class Konfigurasi {
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.43.29/crud_tutor/insert.php";
    public static final String URL_GET_ALL = "http://192.168.43.29/crud_tutor/read.php";
    public static final String URL_GET_EMP = "http://192.168.43.29/crud_tutor/select.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.29/crud_tutor/updatee.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.29/crud_tutor/delete.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke script PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    //ID karyawan
    public static final String EMP_ID = "emp_id";
}

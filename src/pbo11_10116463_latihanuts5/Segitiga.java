/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116463_latihanuts5;

/**
 *
 * @author LENOVO
 */
public class Segitiga implements BangunDatar {

    private int luas;
    private int keliling;
    final private int sisiAb;
    final private int sisiBc;
    final private int sisiCa;
    final private int alas;
    final private int tinggi;

    public Segitiga(int sisiAb, int sisiBc, int sisiCa, int alas, int tinggi) {
        this.sisiAb = sisiAb;
        this.sisiBc = sisiBc;
        this.sisiCa = sisiCa;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungLuas() {
        luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga     : " + luas);
    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCa;
        System.out.println("Keliling Segitiga : " + keliling);

    }

}

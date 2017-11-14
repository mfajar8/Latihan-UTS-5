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
public class JajarGenjang implements BangunDatar{

    private int luas;
    private int keliling;
    final private int sisiAb;
    final private int sisiBc;
    final private int sisiCd;
    final private int sisiDa;
    final private int alas;
    final private int tinggi;

    public JajarGenjang(int ab, int bc, int cd, int da, int alas, int tinggi) {
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCd = cd;
        this.sisiDa = da;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public void hitungLuas(){
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang     : "+luas);
    }
    
    @Override
    public void hitungKeliling(){
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang : "+keliling);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116463_latihanuts5;

/**
 *
 * @author LENOVO PBO11_10116463_Mochamad Fajar Ismatulloh
 */
public class PBO11_10116463_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang oJG = new JajarGenjang(50, 60, 70, 80, 100, 120);
        oJG.hitungKeliling();
        oJG.hitungLuas();

        Segitiga oST = new Segitiga(50, 60, 70, 100, 120);
        oST.hitungKeliling();
        oST.hitungLuas();
    }

}

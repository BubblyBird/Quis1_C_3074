/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1_genap_3074;

/**
 *
 * @author LENOVO YOGA
 *Putri Aulia Hamzah
 *21103074
 *S1-SI05-C
 */

class Dokter_3074 extends Penduduk_3074 {
    int jmlPasien, jmlObat;
    double totalPendapatanDokter;
    
    public double totalPendapatanDokter(){
        return totalPendapatanDokter = (jmlPasien * 50000) + (jmlObat * 10000);
    }    
    public void tampilDataDokter(){
        System.out.println("Jumlah Pasien            : " +jmlPasien);
        System.out.println("Jumlah Obat              : " +jmlObat);
        totalPendapatanDokter();
        System.out.println("Total Pendapatan Dokter  : Rp. "+totalPendapatanDokter);
    }
}

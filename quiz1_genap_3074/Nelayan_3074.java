/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1_genap_3074;

/**
 *
 * @author LENOVO YOGA
 * Putri Aulia Hamzah
 * 21103074
 * S1-SI05-C
 */
class Nelayan_3074 extends Penduduk_3074{
    int jmlBeratIkan, jmlSolar;
    double totalPendapatanNelayan;
    
    public double totalPendapatanNelayan(){
        return totalPendapatanNelayan = (jmlBeratIkan * 8000) + (jmlSolar * 10000);
    }
    
    public void tampilDataNelayan(){
        System.out.println("Jumlah Berat Ikan        : " +jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar       : " +jmlSolar);
        totalPendapatanNelayan();
        System.out.println("Total Pendapatan Nelayan : Rp. "+totalPendapatanNelayan);
    }
}
    


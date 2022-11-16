/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quiz1_genap_3074;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO YOGA
 * Putri Aulia Hamzah
 * 21103074
 * S1-SI05-C
 */
public class Quiz1_Genap_3074 {

    public static void main(String[] args) {
     
        Nelayan_3074 n1 = new Nelayan_3074();
        Nelayan_3074 n2 = new Nelayan_3074();
        Dokter_3074 d1 = new Dokter_3074();
        Dokter_3074 d2 = new Dokter_3074();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("=== INPUT DATA NELAYAN 1 ===");
            System.out.print("NIK                   : ");
            n1.nik = br.readLine();
            System.out.print("Nama                  : ");
            n1.nama = br.readLine();
            System.out.print("Umur                  : ");
            n1.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat                : ");
            n1.alamat = br.readLine();
            System.out.print("Jumlah Berat Ikan     : ");
            n1.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Pakai Solar    : ");
            n1.jmlSolar = Integer.parseInt(br.readLine());
          
            System.out.println();
            
            System.out.println("=== INPUT DATA NELAYAN 2 ===");
            System.out.print("NIK                   : ");
            n2.nik = br.readLine();
            System.out.print("Nama                  : ");
            n2.nama = br.readLine();
            System.out.print("Umur                  : ");
            n2.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat                : ");
            n2.alamat = br.readLine();
            System.out.print("Jumlah Berat Ikan     : ");
            n2.jmlBeratIkan = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Pakai Solar    : ");
            n2.jmlSolar = Integer.parseInt(br.readLine());
            
            System.out.println();
            
            System.out.println("=== INPUT DATA DOKTER 1 ===");
            System.out.print("NIK                   : ");
            d1.nik = br.readLine();
            System.out.print("Nama                  : ");
            d1.nama = br.readLine();
            System.out.print("Umur                  : ");
            d1.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat                : ");
            d1.alamat = br.readLine();
            System.out.print("Jumlah Pasien         : ");
            d1.jmlPasien = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Obat           : ");
            d1.jmlObat = Integer.parseInt(br.readLine());

            System.out.println();
            
            System.out.println("=== INPUT DATA DOKTER 2 ===");
            System.out.print("NIK                   : ");
            d2.nik = br.readLine();
            System.out.print("Nama                  : ");
            d2.nama = br.readLine();
            System.out.print("Umur                  : ");
            d2.umur = Integer.parseInt(br.readLine());
            System.out.print("Alamat                : ");
            d2.alamat = br.readLine();
            System.out.print("Jumlah Pasien         : ");
            d2.jmlPasien = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Obat           : ");
            d2.jmlObat = Integer.parseInt(br.readLine());
       
            System.out.println();
            System.out.println("=========== DATA NELAYAN ===========");
            System.out.println();
            
            n1.tampilDataPenduduk();
            n1.tampilDataNelayan();
           
            System.out.println();
            
            n2.tampilDataPenduduk();
            n2.tampilDataNelayan();
            
            System.out.println();
            System.out.println("=========== DATA DOKTER ===========");
            System.out.println();
            
            d1.tampilDataPenduduk();
            d1.tampilDataDokter();
            
            System.out.println();
            
            d2.tampilDataPenduduk();
            d2.tampilDataDokter();

        } catch (IOException eox){
            System.out.println(eox);
        }
    }             
}

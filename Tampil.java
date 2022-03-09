package Tugas_Proyek_Individu;

import java.util.Scanner;

public class Tampil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Data_Barang Data = new Data_Barang();

        System.out.print("Masukan Nama Anda : ");
        Data.NaPeng = scan.next();
        System.out.print("Masukan Alamat Anda : ");
        Data.Alpeng = scan.next();
        System.out.print("Masukan Nama penerima barang :");
        Data.Napen = scan.next();
        System.out.print("Masukan Alamat yang di tuju : ");
        Data.Alpen = scan.next();
      

        Data.Pengirim_Barang();
        Data.Penerima_Barang();
        System.out.println("Pajak Pengiriman : Rp."+Data.bayar(300000));
        System.out.println("Biaya Pengiriman : Rp."+Data.bayar(900000));
        System.out.println("Total : Rp."+(Data.bayar(900000)+Data.bayar(300000)));
        
    }
}

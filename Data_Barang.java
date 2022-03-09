package Tugas_Proyek_Individu;

public class Data_Barang extends Barang {

    public String NaPeng, Napen, Barang, Alpeng, Alpen;
    public int bayar, total;

    //overriding
    public void Pengirim_Barang() {
        System.out.println("Nama pengirim : " + NaPeng);
        System.out.println("Alamat pengirim : " + Alpeng);

    }

    public void Penerima_Barang() {
        System.out.println("Jenis Barang : " + super.Barang);
        System.out.println("Nama Penerima : " + Napen);
        System.out.println("Alamat : " + Alpen);
        System.out.println("Barang anda akan di kirim melalui jasa antar barang " + super.nama);
        System.out.println("Terimakasih sudah menggunakan jasa pengiriman kami");

    }
    //overloading
    public int bayar(int biaya) {
        this.bayar = biaya;
        return bayar;
    }

    public void bayar(double pajak) {
        System.out.println("Pajak pengiriman : Rp." + pajak);
        System.out.println("Barang anda akan di kirim melalui jasa antar barang " + super.nama);
        System.out.println("Terimakasih sudah menggunakan jasa pengiriman kami");
    }

}

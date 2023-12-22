import static java.lang.System.out;
import java.util.Scanner;
public class Food {
    public String namapelanggan;
    public String pesanan;
    public int harga;
    public double diskon;
    public double total;

    public String getNamapelanggan() {
        return namapelanggan;
    }
    public void setNamapelanggan(String newNama) {
        this.namapelanggan = newNama;
    }
    public String getPesanan() {
        return pesanan;
    }
    public void setPesanan(String newPesanan) {
        this.pesanan = newPesanan;
    }

    public int getHarga() {
        return harga;
    }
    public void setHarga(int newHarga) {
        this.harga = newHarga;
    }

    public double getDiskon() {
        return diskon;
    }
    public void setDiskon(double newDiskon) {
        this.diskon = newDiskon;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double newTotal) {
        this.total = newTotal;
    }

    public static void main (String [] ayaa) {
        out.println("-----------------------------");
        Scanner sc = new Scanner(System.in);
        out.print("Nama pelanggan: " );
        String namapelanggan1 = sc.nextLine();
        out.print("Pesanan anda: ");
        String barang1 = sc.nextLine();
        out.print("Harga pesanan: ");
        int harga1 = sc.nextInt();
        double diskon1 = harga1 * 0.1;
        double jumlah1 = harga1 - diskon1;
        out.println("Diskon anda: 10%");
        out.println("-------RESI PEMBAYARAN-------");
        out.println("Nama pelanggan: " + namapelanggan1);
        out.println("Nama barang: " +barang1);
        out.println("Harga barang: " +harga1);
        out.println("Total pembayaran anda: \t" + jumlah1);
        out.println("-----------------------------");
    }
}
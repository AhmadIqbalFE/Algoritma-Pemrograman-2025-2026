import java.util.Scanner;

public class programkasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double harga;
        int jumlah;

        System.out.print("Masukkan Nama Barang: ");
        nama = input.nextLine();

        System.out.print("Masukkan Harga Barang: ");
        harga = input.nextDouble();

        System.out.print("Masukkan Jumlah Beli Barang: ");
        jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon;

        if (total > 600000) {
            diskon = total * 0.10;
        } else {
            diskon = 0;
        }

        double totalBayar = total - diskon;

        System.out.println("\n==== STRUK PEMBELIAN ====");
        System.out.println("Nama Barang       : " + nama);
        System.out.println("Harga Satuan      : " + harga);
        System.out.println("Jumlah Beli       : " + jumlah);
        System.out.println("Total Harga       : " + total);
        System.out.println("Diskon            : " + diskon);
        System.out.println("Total Pembayaran  : " + totalBayar);
        System.out.println("=========================");
    }
}

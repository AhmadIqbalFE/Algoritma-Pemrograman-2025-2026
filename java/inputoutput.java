import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.println("=== Data Pengguna ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");

        input.close();
    }
}

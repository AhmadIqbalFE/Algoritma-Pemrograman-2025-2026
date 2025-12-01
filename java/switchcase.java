import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama;

        // Input nama sampai valid
        while (true) {
            System.out.print("Masukkan Nama Anda: ");
            nama = in.nextLine();

            if (nama.trim().isEmpty()) {
                System.out.println("Nama tidak boleh kosong!");
                continue;
            }

            System.out.print("Apakah nama sudah benar? (true/false): ");
            String valid = in.nextLine().trim().toLowerCase();

            if (valid.equals("true")) break;

            System.out.println("Nama salah, masukkan kembali.\n");
        }

        // Input NIM (angka saja)
        long nim;
        while (true) {
            System.out.print("\nMasukkan NIM (angka saja): ");
            String inputNim = in.nextLine();

            if (!inputNim.matches("\\d+")) {
                System.out.println("NIM harus berupa angka! Coba lagi.");
                continue;
            }

            nim = Long.parseLong(inputNim);
            break;
        }

        long saldo = nim;

        System.out.println("\n===== DATA AWAL =====");
        System.out.println("Nama  : " + nama);
        System.out.println("Saldo : Rp " + String.format("%,d", saldo).replace(",", "."));

        while (true) {
            System.out.println("\n===== MENU ATM =====");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            String menuInput = in.nextLine();

            if (!menuInput.matches("\\d")) {
                System.out.println("Menu tidak valid!");
                continue;
            }

            int menu = Integer.parseInt(menuInput);

            switch (menu) {
                case 1: 
                    System.out.println("Saldo anda: Rp " + String.format("%,d", saldo).replace(",", "."));
                    break;

                case 2:
                    System.out.print("Nominal tarik: ");
                    String tarikInput = in.nextLine();

                    if (!tarikInput.matches("\\d+")) {
                        System.out.println("Nominal harus angka!");
                        break;
                    }

                    long tarik = Long.parseLong(tarikInput);

                    if (tarik > saldo) {
                        System.out.println("Saldo tidak cukup!");
                    } else {
                        saldo -= tarik;
                        System.out.println("Anda menarik Rp " + String.format("%,d", tarik).replace(",", "."));
                    }
                    break;

                case 3:
                    System.out.print("Nominal setor: ");
                    String setorInput = in.nextLine();

                    if (!setorInput.matches("\\d+")) {
                        System.out.println("Nominal harus angka!");
                        break;
                    }

                    long setor = Long.parseLong(setorInput);
                    saldo += setor;
                    System.out.println("Anda menyetor Rp " + String.format("%,d", setor).replace(",", "."));
                    break;

                case 4:
                    System.out.print("Nominal transfer: ");
                    String transferInput = in.nextLine();

                    if (!transferInput.matches("\\d+")) {
                        System.out.println("Nominal harus angka!");
                        break;
                    }

                    long transfer = Long.parseLong(transferInput);

                    if (transfer > saldo) {
                        System.out.println("Saldo tidak cukup untuk transfer!");
                    } else {
                        saldo -= transfer;
                        System.out.println("Anda transfer Rp " + String.format("%,d", transfer).replace(",", "."));
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan ATM!");
                    return;

                default:
                    System.out.println("Menu tidak valid!");
            }
        }
    }
}

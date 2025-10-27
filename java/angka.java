import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println(a + "Lebih besar dari" + b);
        else if (a < b)
            System.out.println(a+ "Lebih kecil dari" + b);
        else
            System.out.println("Keduanya sama besar");
        
        System.out.println("Apakah keduanya sama?" + (a == b));
    }
}

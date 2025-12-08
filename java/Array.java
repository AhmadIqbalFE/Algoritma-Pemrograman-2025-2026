import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale; 

public class Array { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Masukkan NIM Anda (contoh: 2310355): ");
        String nimString = scanner.nextLine();
        
        ArrayList<Integer> nimArray = new ArrayList<>();
        long totalDigit = 0;
        
        for (int i = 0; i < nimString.length(); i++) {
            char digitChar = nimString.charAt(i);
            
            int digit = Character.getNumericValue(digitChar); 
            
            nimArray.add(digit);
            totalDigit += digit;
        }

        System.out.println("\nArray Digit NIM Anda: " + nimArray.toString());

        int nilaiMaksimum = Collections.max(nimArray); 

        int nilaiMinimum = Collections.min(nimArray); 

        int jumlahDigit = nimArray.size();
        double nilaiRataRata = (double) totalDigit / jumlahDigit; 

        ArrayList<Integer> reverseNimArray = new ArrayList<>(nimArray);
        Collections.reverse(reverseNimArray); 

        // --- Output Hasil ---
        System.out.println("\n=== Hasil Perhitungan Digit ===");
        System.out.println("1. Total seluruh digit      : " + totalDigit);
        System.out.println("2. Nilai maksimum digit     : " + nilaiMaksimum);
        System.out.println("3. Nilai minimum digit      : " + nilaiMinimum);
        
        // Menggunakan String.format dengan Locale.US agar output desimal selalu menggunakan titik
        System.out.println("4. Nilai rata-rata digit    : " + String.format(Locale.US, "%.2f", nilaiRataRata));
        System.out.println("5. Reverse Array NIM        : " + reverseNimArray.toString());
        
        scanner.close();
    }
}
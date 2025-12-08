<?php

$nim_string = readline("Masukkan NIM Anda (contoh: 2310355): ");

$nim_char_array = str_split($nim_string);

$nim_array = [];
foreach ($nim_char_array as $digit_char) {
    $nim_array[] = (int)$digit_char;
}

echo "\nArray Digit NIM Anda: [" . implode(", ", $nim_array) . "]\n";

$total_digit = array_sum($nim_array);

$nilai_maksimum = max($nim_array);

$nilai_minimum = min($nim_array);

$jumlah_digit = count($nim_array);

$nilai_rata_rata = $total_digit / $jumlah_digit;

$reverse_nim_array = array_reverse($nim_array);

// --- Output Hasil ---
echo "\n=== Hasil Perhitungan Digit ===\n";
echo "1. Total seluruh digit      : " . $total_digit . "\n";
echo "2. Nilai maksimum digit     : " . $nilai_maksimum . "\n";
echo "3. Nilai minimum digit      : " . $nilai_minimum . "\n";
// Menggunakan number_format untuk format 2 desimal
echo "4. Nilai rata-rata digit    : " . number_format($nilai_rata_rata, 2) . "\n"; 
echo "5. Reverse Array NIM        : [" . implode(", ", $reverse_nim_array) . "]\n";
?>
<?php

// Fungsi untuk meminta nama sampai valid
function inputNama() {
    while (true) {
        echo "Masukkan nama: ";
        $nama = trim(fgets(STDIN));

        if ($nama == "") {
            echo "Nama tidak boleh kosong! Coba lagi.\n";
            continue;
        }

        echo "Apakah nama sudah benar? (true/false): ";
        $valid = trim(fgets(STDIN));

        if (strtolower($valid) === "true") {
            return $nama;
        }

        echo "Nama salah, masukkan kembali.\n\n";
    }
}

// Input nama
$nama = inputNama();

// Input NIM
echo "\nMasukkan NIM (angka saja): ";
$nim = trim(fgets(STDIN));

$saldo = number_format($nim, 0, ',', '.');

echo "\n===== DATA AWAL =====\n";
echo "Nama  : $nama\n";
echo "Saldo : Rp $saldo\n";

while (true) {
    echo "\n===== MENU ATM =====\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih menu: ";
    $menu = trim(fgets(STDIN));

    switch ($menu) {
        case 1:
            echo "Saldo anda: Rp $saldo\n";
            break;

        case 2:
            echo "Masukkan nominal tarik: ";
            $tarik = trim(fgets(STDIN));
            echo "Anda menarik Rp " . number_format($tarik, 0, ',', '.') . "\n";
            break;

        case 3:
            echo "Masukkan nominal setor: ";
            $setor = trim(fgets(STDIN));
            echo "Anda menyetor Rp " . number_format($setor, 0, ',', '.') . "\n";
            break;

        case 4:
            echo "Masukkan nominal transfer: ";
            $transfer = trim(fgets(STDIN));
            echo "Anda transfer Rp " . number_format($transfer, 0, ',', '.') . "\n";
            break;

        case 5:
            exit("Terima kasih telah menggunakan ATM!\n");

        default:
            echo "Menu tidak tersedia.\n";
    }
}

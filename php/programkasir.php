<?php

// Input data
echo "Masukkan Nama Barang: ";
$nama = trim(fgets(STDIN));

echo "Masukkan Harga Barang: ";
$harga = floatval(fgets(STDIN));

echo "Masukkan Jumlah Beli Barang: ";
$jumlah = intval(fgets(STDIN));

// Hitung total
$total = $harga * $jumlah;

// Hitung diskon
if ($total > 600000) {
    $diskon = $total * 0.10;
} else {
    $diskon = 0;
}

$total_bayar = $total - $diskon;

// Output
echo "\n==== STRUK PEMBELIAN ====\n";
echo "Nama Barang       : $nama\n";
echo "Harga Satuan      : $harga\n";
echo "Jumlah Beli       : $jumlah\n";
echo "Total Harga       : $total\n";
echo "Diskon            : $diskon\n";
echo "Total Pembayaran  : $total_bayar\n";
echo "=========================\n";

?>

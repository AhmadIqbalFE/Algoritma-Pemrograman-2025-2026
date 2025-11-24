#include <iostream>
using namespace std;

int main() {
    string nama;
    float harga;
    int jumlah;

cout << "Masukkan Nama Barang: ";
cin >> nama;

cout << "Masukkan Harga Barang: ";
cin >> harga;

cout << "Masukkan Jumlah Barang: ";
cin >> jumlah;

float total = harga * jumlah;
float diskon;

if (total > 660000) {
    diskon = total * 0.10;
} else {
    diskon = 0;
}

float total_bayar = total - diskon;

    cout << "\n==== STRUK PEMBELIAN ====\n";
    cout << "Nama Barang       : " << nama << endl;
    cout << "Harga Satuan      : " << harga << endl;
    cout << "Jumlah Beli       : " << jumlah << endl;
    cout << "Total Harga       : " << total << endl;
    cout << "Diskon            : " << diskon << endl;
    cout << "Total Pembayaran  : " << total_bayar << endl;
    cout << "=========================" << endl;

    return 0;
}
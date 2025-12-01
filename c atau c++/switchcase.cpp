#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

string inputNama() {
    string nama;
    string valid;

    while (true) {
        cout << "Masukkan Nama Anda: ";
        getline(cin, nama);

        if (nama.empty()) {
            cout << "Harap Nama Tidak Boleh Kosong!\n";
            continue;
        }

        cout << "Apakah Nama Anda Sudah Benar? (true/false): ";
        cin >> valid;
        cin.ignore();

        if (valid == "true" || valid == "TRUE") {
            return nama;
        }

        cout << "Nama Salah, Harap Masukkan Kembali.\n\n";
    }
}

int main() {
    // Input nama
    string nama = inputNama();

    // Input NIM
    long long nim;
    cout << "\nMasukkan NIM Anda(angka saja): ";
    cin >> nim;
    cin.ignore();

    long long saldo = nim;

    cout << "\n===== DATA AWAL =====\n";
    cout << "Nama  : " << nama << endl;
    cout << "Saldo : Rp " << saldo << endl;

    int menu;
    while (true) {
        cout << "\n===== MENU ATM =====\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
        cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";
        cout << "Pilih menu: ";
        cin >> menu;

        switch (menu) {
            case 1:
                cout << "Saldo anda: Rp " << saldo << endl;
                break;

            case 2: {
                long long tarik;
                cout << "Nominal tarik: ";
                cin >> tarik;
                cout << "Anda menarik Rp " << tarik << endl;
                break;
            }

            case 3: {
                long long setor;
                cout << "Nominal setor: ";
                cin >> setor;
                cout << "Anda menyetor Rp " << setor << endl;
                break;
            }

            case 4: {
                long long transfer;
                cout << "Nominal transfer: ";
                cin >> transfer;
                cout << "Anda transfer Rp " << transfer << endl;
                break;
            }

            case 5:
                cout << "Terima kasih telah menggunakan ATM!\n";
                return 0;

            default:
                cout << "Menu tidak valid!\n";
        }
    }
}

#include <iostream>
#include <vector>
#include <string>
#include <numeric> 
#include <algorithm> 
#include <cmath> 
#include <iomanip>
using namespace std;


int main() {

    string nim_string;
    cout << "Masukkan NIM Anda (contoh: 2310355): ";
    cin >> nim_string;

    vector<int> nim_array;
    long long total_digit = 0; 

    for (char digit_char : nim_string) {
        
        int digit = digit_char - '0';
        nim_array.push_back(digit);
        total_digit += digit; 
    }

    cout << "\nArray Digit NIM Anda: [ ";
    for (int digit : nim_array) {
        cout << digit << " ";
    }
    cout << "]" << endl;

    int nilai_maksimum = *max_element(nim_array.begin(), nim_array.end());

    int nilai_minimum = *min_element(nim_array.begin(), nim_array.end());

    double jumlah_digit = nim_array.size(); 
    double nilai_rata_rata = (double)total_digit / jumlah_digit;

    vector<int> reverse_nim_array = nim_array; 
    reverse(reverse_nim_array.begin(), reverse_nim_array.end());

    
    cout << "\n=== Hasil Perhitungan Digit ===" << endl;
    cout << "1. Total seluruh digit      : " << total_digit << endl;
    cout << "2. Nilai maksimum digit     : " << nilai_maksimum << endl;
    cout << "3. Nilai minimum digit      : " << nilai_minimum << endl;
    cout << "4. Nilai rata-rata digit    : " << fixed << setprecision(2) << nilai_rata_rata << endl; 
    cout << "5. Reverse Array NIM        : [ ";
    for (int digit : reverse_nim_array) {
        cout << digit << " ";
    }
    cout << "]" << endl;

    return 0;
}
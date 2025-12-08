nim_string = input("Masukkan NIM Anda (contoh: 2310355): ")

nim_array = []
for digit_char in nim_string:
   
    nim_array.append(int(digit_char))

print(f"\nArray Digit NIM Anda: {nim_array}")

total_digit = sum(nim_array)

nilai_maksimum = max(nim_array)

nilai_minimum = min(nim_array)

jumlah_digit = len(nim_array)
nilai_rata_rata = total_digit / jumlah_digit

reverse_nim_array = nim_array[:] 
reverse_nim_array.reverse()

# --- Output Hasil ---
print("\n=== Hasil Perhitungan Digit ===")
print(f"1. Total seluruh digit      : {total_digit}")
print(f"2. Nilai maksimum digit     : {nilai_maksimum}")
print(f"3. Nilai minimum digit      : {nilai_minimum}")
print(f"4. Nilai rata-rata digit    : {nilai_rata_rata:.2f}") # Dibulatkan 2 desimal
print(f"5. Reverse Array NIM        : {reverse_nim_array}")
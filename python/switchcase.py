def input_nama():
    while True:
        nama = input("Masukkan Nama Anda: ")

        if nama.strip() == "":
            print("Harap Nama Tidak Boleh Kosong!")
            continue

        valid = input("Apakah Nama Anda Sudah Benar? (true/false): ").lower()

        if valid == "true":
            return nama

        print("Nama Salah, Harap Masukkan Kembali.\n")


# Meng-input nama
nama = input_nama()

# Input NIM dan konversi ke saldo
while True:
    nim = input("\nMasukkan NIM Anda (angka saja): ")

    if not nim.isdigit():
        print("NIM harus berupa angka! Coba lagi.")
        continue

    saldo = int(nim)
    break

print("\n===== DATA AWAL =====")
print(f"Nama  : {nama}")
print(f"Saldo : Rp {saldo:,}".replace(",", "."))



# ========== MENU ATM ==========
while True:
    print("\n===== MENU ATM =====")
    print("1. Cek Saldo")
    print("2. Tarik Tunai")
    print("3. Setor Tunai")
    print("4. Transfer")
    print("5. Keluar")

    menu = input("Pilih menu: ")

    match menu:
        case "1":
            print(f"Saldo anda: Rp {saldo:,}".replace(",", "."))

        case "2":
            tarik = int(input("Masukkan nominal tarik: "))
            if tarik > saldo:
                print("Saldo tidak cukup!")
            else:
                saldo -= tarik
                print(f"Anda menarik Rp {tarik:,}".replace(",", "."))

        case "3":
            setor = int(input("Masukkan nominal setor: "))
            saldo += setor
            print(f"Anda menyetor Rp {setor:,}".replace(",", "."))

        case "4":
            transfer = int(input("Masukkan nominal transfer: "))
            if transfer > saldo:
                print("Saldo tidak cukup untuk transfer!")
            else:
                saldo -= transfer
                print(f"Anda transfer Rp {transfer:,}".replace(",", "."))

        case "5":
            print("Terima kasih telah menggunakan ATM!")
            break

        case _:
            print("Menu tidak valid!")

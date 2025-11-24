nama = input("Masukkan Nama Barang: ")
harga = float(input("Masukkan Harga Barang: "))
jumlah = int(input("Masukkan Jumlah Beli Barang: "))

total = harga * jumlah

if total > 660000:
    diskon = total * 0.10
else:
    diskon = 0

total_bayar = total - diskon

print("\n===== STRUK PEMBELIAN =====")
print(f"Nama Barang      : {nama}")
print(f"Harga Satuan     : {harga}")
print(f"Jumlah Beli      : {jumlah}")
print(f"Total Harga      : {total}")
print(f"Diskon           : {diskon}")
print(f"Total Pembayaran : {total_bayar}")
print("=============================")
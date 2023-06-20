package challenges

val dataPenujualanNovel: DataPenjualan = listOf<Penjualan>(
    Penjualan(
        "BOOK002421",
        "Pulang - Pergi",
        "Tere Liye",
        60000,
        86000,
        150,
        17
    ), Penjualan(
        "BOOK002351",
        "Selamat Tinggal",
        "Tere Liye",
        75000,
        103000,
        171,
        20
    ),
    Penjualan(
        "BOOK002941",
        "Garis Waktu",
        "Fiersa Besari",
        67000,
        99000,
        213,
        5
    ),
    Penjualan(
        "BOOK002941",
        "Laskar Pelangi",
        "Andrea Hirata",
        55000,
        68000,
        20,
        56
    )
)

fun getInfoPenjualan(data: DataPenjualan): String {

    TODO("Hello world")

    return ""
}
fun main() {
    println(dataPenujualanNovel)
}

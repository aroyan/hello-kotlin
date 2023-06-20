package binar.infoPenjualan

typealias PenjualanNovel = List<Penjualan2>

data class Penjualan2(
    val idProduct: String,
    val namaProduk: String,
    val penulis: String,
    val hargaBeli: Long,
    val hargaJual: Long,
    val totalTerjual: Long,
    val sisaStok: Long
)

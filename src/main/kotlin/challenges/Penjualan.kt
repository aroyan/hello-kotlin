package challenges

typealias DataPenjualan = List<Penjualan>
data class Penjualan(
    val idProduct: String,
    val namaProduk: String,
    val penulis: String,
    val hargaBeli: Long,
    val hargaJual: Long,
    val totalTerjual: Long,
    val sisaStok: Long
)

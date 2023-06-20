package binar.totalPenjualan

typealias DataPenjualanPakAldi = List<Penjualan>
data class Penjualan(
    val namaProduct: String,
    val hargaSatuan: Long,
    val kategori: String,
    val totalTerjual: Long
)

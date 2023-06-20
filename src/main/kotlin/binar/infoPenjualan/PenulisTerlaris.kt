package binar.infoPenjualan

typealias DataPenulisTerlaris = List<PenulisTerlaris>

data class PenulisTerlaris(
    val nama: String,
    val totalPenjualan: Long
)

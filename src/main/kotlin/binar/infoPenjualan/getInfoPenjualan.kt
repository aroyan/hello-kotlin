package binar.infoPenjualan

data class InfoPenjualanReturn(
    val totalKeuntungan: String,
    val totalModal: String,
    val persentaseKeuntungan: String,
    val produkBukuTerlaris: String,
    val penulisTerlaris: String,
)

fun getInfoPenjualan(data: PenjualanNovel): InfoPenjualanReturn {
    val totalModal = data.sumOf { it.hargaBeli * (it.totalTerjual + it.sisaStok) }
    val totalPenjualan = data.sumOf { it.hargaJual * (it.totalTerjual + it.sisaStok) }
    val totalKeuntungan = data.sumOf { it.hargaJual * (it.totalTerjual + it.sisaStok) } - totalModal
    val persentaseKeuntungan = (totalKeuntungan.toDouble().div(totalPenjualan.toDouble())).times(100.toDouble()).toInt()
    val bukuTerlaris = data.sortedByDescending { it.totalTerjual }[0].namaProduk
    val penulisTerlaris = data.groupBy { it.penulis }
    val namaPenulisTerlaris = mutableListOf<PenulisTerlaris>()

    for ((penulis, dataPenjualan) in penulisTerlaris) {
        val totalTerjual = dataPenjualan.sumOf { it.totalTerjual }
        namaPenulisTerlaris.add(PenulisTerlaris(penulis, totalTerjual))
    }
    return InfoPenjualanReturn(
        totalKeuntungan.toString(),
        totalModal.toString(),
        persentaseKeuntungan.toString(),
        bukuTerlaris,
        namaPenulisTerlaris[0].nama
    )
}

fun main() {
    println(getInfoPenjualan(dataPenjualanNovel))
}
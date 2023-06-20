package binar.infoPenjualan

fun main() {
    val totalModal = dataPenjualanNovel.sumOf {it.hargaBeli * (it.totalTerjual + it.sisaStok)}
    val totalPenjualan = dataPenjualanNovel.sumOf { it.hargaJual * (it.totalTerjual + it.sisaStok) }
    val totalKeuntungan = dataPenjualanNovel.sumOf { it.hargaJual * (it.totalTerjual + it.sisaStok) } - totalModal
    val persentaseKeuntungan = (totalKeuntungan.div(totalPenjualan)).times(100)
    val bukuTerlaris = dataPenjualanNovel.sortedByDescending { it.totalTerjual }[0].namaProduk
    val penulisTerlaris = dataPenjualanNovel.groupBy { it.penulis }
    var namaPenulisTerlaris = mutableListOf<PenulisTerlaris>()

    for ((penulis, dataPenjualan) in penulisTerlaris) {
        val totalTerjual = dataPenjualan.sumOf { it.totalTerjual }
        namaPenulisTerlaris.add(PenulisTerlaris(penulis, totalTerjual))
    }

    println("Total modal = $totalModal")
    println("Total Penjualan = $totalPenjualan")
    println("Total Keuntungan = $totalKeuntungan")
    println("Persentase keuntungan = $persentaseKeuntungan")
    println(bukuTerlaris)
    println(namaPenulisTerlaris[0].nama)
}
package binar.totalPenjualan

fun getTotalPenjualan(data: DataPenjualanPakAldi): Long {
    return data.sumOf { it.totalTerjual }
}

fun main() {

    println(getTotalPenjualan(dataPenjualanPakAldi))

}
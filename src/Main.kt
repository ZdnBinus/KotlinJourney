fun main(){
//    println("berapa tiket Reguler yg mau anda beli")
//    print("1 tiket Rp.50.000>> ")
//    var tiketReguler = readln().toInt()
//
//    println("berapa tiket VIP yg mau anda beli")
//    print("1 tiket Rp.100.000>> ")
//    var tiketVIP = readln().toInt()
//
//    var hasil = (50000 * tiketReguler)+(100000 * tiketVIP)
//
//    println("Total Harga: $hasil")

//    var acara = arrayOf("1.tebak animeh", "2.sigma meter", "3.gartic champion", "4.tebak bias")
//    println("jadwal acara")
//    for (x in acara){
//        println(x)
//    }

//    println("apakah anda mahasiswa?")
//    println("1. Iya")
//    println("2. Tidak")
//    var pilih = readln().toInt()
//
//    if (pilih == 1){
//        println("harga total:90000")
//    }else if (pilih == 2){
//        println("harga total:100000")
//    }


    var tiketReguler = TiketReguler(50000)
    tiketReguler.tampilkanHarga()

    var tiketVip = TiketVip(100000)
    tiketVip.tampilkanHarga()




}

open class Tiket(var harga:Int){


    open fun tampilkanHarga(){
        println("Harga Tiket: Rp $harga")

    }

}

class TiketReguler(var hargaReguler: Int):Tiket(hargaReguler){

    var fasilitas = "bangku plastik"

    override fun tampilkanHarga(){
        super.tampilkanHarga()
        println("fasilitas: $fasilitas")

    }


}

class TiketVip(var hargaVip: Int):Tiket(hargaVip){
    var fasilitas = "bangku sultan"

    override fun tampilkanHarga() {
        super.tampilkanHarga()
        println("fasilitas: $fasilitas")
    }
}
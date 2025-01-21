open class Penduduk(var nama:String, var age:Int){
    open fun tampilkanData(){
        println("nama: $nama")
        println("umur: $age")
    }
}

class Warga(var namaWarga:String, var ageWarga:Int, var noRT:Int, var noRW:Int):Penduduk(namaWarga, ageWarga){

    fun tampilkanDataWarga(){
        super.tampilkanData()
        println("RT: $noRT")
        println("RW: $noRW")

    }
}





fun main(){

    //soal 1
//    println("Masukan nama: ")
//    var nama = readln().toString()
//
//    println("Masukan NIM: ")
//    var nim = readln().toInt()
//
//    println("Masukan Jurusan: ")
//    var jurusan = readln().toString()
//
//    println("nama: $nama")
//    println("nim: $nim")
//    println("jurusan: $jurusan")

    //soal 2
//    println("masukan umur")
//    var age = readln().toInt()
//
//    if (age >= 0 && age <= 12 ){
//        println("anak-anak")
//    }
//    else if(age >= 13 && age <=19){
//        println("Remaja")
//    }
//    else if(age >= 20 && age <= 59){
//        println("dewasa")
//    }
//    else if(age >= 60){
//        println("lansia")
//    }

    //soal 3
//    println("masukan harga: ")
//    var harga = readln().toInt()
//    println("masukan diskon: ")
//    var diskon:Int
//    do {
//        diskon = readln().toInt()
//    }while (diskon <= 0 && diskon >= 101)
//
//    var hasil = harga -(harga * diskon/100)
//
//    println("total harga setelah diskon: $hasil")

    //soal 4

//    var car = arrayOf("BMW", "Mustang", "Toyota","Volvo", "Ferrari")
//
//    for (mobil in car.indices){
//        println("${mobil+1} ${car[mobil]}")
//    }
//    println("Pilih mobil impian Anda")
//    var pilih = readln().toInt()
//    println("mobil yang anda pilih "+car[pilih-1])

    //soal 5
    var saiful = Warga("saiful", 38, 7, 13)

    var joko = Warga("joko", 48, 7, 10)

    saiful.tampilkanDataWarga()
    println("")
    joko.tampilkanDataWarga()




    

}
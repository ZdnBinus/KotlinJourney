fun main(){
    //soal 1

//    println("masukan nama: ")
//    var nama = readln().toString()
//    println("masukan NIM: ")
//    var nim = readln().toInt()
//    println("masukan jurusan: ")
//    var jurusan = readln().toString()
//
//    println("nama: $nama")
//    println("nim: $nim")
//    println("jurusan: $jurusan")

    //soal 2

//    println("masukan usia:")
//    var usia = readln().toInt()
//
//    if (usia >= 0 && usia <= 12){
//        println("Anak-anak")
//    }
//    else if (usia >= 13 && usia <= 19 ){
//        println("Remaja")
//    }
//    else if (usia >=20 && usia <= 59){
//        println("Dewasa")
//    }
//    else if(usia >= 60){
//        println("lansia")
//    }

    var car = arrayOf("volvo", "mustang", "civic", "yamahal")
    for (x in car){
        println(x)
    }
    println("mana mobil yang anda pilih?")
    var pilih = readln().toInt()
    println("$pilih.${car[pilih-1]}")



    

}
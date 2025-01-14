class DataSiswa( name:String,id:Int, var noAbsen:Int ):DataSekolah(name, id) {


    fun printData(){
        println(nama)
        println(id)
        println(noAbsen)



    }
}

fun main(){

    println("Masukan nama: ")
    var nama = readln().toString()
    println("Masukan id: ")
    var id = readln().toInt()
    println("Masukan absen: ")
    var absen = readln().toInt()

    var deku = DataSiswa(nama, id, absen)
    deku.printData()
    println()



}
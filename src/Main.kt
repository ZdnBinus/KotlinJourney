fun main(){
    println("berapa tiket Reguler yg mau anda beli")
    print("1 tiket Rp.50.000>> ")
    var tiketReguler = readln().toInt()

    println("berapa tiket VIP yg mau anda beli")
    print("1 tiket Rp.100.000>> ")
    var tiketVIP = readln().toInt()

    var hasil = (50000 * tiketReguler)+(100000 * tiketVIP)

    println("Total Harga: $hasil")



}
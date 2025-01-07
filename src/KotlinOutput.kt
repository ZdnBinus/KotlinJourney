class MineCraft(var name:String, var tipe:String, var hp:Int){

    fun bicara(ngomong:String){
        println("si $tipe berbicara $ngomong")
    }

}

fun main(){

    println("Masukan nama")
    var name = readln().toString()
    println("Masukan tipe")
    var tipe = readln().toString()
    println("Masukan max darah")
    var hp = readln().toInt()
    println("Bagaimana dia berbicara")
    var bicara = readln().toString()

    var human = MineCraft(name, tipe, hp)


    println("nama: ${human.name}")
    println("tipe: ${human.tipe}")
    println("hp: ${human.hp}")
    human.bicara(bicara)


}
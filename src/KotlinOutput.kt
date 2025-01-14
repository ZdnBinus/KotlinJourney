open class Mutasi(){
    var hp = 100
    var agility = 250
    var sensor = 3000
}

class PenurunanMutasi:Mutasi(){

    fun aksesMutasi(){
        println("name: Iceman")
        println(hp)
        println(agility)
        println(sensor)
    }

}
fun main(){
    var iceman = PenurunanMutasi()
    iceman.aksesMutasi()










}
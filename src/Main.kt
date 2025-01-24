class Students(var name:String, var id:Int, var major:String)

class StudentsManagement(){
    var students: MutableList<Students> = mutableListOf()

    fun addStudent(student: Students){
        students.add(student)
        println("student added successfully")

    }

    fun viewStudents(){
        if(students.isEmpty()){
            println("no students found")
        } else {
            println("list of students:")
            students.forEachIndexed { index, student->
                println("${index + 1}. Name: ${student.name} id: ${student.id} major: ${student.major}")
            }
        }
    }

}

fun main(){
    var studentsManagement = StudentsManagement()

    do {
        println("\nStudent Management System")
        println("1. Add Student")
        println("2. View Students")
        println("3. Delete Student")
        println("4. Exit")
        print("Enter your choice: ")
        var choice = readln().toInt()

        when (choice){
            1->{
                print("nama: ")
                var nama = readln().toString()
                print("id: ")
                var id = readln().toInt()
                print("major: ")
                var major = readln().toString()

                studentsManagement.addStudent(Students(nama, id,major))
            }
            2->{
                studentsManagement.viewStudents()
            }
            4->break
        }

    } while (choice != 4)
}
fun main() {
    val clrm = Classroom(
        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
        Student("Bob", listOf(40.0,10.0,20.0,25.0)),
        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
    )

    for (s : Student in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

    val clrm1 = SortedClassroom(
        Student("Freeman", listOf(20.0, 10.0, 60.0, 10.0)),
        Student("Alex", listOf(100.0, 80.0, 90.0, 55.0))

    )

    println("****************************************************")
    println("sorted classroom")

    for (s : Student in clrm1) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

    println("****************************************************")

    clrm.addBetter(clrm1)

    for (s : Student in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }

    println("****************************************************")

    val clrm3 = Classroom(
        MitigatedStudent("one", listOf(30.0, 40.0)),
        MitigatedStudent("two", listOf(40.0, 50.0)),
    )

    for (s : Student in clrm3) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }





}
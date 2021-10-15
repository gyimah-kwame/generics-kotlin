class MitigatedStudent(val stdName : String, val stdGrades : List<Double>) : Student(stdName, stdGrades) {

    override fun averageGrade() : Double {
        val lowest = stdGrades.sortedDescending().last()

        val list = stdGrades.filter { it > lowest }

        return list.reduce { a, b -> a + b } /list.size

    }
}
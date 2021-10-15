open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {

    val students : MutableList<T> = mutableListOf()

    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }

    fun  addBetter(list: Classroom<T>) {
        val highestAverage: Double = students.map { it.averageGrade() }.sortedDescending().first()

        val newStudent = list.students.filter { it.averageGrade() > highestAverage }.first()

        students.add(newStudent)


    }
}
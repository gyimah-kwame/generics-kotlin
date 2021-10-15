class SortedClassroom(vararg sts : Student) : Classroom<Student>(*sts){

    class StudentSorter : Comparator<Student> {

        override fun compare(o1: Student, o2: Student): Int {

            return o1.name.compareTo(o2.name)
        }

    }

    override fun iterator(): Iterator<Student> {
        return students.sortedWith(StudentSorter()).iterator();
    }

}
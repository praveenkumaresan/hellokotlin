package objectexamples

class ObjectDemo(val studentId: Int, val name:String, val grade: String, val school: String, val district: String, val state: String ) {

    data class Staff(
        val staffName: String,
        val staffId: String,
        val schoolName: String
    )

    fun getStudents(): List<ObjectDemo> {
        return listOf(ObjectDemo(studentId = 1, name = "Nikhi", grade = "First", school = "Gleason", district = "Wayzata", state = "MN"))
    }

    override fun toString(): String {
        val objectDemo  = ObjectDemo(studentId = 1, name = "Nikhi", grade = "First", school = "Gleason", district = "Wayzata", state = "MN")
        return super.toString()
    }
}
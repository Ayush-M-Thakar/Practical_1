fun main() {

    print("Student Enrollnment Number: ")
    val EnrollNo: String = readLine()!!

    print("Student Name: ")
    val Name: String = readLine()!!

    print("Student Branch: ")
    val Branch: String = readLine()!!

    print("Student Class: ")
    val Class: String = readLine()!!

    print("Student Batch: ")
    val Batch: String = readLine()!!

    print("Student College Name: ")

    val ColName: String = readLine()!!

    print("Student University Name: ")
    val UniName: String = readLine()!!

    print("Student Age: ")
    val Age: Int = readLine()!!.toInt()


    println("\n\n*******************\n\n")
    println("Student's Data:")
    println("Enrollnment Name: $EnrollNo")
    println("Name: $Name")
    println("Age: $Age")
    println("Branch: $Branch")
    println("Class: $Class")
    println("Batch: $Batch")
    println("College Name: $ColName")
    println("University Name: $UniName")
}



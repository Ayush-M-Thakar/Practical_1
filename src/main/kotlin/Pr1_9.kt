fun main() {
    print("Enter Elements : ")
    val n:Int = readLine()!!.toInt()
    val a = ArrayList<Int>()
    var max = 0
    for (i:Int in 0 until n){ print("a[$i] = ")
        a.add(i,readLine()!!.toInt())
        if (max<a[i]){
            max = a[i]
        }
    }

    println("Largest element =$max")
}

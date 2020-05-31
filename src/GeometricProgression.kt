fun main(args: Array<String>) {
    geometricprogression()
}

inline fun geometricprogression(){
    val list = readLine()!!.split(" ").map(String::toInt)
    val (a, r, n) = list
    val target = Math.pow(10.0, 9.0)
    val answer = a * Math.pow(r.toDouble(),(n-1).toDouble())
    if(answer > target || answer < 0){
        println("large")
    } else {
        println(answer.toInt())
    }
}

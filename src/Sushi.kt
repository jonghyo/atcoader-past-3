fun main(args: Array<String>) {
    sushi()
}

inline fun sushi(){
    val input1 = readLine()!!.split(" ").map(String::toInt)
    val (n, m) = input1
    var kids = IntArray(n){ i -> 0}

    val sushes = readLine()!!.split(" ").map(String::toInt)
    sushes.forEach{
        sushi ->
            for(i in kids.indices){
                if(sushi > kids[i]){
                    kids[i] = sushi
                    println(i+1)
                    break
                }
                if(i == kids.size-1 && kids.last() >= sushi){
                    println(-1)
                }
            }
    }
}

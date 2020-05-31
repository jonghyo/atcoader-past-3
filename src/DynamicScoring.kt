fun main(args: Array<String>) {
    dynamicscoring()
}

inline fun dynamicscoring(){
    val list = readLine()!!.split(" ").map(String::toInt)
    val (Nnum, Mnum, Q) = list
    var questions = IntArray(Mnum){ i -> Nnum}
    var members = Array(Nnum, {Array(Mnum, {it -> 0})})

    repeat(Q){
        val query = readLine()!!.split(" ").map(String::toInt)
        var n:Int
        var m:Int

        if(query[0] == 1){
            n = query[1]
            var score:Int = 0
            members[n-1].forEachIndexed() {
                index, i ->
                if(i == 1){
                    score += questions[index]
                }
            }
            println(score)
        } else {
            n = query[1]
            m = query[2]

            if(m != 0){
                    members[n-1][m-1] = 1
                    questions[m-1] -= 1
            }
        }
    }
}

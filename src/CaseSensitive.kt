fun main(args: Array<String>) {
    casesensitive()
}

inline fun casesensitive(){
    val s = readLine()!!
    val t = readLine()!!

    if(s.equals(t)){
        println("same")
    } else if(s.equals(t, ignoreCase = true)){
        println("case-insensitive")
    }else {
        println("different")
    }
}

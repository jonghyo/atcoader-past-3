import java.util.*

fun main(args: Array<String>) {
    digitalsinage()
}

inline fun digitalsinage(){
    val n = readLine()!!.toInt()

    //Number Format Definition
    var zero:Array<String?> = arrayOfNulls(5)
    zero[0] = ".###"
    zero[1] = ".#.#"
    zero[2] = ".#.#"
    zero[3] = ".#.#"
    zero[4] = ".###"

    var one:Array<String?> = arrayOfNulls(5)
    one[0] = "..#."
    one[1] = ".##."
    one[2] = "..#."
    one[3] = "..#."
    one[4] = ".###"

    var two:Array<String?> = arrayOfNulls(5)
    two[0] = ".###"
    two[1] = "...#"
    two[2] = ".###"
    two[3] = ".#.."
    two[4] = ".###"

    var three:Array<String?> = arrayOfNulls(5)
    three[0] = ".###"
    three[1] = "...#"
    three[2] = ".###"
    three[3] = "...#"
    three[4] = ".###"

    var four:Array<String?> = arrayOfNulls(5)
    four[0] = ".#.#"
    four[1] = ".#.#"
    four[2] = ".###"
    four[3] = "...#"
    four[4] = "...#"

    var five:Array<String?> = arrayOfNulls(5)
    five[0] = ".###"
    five[1] = ".#.."
    five[2] = ".###"
    five[3] = "...#"
    five[4] = ".###"

    var six:Array<String?> = arrayOfNulls(5)
    six[0] = ".###"
    six[1] = ".#.."
    six[2] = ".###"
    six[3] = ".#.#"
    six[4] = ".###"

    var seven:Array<String?> = arrayOfNulls(5)
    seven[0] = ".###"
    seven[1] = "...#"
    seven[2] = "...#"
    seven[3] = "...#"
    seven[4] = "...#"

    var eight:Array<String?> = arrayOfNulls(5)
    eight[0] = ".###"
    eight[1] = ".#.#"
    eight[2] = ".###"
    eight[3] = ".#.#"
    eight[4] = ".###"

    var nine:Array<String?> = arrayOfNulls(5)
    nine[0] = ".###"
    nine[1] = ".#.#"
    nine[2] = ".###"
    nine[3] = "...#"
    nine[4] = ".###"

    val s1 = readLine()!!.removeSuffix(".")
    val s2 = readLine()!!.removeSuffix(".")
    val s3 = readLine()!!.removeSuffix(".")
    val s4 = readLine()!!.removeSuffix(".")
    val s5 = readLine()!!.removeSuffix(".")
    var inputList:Array<String?> = arrayOfNulls(5)
    inputList[0] = s1
    inputList[1] = s2
    inputList[2] = s3
    inputList[3] = s4
    inputList[4] = s5

    val input = Array(n, {arrayOfNulls<String>(5)})

    var answer = ""
    input.forEachIndexed{
        index, a->
        for(i in 0 .. 4){
            a[i] = inputList[i]?.substring(0,4)
            inputList[i] = inputList[i]?.drop(4)
        }

        if(Arrays.equals(a, zero)){
            answer += "0"
        } else if(Arrays.equals(a, one)){
            answer += "1"
        } else if(Arrays.equals(a, two)){
            answer += "2"
        } else if(Arrays.equals(a, three)){
            answer += "3"
        } else if(Arrays.equals(a, four)){
            answer += "4"
        } else if(Arrays.equals(a, five)){
            answer += "5"
        } else if(Arrays.equals(a, six)){
            answer += "6"
        } else if(Arrays.equals(a, seven)){
            answer += "7"
        } else if(Arrays.equals(a, eight)){
            answer += "8"
        } else if(Arrays.equals(a, nine)){
            answer += "9"
        }
    }

    println(answer)
}

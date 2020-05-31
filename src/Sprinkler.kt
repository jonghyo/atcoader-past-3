import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType

fun main(args: Array<String>) {
    sprinkler()
}

inline fun sprinkler(){
    val input1 = readLine()!!.split(" ").map(String::toInt)
    val (n, m, q) = input1
    var points = Array<Point>(n){ it-> Point()}

    //線を引くパート
    repeat(m){
        val line = readLine()!!.split(" ").map(String::toInt)
        val (from, to) = line
        points[from-1].neighbors.add(to)
        points[to-1].neighbors.add(from)
    }

    //色を決定するパート
    val colors = readLine()!!.split(" ").map(String::toInt)
    points.forEachIndexed() {
        index, it ->
        it.color = colors[index]
    }

    //クエリ
    repeat(q){
        val query = readLine()!!.split(" ").map(String::toInt)
        when(query[0]){
            1 -> {
                val x = query[1]
                println(points[x-1].color)
                points[x-1].neighbors.forEach{
                    it ->
                    points[it-1].color = points[x-1].color
                }
            }

            2 -> {
                val x = query[1]
                val y = query[2]
                println(points[x-1]?.color)
                points[x-1]?.color = y
            }
        }
    }
}

class Point(
    var color: Int = 0,
    var neighbors: ArrayList<Int> = arrayListOf()
)

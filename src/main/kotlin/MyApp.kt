fun main(args: Array<String>){
    showOmikuji()
}

fun showOmikuji(){
    val omikuji = listOf("大吉", "中吉", "小吉")
    println("3連おみくじ")
    repeat(3){
        var result = omikuji[java.util.Random().nextInt(3)]
        println("運勢は ${result} です")
    }
}
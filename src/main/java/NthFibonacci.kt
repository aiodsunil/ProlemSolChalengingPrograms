//time complexity 2 power n ,space complexity o(n)
fun getNthFib(n: Int):Int {
    return when (n) {
        2 -> 1
        1 -> 0
        else -> getNthFib(n-1)+ getNthFib(n-2)
    }

}

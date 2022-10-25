//time complexity is o(n) space o(d)
fun productSum(array: List<*>): Int {

    return productSumHelper(array, 1)

}

fun productSumHelper(array: List<*>, multiplier: Int): Int {
    var sum = 0
    for (element in array) {
        sum += if (element is List<*>)
            productSumHelper(element, multiplier + 1)
        else
            element as Int
    }
    return  sum * multiplier
}


fun bubbleSort(array: MutableList<Int>): List<Int> {
   var isSorted = false
    var counter=0
    while (!isSorted) {
        isSorted=true
        for (i in 0 until array.size-1-counter){
            if (array[i]>array[i+1]){
                isSorted = false
                swapElement(i,i+1,array)
            }
        }
        counter++
    }
    return array
}

fun swapElement(i: Int, j: Int, array: MutableList<Int>) {
val temp = array[j]
    array[j] = array[i]
    array[i]=temp
}

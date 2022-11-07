//best,average,worst : O(n^2) time | o(1) space

fun selectionSort(array: MutableList<Int>): List<Int> {

    for (i in 0 until array.size){
        var element = array[i]
        var smallestIdx =i
        for (j in i+1 until  array.size){
            if (element> array[j]){
                element=array[j]
                smallestIdx=j
            }
        }
        swapElement2(i,smallestIdx,array)
    }
    return array
}

fun swapElement2(i: Int, j: Int, array: MutableList<Int>):MutableList<Int> {
    val temp = array[i]
    array[i]=array[j]
    array[j]=temp
    return array
}

//time complexity O(n^2) space complexity O(1)
fun insertionSort(array: MutableList<Int>): List<Int> {

    for (i in 0 until array.size ){

        for (j in i downTo  1){
            if (array[j]<array[j-1]){
                swapElement1(j,j-1,array)
            }
        }
    }
    return array
}
fun swapElement1(i:Int, j:Int,array: MutableList<Int>): MutableList<Int>{
    var temp=array[i]
    array[i] = array[j]
    array[j] = temp
    return array
}
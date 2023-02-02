fun binarySearch(array: List<Int>, target: Int): Int {

    return binarySearchHelper(array,target,0,array.size-1)
}

fun binarySearchHelper(array: List<Int>, target: Int, left: Int, right: Int): Int {

    if (left>right)  return -1

    val mid = (left+right)/2

    return if (target==array[mid]) mid
    else if (target<array[mid]) binarySearchHelper(array,target,left,mid-1)
    else binarySearchHelper(array,target,mid+1,right)

}

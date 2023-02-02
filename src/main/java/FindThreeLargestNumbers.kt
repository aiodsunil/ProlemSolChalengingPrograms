//o(n) time | o(1) space
fun findThreeLargestNumbers(array: List<Int>): List<Int> {
    // Write your code here.
    var threeLargestNumbers = mutableListOf(Int.MIN_VALUE,Int.MIN_VALUE,Int.MIN_VALUE)
    for (number in array) {
        updateLargestNumbers(number, threeLargestNumbers)
    }

    return threeLargestNumbers
}

fun updateLargestNumbers(number: Int, threeLargest: MutableList<Int>) {
    if (number>threeLargest[2] ){
        shiftAndUpdateLargestNumbers(number,threeLargest,2)
    }
   else if (number>threeLargest[1] ){
        shiftAndUpdateLargestNumbers(number,threeLargest,1)

    }
    else if (number>threeLargest[0] ){
        shiftAndUpdateLargestNumbers(number,threeLargest,0)

    }
}

fun shiftAndUpdateLargestNumbers(number: Int, threeLargest: MutableList<Int>, idx: Int) {
  for (i in 0 until idx+1){
      if (i==idx){
          threeLargest[i]=number
      }else{
          threeLargest[i]=threeLargest[i+1]
      }
  }
}

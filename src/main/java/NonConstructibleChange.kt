fun nonConstructibleChange(coins: MutableList<Int>): Int {
    // Write your code here.
    coins.sort()
    var change = 0
    for(coin in coins){
        if(coin> change+1)
            return change+1
        change += coin
    }
    return change+1
}
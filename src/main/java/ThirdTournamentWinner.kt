fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
// [home team =>1,away team=>0] o(n) o(k)
    val winnerMap = HashMap<String, Int>()

        for ((index, value) in competitions.withIndex()) {

            val resultValue = results[index]

            if (resultValue == 0) {
                winnerMap[value[1]] = winnerMap[value[1]]?.plus(3)?:3
            }
            else {
                winnerMap[value[0]] = winnerMap[value[0]]?.plus(3)?:3
            }
        }
    return  winnerMap.maxBy { it.value}.key
}

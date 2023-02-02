//O(n *m ) time | O(n *m) space - where n is the number of words and
// m is the length of the longest words
fun semordnilap(words: List<String>): List<List<String>> {
    val wordsSet = words.toMutableSet()
    val semordnilapPairs = mutableListOf<List<String>>()

    for (word in words){
        val reverse = word.reversed()
        if (wordsSet.contains(reverse) && reverse != word){
            semordnilapPairs.add(listOf(word,reverse))
            wordsSet.remove(word)
            wordsSet.remove(reverse)
        }
    }
    return semordnilapPairs
}

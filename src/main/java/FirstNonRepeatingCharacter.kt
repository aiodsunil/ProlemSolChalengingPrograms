/*
the First Non-Repeating Character problem is defined by an input of a single string of English
characters and an output of the index of the string’s first non-repeating character.
If there are no non-repeating characters, then the function should return -1.

Here are a few examples:
----- Example 1 -----
Input:  abbcddeff
Output: 0
----- Example 2 -----
Input:  abbNadNe
Output: 4
----- Example 3 -----
Input:  ddd
Output: -1
 */
fun firstNonRepeatingCharacter1(value: String): Int {
    var map = HashMap<Char,Int>()
    for(i in value.indices){
        var char1=value[i]
        for(j in value.indices){
            var char2=value[j]
            if (char1==char2){
                map[char1]=map[char1]?.plus(1)?:1
            }
        }
    }
   var firstChar= map.filter { it.value==1}.keys.firstOrNull()
   return if (firstChar==null) -1 else value.indexOf(firstChar)
}
fun firstNonRepeatingCharacter2(value: String): Int {
    for(idx1 in value.indices){
        var found = false
        for(idx2 in value.indices){
            if (value[idx1]==value[idx2] && idx1!=idx2){
                found = true
            }
        }
        if (!found) return idx1
    }
  return  -1
}
fun firstNonRepeatingCharacter3(value: String): Int {
    var map = mutableMapOf<Char,Int>()
    for(i in value.indices){
        var char1=value[i]
                map[char1]=map[char1]?.plus(1)?:1
        }
    var firstChar= map.filter { it.value==1}.keys.firstOrNull()
    return if (firstChar==null) -1 else value.indexOf(firstChar)
}

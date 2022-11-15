//O(nlog(n)) time | O(1) space -where n is the number of students
fun classPhotos(redShirtHeights: MutableList<Int>,
                blueShirtHeights: MutableList<Int>): Boolean {
   redShirtHeights.sortDescending()
    blueShirtHeights.sortDescending()
  var firstRowClassHeight= if (redShirtHeights[0] > blueShirtHeights[0]) "BLUE" else "RED"
    for (i in 0 until redShirtHeights.size){
        var redShirt=redShirtHeights[i]
        var blueShirt=blueShirtHeights[i]

        if (firstRowClassHeight=="RED"){
            if (redShirt>=blueShirt) return  false
        }else{
            if (blueShirt>=redShirt) return  false

        }

    }
    return true
}

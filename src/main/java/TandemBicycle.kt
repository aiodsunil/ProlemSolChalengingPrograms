import java.lang.Integer.max

fun tandemBicycle(redShirtSpeeds: MutableList<Int>,
                  blueShirtSpeeds: MutableList<Int>, fastest: Boolean): Int {
    redShirtSpeeds.sortDescending()
    if (!fastest) blueShirtSpeeds.sort() else blueShirtSpeeds.sortDescending()
    var totalSpeed=0;
    for ((j, i) in (redShirtSpeeds.size-1 downTo 0).withIndex()){
        totalSpeed+=max(redShirtSpeeds[i],blueShirtSpeeds[j])

    }
    return totalSpeed
}

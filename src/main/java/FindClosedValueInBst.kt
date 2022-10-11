import kotlin.math.abs

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

fun findClosestValueInBst(tree: BST, target: Int): Int= findClosestValue(tree, target, tree.value)


fun findClosestValue(tree: BST?, target: Int, closestValue: Int): Int {
    if (tree==null || target == closestValue)
        return closestValue
    val isClosed = abs(tree.value - target) < abs(closestValue - target)
    val currentCloseValue = if (isClosed) tree.value else closestValue
    if (tree.value < target)
       return  findClosestValue(tree.right, target, currentCloseValue)

    return findClosestValue(tree.left, target, currentCloseValue)

}

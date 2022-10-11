import org.junit.jupiter.api.Test

class FindClosedValueInBstTest {
    @Test
    fun `find closed value in bst tree`() {
        val tree = BST(10)
        tree.left = BST(5)
        tree.left!!.left = BST(2)
        tree.left!!.left!!.left = BST(1)
        tree.left!!.right = BST(5)
        tree.right = BST(15)
        tree.right!!.left = BST(13)
        tree.right!!.left!!.right = BST(14)
        tree.right!!.right = BST(22)

        val result = findClosestValueInBst(tree, 12)
        println("result $result")
        assert(result == 13)
    }
}
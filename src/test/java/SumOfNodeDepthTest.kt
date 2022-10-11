import org.junit.jupiter.api.Test

class SumOfNodeDepthTest {
    @Test
    fun `recursive way to find solution`() {
        val tree = BST1(1)
        tree.left = BST1(2)
        tree.right = BST1(3)
        tree.left!!.left = BST1(4)
        tree.left!!.right = BST1(5)
        tree.right!!.left = BST1(6)
        tree.right!!.right = BST1(7)
        tree.left!!.left!!.left = BST1(8)
        tree.left!!.left!!.right = BST1(9)

        val result = nodeDepthsRecursive(tree)
        println("Result : $result")
        assert(result == 16)
    }

    @Test
    fun `iterator way to find solution`() {
        val tree = BST1(1)
        tree.left = BST1(2)
        tree.right = BST1(3)
        tree.left!!.left = BST1(4)
        tree.left!!.right = BST1(5)
        tree.right!!.left = BST1(6)
        tree.right!!.right = BST1(7)
        tree.left!!.left!!.left = BST1(8)
        tree.left!!.left!!.right = BST1(9)

        val result = nodeDepthsIterator(tree)
        println("Result : $result")
        assert(result == 16)
    }

}

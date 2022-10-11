import org.junit.jupiter.api.Test

class BranchSumTest {
    @Test
    fun `branch sum`() {

        val tree = BinaryTree(1)
        tree.left = BinaryTree(2)
        tree.right = BinaryTree(3)
        tree.left!!.left = BinaryTree(4)
        tree.left!!.right = BinaryTree(5)
        tree.right!!.left = BinaryTree(6)
        tree.right!!.right = BinaryTree(7)
        tree.left!!.left!!.left = BinaryTree(8)
        tree.left!!.left!!.right = BinaryTree(9)
        tree.left!!.right!!.left = BinaryTree(10)

        val result = branchSums(tree)
        val expected = listOf(15, 16, 18, 10, 11)

        assert(result == expected)
    }
}
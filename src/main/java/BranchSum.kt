open class BinaryTree(var value: Int) {
    var left: BinaryTree? = null
    var right: BinaryTree? = null
    fun isLeaf(): Boolean = left==null && right==null
}
//o(n) time | o(n) space
fun branchSums(node: BinaryTree) = branchHelper(node,0, mutableListOf())
fun  branchHelper(node: BinaryTree,branchSum: Int,branchSumList: MutableList<Int>): List<Int>{
      if (node.isLeaf()){
           branchSumList.add(branchSum+node.value)
      }
    node.left?.let{branchHelper(it,branchSum + node.value,branchSumList)}
    node.right?.let{branchHelper(it,branchSum + node.value,branchSumList)}
    return  branchSumList
}
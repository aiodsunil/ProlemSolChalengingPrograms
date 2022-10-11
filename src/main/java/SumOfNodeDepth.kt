import java.util.ArrayDeque
//time and space complexity is O(n) space complexity o(h) ,h is height of graph
open class BST1(value: Int){
  var value=value
   var left: BST1?=null
   var right: BST1?=null

}

fun nodeDepthsRecursive(root:BST1)=sumOfDepthNode(root,0)

fun sumOfDepthNode(root: BST1?, depth: Int): Int {
    if (root==null) return 0
    return depth+sumOfDepthNode(root.left,depth+1)+sumOfDepthNode(root.right,depth+1)
}


 fun nodeDepthsIterator(node: BST1): Int {
  var sum=0
  val stack = ArrayDeque<Pair<BST1,Int>>()
     stack.push(Pair(node,0))

   while (stack.isNotEmpty()){
       val (node,depth) = stack.pop()
       sum+=depth
       node.left?.let { stack.push(Pair(it,depth+1)) }
       node.right?.let { stack.push(Pair(it,depth+1)) }
   }
   return  sum
}

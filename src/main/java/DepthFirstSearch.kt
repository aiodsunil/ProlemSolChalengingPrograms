class Node(name: String) {
    val name: String = name
    val children = mutableListOf<Node>()
//O(V+E) S(v)
    fun depthFirstSearch(): List<String> {
        // Write your code here.
        return depthFirstSearch(mutableListOf())
    }
    private fun depthFirstSearch(array: MutableList<String>): List<String>{
         array.add(this.name)
         for (child in this.children ){
             child.depthFirstSearch(array)
         }
        return array
    }
}

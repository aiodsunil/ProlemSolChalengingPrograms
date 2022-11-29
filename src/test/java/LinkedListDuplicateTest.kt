import org.junit.jupiter.api.Test

class LinkedListDuplicateTest {


    @Test
    fun `remove duplicate from linkedList`() {
        val input = addMany(LinkedList(1), listOf(1, 3, 4, 4, 4, 5, 6, 6))
        val expected = addMany(LinkedList(1), listOf(3, 4, 5, 6))
        val output = removeDuplicatesFromLinkedList(input)
        assert(getNodesInArray(expected) == getNodesInArray(output))
    }


    private fun addMany(linkedList: LinkedList, values: List<Int>): LinkedList {
        var current = linkedList
        while (current.next != null) {
            current = current.next!!
        }
        for (value in values) {
            current.next = LinkedList(value)
            current = current.next!!
        }
        return linkedList
    }

    private fun getNodesInArray(linkedList: LinkedList?): List<Int> {
        val nodes = mutableListOf<Int>()
        var current: LinkedList? = linkedList
        while (current != null) {
            nodes.add(current.value)
            current = current.next
        }
        return nodes
    }
}
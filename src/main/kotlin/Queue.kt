class Queue<T> {
    private val elements: MutableList<T> = mutableListOf()

    fun enqueue(data: T){
        elements.add(data)
    }

    fun dequeue(){
        elements.removeFirst()
    }

    fun peek() = elements.first()

    fun size() = elements.size

    fun isEmpty() = elements.isEmpty()

    fun printQueue() = println(elements.joinToString(separator = ", ", prefix = "", postfix = ""))
}
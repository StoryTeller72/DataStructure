class Stack<T>(){
    private val elements: MutableList<T> = mutableListOf()

    fun size(): Int = elements.size

    fun push(data: T){
        elements.add(data)
    }

    fun pop(){
        elements.removeLast()
    }

    fun peek() = elements.last()

    fun clear(){
        elements.clear()
    }

    fun isEmpty() = elements.isEmpty()

    fun printStack() = println(elements.joinToString(separator = ", ", prefix = "", postfix = ""))
}

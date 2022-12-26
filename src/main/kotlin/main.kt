
fun main() {
   val testStack = Stack<Int>()
   testStack.push(1)
   testStack.push(2)
   testStack.push(5)
   testStack.printStack()
   testStack.pop()
   testStack.pop()
   testStack.printStack()
   println(testStack.isEmpty())
}
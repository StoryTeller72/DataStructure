
fun main() {
   val testQueue= Queue<Int>()
   println(testQueue.isEmpty())
   testQueue.enqueue(1)
   testQueue.enqueue(10)
   testQueue.enqueue(9)
   testQueue.enqueue(2)
   testQueue.enqueue(8)
   testQueue.printQueue()
   println(testQueue.peek())
   testQueue.dequeue()
   testQueue.dequeue()
   testQueue.printQueue()
}
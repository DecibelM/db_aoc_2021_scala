object Main extends App {

  println("Hello World")
  val data1 = Data.get_input_list
  println("Day 1")
  println("Part1: " + Day1.task1(data1))
  println("Part2: " + Day1.task2(data1))
}

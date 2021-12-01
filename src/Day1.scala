object Day1 {

  def task1(data: Array[Int]): Int = {
    data.sliding(2).count(i => i.head < i(1))
  }

  def task2(data: Array[Int]): Int = {
    data.sliding(4).count(i => i.head < i(3))
  }
}

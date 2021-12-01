object Data {

  def get_input: String = {
    val lines = scala.io.Source.fromFile("src/input/input1.txt").mkString
    lines
  }

  def get_input_list: Array[Int] = {
    val lines = get_input
    lines.split("\r\n").map(i => i.toInt)
  }

}

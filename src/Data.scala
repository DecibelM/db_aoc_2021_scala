object Data {

  def get_input: String = {
    "src/input/input1.txt"
    val source = scala.io.Source.fromFile("src/input/input1.txt")
    try source.mkString finally source.close()
  }

  def get_input_list: Array[Int] = {
    val lines = get_input
    lines.split("\r\n").map(i => i.toInt)
  }

}

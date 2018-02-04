package example.ch1

object MyModule {
  def abs(n: Int): Int =
    if(n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    var msg = "This is absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-40))
  }
}
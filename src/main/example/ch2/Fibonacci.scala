package example.ch2

object Fibonacci {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def rec(n: Int, prev: Int, current: Int): Int = {
      if(n == 1) prev
      else rec(n-1, current, prev + current)
    }

    rec(n, 0, 1)

  }
}

package example.ch2

import org.scalatest._


class FibonacciTest extends FlatSpec {

  "Fibonacci" should "return valid fibonacci number on given position" in {
    assert(Fibonacci.fib(5) == 3)
  }
}
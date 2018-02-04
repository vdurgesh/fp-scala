package example.ch2

import org.scalatest._


class FactorialTest extends FlatSpec {

  "Factorial" should "return valid factorial value" in {
    assert(Factorital.facto(5) == 120)
  }
}
package example.ch2

import org.scalatest._


class CurryIngTest extends FlatSpec {

  "Curry" should "return a curry function" in {
    def f = (a1: Int, b1: Long) => a1 == b1.intValue()
    assert(CurreyIng.curry(f).apply(18).apply(18L))
  }


  it should "return another curry function" in {
    def f = (a1: Int, b1: Long) => a1 == b1.intValue()
    assert(!CurreyIng.curry(f).apply(19).apply(18L))
  }

  "UnCurry" should "return a uncurry function" in {
    def f = (a1: Int) => (b1: Long) => a1 == b1.intValue()
    assert(CurreyIng.uncurry(f).apply(18, 18L))
  }


  it should "return another uncurry function" in {
    def f = (a1: Int) => (b1: Long) => a1 == b1.intValue()
    assert(!CurreyIng.uncurry(f).apply(19, 18L))
  }

  "Compose" should "return a compose function" in {
    def f = (b1: Long) => (b1 * 5).doubleValue()
    def g = (a1: Int) => (a1* 2).longValue()
    assert(CurreyIng.compose(f, g).apply(10) == 100.0)
  }

}
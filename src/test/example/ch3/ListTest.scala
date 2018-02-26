package example.ch3

import example.ch3.List._
import org.scalatest.FlatSpec

class ListTest extends FlatSpec {

  "List" should "return sum of list elements" in {
    assert(sum(List(12, 16, 2)) == 30)
  }

  it should "return product of list elements" in {
    assert(product(List(1, 6, 2)) == 12)
  }

  it should "return value of x from List(1,2,3,4,5)" in {
     assert(x == 3)
  }

  it should "Variadic function syntax" in {
    assert(apply(1, 2, 3, 4, "Hi") == List(1,2,3,4, "Hi"))
  }

  it should "return tail of list" in {
    assert(tail(List(1, 2, 3, 4)) == List(2,3,4))
  }

  it should "set head to list" in {
    assert(setHead(List(1, 2, 3, 4), 5) == List(5,2,3,4))
  }

  it should "drop first n elements from list" in {
    assert(drop(List(1, 2, 3, 4, 5), 2) == List(3,4,5))
  }

  it should "drop while elements from list" in {
    assert(dropWhile(List(1, 2, 3, 4, 5), (x: Int) => { x < 3 })== List(3,4,5))
  }

  it should "init elements from list" in {
    assert(init(List(1, 2, 3, 4, 5))== List(1, 2, 3, 4))
  }

  it should "fold right elements from list" in {
    assert(foldRight(List(1, 2, 3), 1)((x, y)=> x+y)== 7)
  }

  it should "sum with fold right elements from list" in {
     assert(sum2(List(1, 2, 3))== 6)
  }

  it should "product with fold right elements from list" in {
     assert(product2(List(1, 2, 3))== 6)
  }

  it should "length with fold right elements from list" in {
     assert(length(List(1, 2, 3, 5))== 4)
  }

  it should "sum with fold left elements from list" in {
    assert(sum3(List(1, 2, 3))== 6)
  }

  it should "product with fold left elements from list" in {
    assert(product3(List(1, 2, 3))== 6)
  }


}

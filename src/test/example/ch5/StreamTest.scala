package example.ch5

import org.scalatest.FlatSpec

class StreamTest extends FlatSpec {

  "Stream" should "Empty Stream" in {
      assert(Stream.empty == Empty)
  }

  it should "return a List" in {
    assert(Stream(1,2,3).toList == List(1,2,3))
  }

  it should "return first n elements" in {
    assert(Stream(1,2,3,4,5).take(3).toList == List(1,2,3))
  }

  it should "drop first n element and return list" in {
     assert(Stream(1,2,3,4,5).drop(3).toList == List(4, 5))
     assert(Stream(1,2,3,4,5).drop(4).toList == List(5))
  }

  it should "exist in stream" in {
     assert(Stream(1,2,3,4,5).exists((n) => n % 2 == 0))
     assert(!Stream(1,3,5).exists((n) => n % 2 == 0))
  }

  it should "return drop  n and return list" in {
    assert(Stream(1,2,3,4,5).drop(3).toList == List(4, 5))
  }
  
  it should "return ones" in {
      assert(Stream.ones.take(2).toList == List(1,1))
  }

}

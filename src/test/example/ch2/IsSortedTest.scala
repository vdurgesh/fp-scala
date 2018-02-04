package example.ch2

import org.scalatest._


class IsSortedTest extends FlatSpec {

  "Is SortedT est" should "verify that given array is sorted in given order" in {
    def array =Array(1,2,3,4,5,6)
    def sortedOrdder(v1:Int, v2:Int): Boolean = {
      v1 > v2
    }
    assert(IsSorted.isSortedArray(array, sortedOrdder))
  }

  it should "verify that given array is not sorted in given order" in {
    def array =Array(8,2,3,1,5,6)
    def sortedOrdder(v1:Int, v2:Int): Boolean = {
      v1 > v2
    }
    assert(!IsSorted.isSortedArray(array, sortedOrdder))
  }
}
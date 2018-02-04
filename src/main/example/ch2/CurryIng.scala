package example.ch2

object CurreyIng {
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a1: A) => (b1:B) => f(a1, b1)
  }

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a1: A, b1: B) => f(a1).apply(b1)
  }

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a1: A) => f(g(a1))
  }
}

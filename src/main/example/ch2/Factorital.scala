package example.ch2

object Factorital {
   def facto(n :Int): Int = {
     def rec(n: Int, acc: Int): Int = {
       if(n <= 0) acc
       else rec(n-1, n*acc)
     }

     rec(n ,1);
   }
}

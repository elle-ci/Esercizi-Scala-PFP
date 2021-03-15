/*Scrivere un metodo Scala somma che, dato come parametro una funzione
f:Int=>Int, restituisce una funzione che prende come parametri due interi 
a e b e restituisce la somma di f(x) per ogni x compreso tra a e b (estremi inclusi).
*/
object E5 {
    def somma(f:Int => Int):(Int,Int) => Int = {
        def sommaFunzione(x:Int, y:Int):Int = {
            if (x>y) 0
            else f(x)+sommaFunzione(x+1, y)
        }
        sommaFunzione _
    }
}




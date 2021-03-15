/*Si modifichi la realizzazione del seguente metodo sum che calcola la somma dei primi
n numeri in modo che esibisca ricorsione di coda:

object E1 {
    def sum(n:Int):Int = if (n<1) 0 else n+sum(n-1)
}
*/
object E1 {
    def sum(n:Int):Int = {
        @scala.annotation.tailrec
        def aux(n:Int, s:Int):Int = {
            if (n<1) s
                
            else aux(n-1, s+n)
                
        }
        aux(n,0)
    }
}

/*Si scriva un metodo Scala sommaQuadrati che, dati due interi x e y
 con x<=y, calcola la somma dei quadrati dei numeri da x a y, compresi.
*/
object E3{
	def sommaQuadrati (x:Int,y:Int): Int = {
		if (x>y) 0
		else x*x+sommaQuadrati(x+1,y)
	}
}

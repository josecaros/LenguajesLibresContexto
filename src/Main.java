
public class Main {
	public static void main(String[]args) {
		Pila a,b;
		a = new PilaLista<Integer>();
		b = new PilaArray<Integer>(10);
		a.push(12);
		a.push(20);
		
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.estaVacio());
	}
}

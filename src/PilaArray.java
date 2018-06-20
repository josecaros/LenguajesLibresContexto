
public class PilaArray <T> implements Pila {
	private Object[] array;
	private int ventana;
	private int limite;
	
	@SuppressWarnings("unchecked")
	public PilaArray(int ini) {
		array =(T[]) new Object[ini];
		ventana=0;
		limite=ini;
	}
	@Override
	public void push(Object dato) {
		// TODO Auto-generated method stub
		if(ventana<limite) {
			array[ventana]=dato;
			ventana++;
		}
		else {
			resize();
			push(dato);
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return ventana;
	}

	@Override
	public boolean estaVacio() {
		// TODO Auto-generated method stub
		return (array[0]==null)?true:false;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		ventana--;
		Nodo aux = (Nodo) array[ventana];
		array[ventana]=null;
		return aux.dato;
	}
	
	public void resize() {
		int old = limite;
		limite = limite*2;
		T[] aux = (T[]) new Object[limite];
		for(int i=0;i<old;i++)
			aux[i]=(T) array[i];
		array=aux;
		
	}
	
}


public class PilaLista<T> implements Pila<T>{
	private int size;
	private Nodo ventana;
	
	public PilaLista() {
		size=0;
		ventana=null;
	}
	
	@Override
	public void push(T dato) {
		// TODO Auto-generated method stub
		if(ventana == null) {
			Nodo aux = new Nodo(dato);
			size++;
			ventana = aux;
		}
		else {
			Nodo aux = new Nodo(dato);
			aux.prev=ventana;
			ventana.next=aux;
			ventana=aux;
			size++;
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean estaVacio() {
		return (ventana==null)?true:false;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(ventana.prev!=null) {
			Nodo aux = ventana;
			ventana.prev.next=null;
			ventana= ventana.prev;
			return (T)aux.getDato();
		}
		else {
			Nodo aux = ventana;
			ventana=null;
			return (T)aux.getDato();
		}
		
	}
	
}

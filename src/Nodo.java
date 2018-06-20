
public class Nodo <T> {
	public T dato;
	public Nodo next;
	public Nodo prev;
	
	public Nodo(T in) {
		dato = in;
		next=null;
		prev=null;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

	public Nodo getPrev() {
		return prev;
	}

	public void setPrev(Nodo prev) {
		this.prev = prev;
	}
	

}

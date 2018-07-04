
public class Verificador {
	
	public static int[] determinarLineas() {
		return null;
	}
	
	public static String obtenerString() {
		return null;
	}
	
	public static int[] evaluar(String in) {
		Pila<String> corchetes = new PilaLista<>();
		Pila<String> llaves = new PilaLista<>();
		Pila<String> parentesis = new PilaLista<>();
		
		char[] dato = in.toCharArray();
		int[] ubicacion=new int[4];
		
		for(int i=0;i<dato.length;i++) {
			boolean open=false;
			if(open=(dato[i]=='{') || dato[i]=='}') {
				if(open)
					llaves.push("a");
				else if(!llaves.estaVacio()){
					llaves.pop();
					ubicacion[0]=i;
				}
				else {
					ubicacion[3]=i;
					return ubicacion;
				}
			}
			else if (open=(dato[i]=='(') || dato[i]==')') {
				if(open)
					parentesis.push("a");
				else if(!parentesis.estaVacio()) {
					parentesis.pop();
					ubicacion[1]=i;
				}
				else {
					ubicacion[3]=i;
					return ubicacion;
				}
			}
			else if(open=(dato[i]=='[') || dato[i]==']') {
				if(open)
					corchetes.push("a");
				else if(!corchetes.estaVacio()){
					corchetes.pop();
					ubicacion[2]=i;
				}
				else {
					ubicacion[3]=i;
					return ubicacion;
				}
			}
			else {
				
			}
		}
		
		if(!corchetes.estaVacio()&&!parentesis.estaVacio()&&!llaves.estaVacio()) {
			return ubicacion;
		}
		return null;
	}
}

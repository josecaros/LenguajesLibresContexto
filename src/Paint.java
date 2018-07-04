import javax.swing.JFrame;

public class Paint {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("GrafoP1");
		ventana.add( new Cuadro());
		ventana.setSize(600, 600);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

}

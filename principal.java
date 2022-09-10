
import javax.swing.*;


public class principal{
    public static void main(String[] ar) {
	// Creamos una ventana con su titulo.
        JFrame f=new JFrame();
        f.setBounds(10,10,300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Conversor de monedas");
	//Creamos un panel para agregar elementos a la ventana
	JPanel panel = new JPanel();
	f.add(panel);
	elementosVentana(panel);
	f.setVisible(true);	
    }
    private static void elementosVentana(JPanel panel ){
		String opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Menu", JOptionPane.PLAIN_MESSAGE,null, new Object [] {"Convertir monedas", "Convertir temperaturas"}, "elegir").toString();
	String seleccion = JOptionPane.showInputDialog(
						       null,
						       "Ingrese el valor a convertir",
						       JOptionPane.QUESTION_MESSAGE);

	
	panel.setLayout(null);
	
    }

}


    
	


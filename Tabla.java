import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JScrollPane;
public class Tabla extends JFrame{
	public Tabla() {
		super("Mi tabla");
		DefaultTableModel modelo=new DefaultTableModel();// Creacion de tabla
		//Columnas de la tabla
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Nacionalidad");
		modelo.addColumn("Telefono");
		//Informacion para las filas
		String []p1= {"Carlos","20","Costarricense","2256879"};
		String []p2= {"Maria","58","Colombiana","2256879"};
		String []p3= {"Pedro","21","Turco","2256879"};
		String []p4= {"Juan","15","Costarricense","2256879"};
		String []p5= {"Ana","33","Peruana","2256879"};
		String []p6= {"Maria","19","Boliviana","2256879"};
		String []p7= {"Monica","55","Italiana","2256879"};
		String []p8= {"Lucia","70","China","2256879"};
		//Fils de la tabla con su informacion
		modelo.addRow(p1);
		modelo.addRow(p2);
		modelo.addRow(p3);
		modelo.addRow(p4);
		modelo.addRow(p5);
		modelo.addRow(p6);
		modelo.addRow(p7);
		modelo.addRow(p8);
		
		JTable tabla=new JTable(modelo);
		JScrollPane scroll=new JScrollPane(tabla);
		//Tamaño de tabla y ventana   
		tabla.setBounds(12,22,500,500);
		setSize(750,700);
		scroll.setBounds(12,22,500,500);
		add(scroll);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] a) {
		Tabla t1=new Tabla();
	}
}
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class Tarea extends JFrame{
	public Tarea() {
		//Creacion de tabla
		super("Mi tabla");
		DefaultTableModel modelo=new DefaultTableModel();
		//Declaracion de variables a utilizar 
		String[] imp;
		String[] f;
		int o=0;
		//Ubicacion del archivo .csv
		File file=new File("");//Ubicacion de archivo
		try {
			Scanner inputStream=new Scanner(file);
			String p=inputStream.next();//Primera linea del archivo
			f=p.split(",");
			while(o!=f.length) {
				modelo.addColumn(f[o]);
				o++;
			}
			while(inputStream.hasNext()) {
				String data=inputStream.next();//Resto de lineas del archivo
				imp=data.split(",");
				modelo.addRow(imp);					
			}
			inputStream.close();			
		}		
		catch(Exception ex) {
		}		
		//Tmaño de tabla  y ventana   
		JTable tabla=new JTable(modelo);
		JScrollPane scroll=new JScrollPane(tabla);
		tabla.setBounds(12,22,500,500);
		setSize(750,700);
		scroll.setBounds(12,22,500,500);
		add(scroll);
		setLayout(null);
		setVisible(true);
	}			
	public static void main(String[] args) {
		Tarea t1=new Tarea();
	}	
}
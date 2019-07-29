import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class leer {
	public static void main(String[] args) {
		String fileName ="borre.csv";
		String[] imp;
		String[] f;
		String primera="";
		String resto="";
		int i=0;
		int o=0;
		File file=new File(fileName);//ubicacion o nombre del archivo
		try {
			Scanner inputStream=new Scanner(file);//Abre el archivo
			String p=inputStream.next();//Selecciona la primera linea
			f=p.split(",");
			while(o!=f.length) { //Para poder leer solo la primera linea
				primera=primera+f[o]+" ";
				o++;
			}
			while(inputStream.hasNext()) {
				String data=inputStream.next();//Cambia de linea
				System.out.println(data);
				imp=data.split(",");
				while(i!=imp.length) {// Obtener los datos de esa linea
					resto=resto+imp[i]+" ";
					i++;
				}
				resto=resto+"\n";
				i=0;	
			}
			System.out.println(primera);
			System.out.println(resto);
			inputStream.close();//Cierra el archivo
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}		
	}
}
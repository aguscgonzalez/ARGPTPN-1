package tp1TierraMedia;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Sistema {
	
	public static void main(String[] args) throws IOException, EntradaDeDatosException {
		
		GestorDeArchivos gestorDeArchivos = new GestorDeArchivos();
		gestorDeArchivos.leerArchivosDeConfiguracion();
		
		ArrayList<Usuario> usuarios = gestorDeArchivos.getUsuarios();
		ArrayList<Comprable> comprables = gestorDeArchivos.getComprables();
		
		Sugerencia sugerencia=new Sugerencia(usuarios, comprables);
		
		sugerencia.sugerirServicios();
		
		gestorDeArchivos.escribirArchivoDeSalida();
	}
}

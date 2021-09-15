package tp1TierraMedia;

public class TiempoIncorrectoException extends EntradaDeDatosException {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//	public static final String positivo="El valor referido a Tiempo Disponible, es incorrecto. Este debe ser mayor a 0";
	@Override
	public String exponerError(String nombre) {
		return "El valor referido a Tiempo en: "+nombre+", es incorrecto. Este debe ser mayor a 0";
	}
}

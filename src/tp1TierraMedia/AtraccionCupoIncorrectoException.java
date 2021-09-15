package tp1TierraMedia;

public class AtraccionCupoIncorrectoException extends EntradaDeDatosException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String exponerError(String nombre) {
		return "El valor referido a Cupo en: " + nombre + ", es incorrecto. Este debe ser mayor a 0";
	}
}

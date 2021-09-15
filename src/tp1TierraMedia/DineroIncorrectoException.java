package tp1TierraMedia;

public class DineroIncorrectoException extends EntradaDeDatosException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String exponerError(String nombre) {
		return "El valor referido a dinero en: "+nombre+", es incorrecto. Este debe ser mayor a 0";
	}
	
}

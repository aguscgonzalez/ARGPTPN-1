package tp1TierraMedia;

import java.util.ArrayList;

public class PromocionAxB extends Promocion {
	
	private Atraccion obtieneGratis;

	public PromocionAxB(String nombre, boolean estaVigente, ArrayList<Atraccion>
		atracciones, Atraccion obtieneGratis) 
			throws PromocionTieneUnSoloTipoDeAtraccion, AtraccionesNoContieneObtieneGratis {
		
		super(nombre, estaVigente, atracciones);
		
		if (!atracciones.contains(obtieneGratis)) {
			throw new AtraccionesNoContieneObtieneGratis("No se encontró la atracción gratuita en la lista de atracciones");
		}
		
		this.obtieneGratis = obtieneGratis;
	}
	
	@Override
	public int getPrecio() {
		return super.getPrecio() - this.obtieneGratis.getPrecio();	
	}
	
}

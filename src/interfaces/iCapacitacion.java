package interfaces;

import java.util.List;

import cl.security.model.Capacitacion;
	
public interface iCapacitacion {
		
	public List<Capacitacion> readAll();
		
	public List<Capacitacion> searchPalabra(String busqueda);
		
}

	





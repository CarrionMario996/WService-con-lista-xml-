package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dao.ViajeFacade;
import entity.Viaje;

@Path("/WSClienteLista")
public class WebServiceLista {
	private Viaje v;
	private ViajeFacade vf;

	public WebServiceLista() {
		v = new Viaje();
		vf = new ViajeFacade();
	}

	@GET
	@Path("/listar")
	@Produces("application/xml")
	public ItemList listarDatosXML() throws Exception {
		List<Viaje> listaDatos =  vf.mostrar();
		return new ItemList(listaDatos);
	}
}

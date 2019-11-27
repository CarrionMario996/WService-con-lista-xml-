package ws;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import entity.Viaje;

@XmlRootElement(name = "listaViaje")
public class ItemList {
	private List<Viaje> items;

	public ItemList() {

	}

	public ItemList(List<Viaje> items) {
		this.items = items;
	}

	@XmlElement(name = "datos")
	public List<Viaje> getItems() {
		return items;
	}
}

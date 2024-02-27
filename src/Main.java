import modelo.Habitacion;

public class Main {

	public static void main(String[] args) {
		Habitacion h= new Habitacion();
		h.impr();
		h.liberar();
		h.impr();
		h.ocupar();
		h.impr();
		h.reservar();
		h.impr();
		h.ocupar();
		h.impr();
		h.reservar();
		h.impr();
		h.liberar();
		h.impr();
	}
}

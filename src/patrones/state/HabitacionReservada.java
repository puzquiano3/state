package patrones.state;

public class HabitacionReservada implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion ha sido ocupada");
		return new HabitacionOcupada();
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ha sido liberada");
		return new HabitacionDisponible();
	}

	@Override
	public HabitacionEstado reservar() {
		System.out.println("La habitacion ya estaba reservada");
		return this;
	}

}

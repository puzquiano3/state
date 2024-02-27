package patrones.state;

public class HabitacionDisponible implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion ha sido ocupada");
		return new HabitacionOcupada();
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ya estaba disponible");
		return this;
	}

	@Override
	public HabitacionEstado reservar() {
		System.out.println("La habitacion ha sido reservada");
		return new HabitacionReservada();
	}

}

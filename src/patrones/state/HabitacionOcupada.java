package patrones.state;

public class HabitacionOcupada implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion ya estaba ocupada");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion ha sido liberada");
		return new HabitacionDisponible();
	}

	@Override
	public HabitacionEstado reservar() {
		System.out.println("Primero hay que liberar");
		return this;
	}

}

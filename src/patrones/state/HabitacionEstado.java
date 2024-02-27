package patrones.state;

public interface HabitacionEstado {
	public HabitacionEstado ocupar();
	public HabitacionEstado liberar();
	public HabitacionEstado reservar();
	

}

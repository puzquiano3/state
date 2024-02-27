package modelo;

import patrones.state.HabitacionDisponible;
import patrones.state.HabitacionEstado;
import patrones.state.HabitacionOcupada;
import patrones.state.HabitacionReservada;

public class Habitacion {
	private HabitacionEstado estado;
	
	public Habitacion() {
		estado= new HabitacionDisponible();
	}
	
	public void ocupar() {
		estado=estado.ocupar();
		if(estado instanceof HabitacionOcupada)
		{
			//Exito
		}else {
			//fracaso
		}
	}
	public void liberar() {
		estado=estado.liberar();	
	}
	public void reservar() {
		estado=estado.reservar();
		if (estado instanceof HabitacionReservada) {
						
		}else {
			
		}
	}
	
	public void impr() {
		System.out.println("El estado de la habitacion es "+estado.toString());
	}
}

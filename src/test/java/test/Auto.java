package test;

public class Auto{
	String modelo;
	int precio;
	Asiento [] asientos;
	String marca;
	Motor motor;
	int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int c=0;
		for (int i=0;i<asientos.length;i++) {
			if(asientos[i] instanceof Asiento) {
				c++;
			}
		}
		return c;
	}
	public String verificarIntegridad() {
		for (int i=0;i<asientos.length;i++) {
			if(asientos[i] instanceof Asiento) {
				if (asientos[i].registro!=this.registro) {
					return "Las piezas no son originales";
				}
			}
		}
		if (this.registro==motor.registro) {
			return "Auto original";
		}else {
			return "Las piezas no son originales";
		}	
	}
}
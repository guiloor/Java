
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Creando objetos de la clase Coche
		// NombreClase nombreObjeto = new NombreClase(...);
		
		Coche cocheJoseM = new Coche("4279DHD", "Audi", "A3", "negro", 2553.75, 1900, 1.2, 'd', true, 5);
		Coche cocheJC = new Coche("1234DJL", "Volvo", "S60", "rosita", 4500.25, 2500, 1.6, 'g', false, 5);
		Coche cocheDavid = new Coche("5986JDK", "Citroën", "Saxo", "verde", 432.62, 1200, 1.1, 'd', true, 5);
		Coche cocheVictor = new Coche("4332DLW", "Renault", "Classic", "violeta", 815.90, 1400, 1.2, 'g', true, 5);
		Coche cocheDiego = new Coche("0000DPM", "Renault", "Laguna", "granate", 1000.00, 1800, 1.5, 'g', true, 4);
		
		System.out.println(cocheJoseM.precioConIVA());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(cocheJC.getColor());
		cocheJC.setColor("azul marino");
		System.out.println(cocheJC.getColor());
		
		cocheVictor.setCombustible('d');
		System.out.println("El combustible de victor es: "+cocheVictor.getCombustible());
		
		System.out.println(cocheJC.toString());*/

	}

}

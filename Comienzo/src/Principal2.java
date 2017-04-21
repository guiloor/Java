
public class Principal2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Moto moto1 = new Moto("2468BCD", "Honda", "CBR", 125, true, 2015, false, true, 2, 30.3, 'C');
		Moto moto2 = new Moto("0169DVK", "Yamaha", "XMax", 250, false, 2013, true, true, 2, 10.7, 'T');
		Moto moto3 = new Moto("7742HXY", "Derby", "Robá", 50, false, 2004, false, false, 3, 6.9, 'U');
		
		// Año de la moto1
		System.out.println(moto1.getAno());
		
		// Cambiando modelo de la moto3
		moto3.setModelo("Senda");
		System.out.println(moto3.getModelo());
		
		// Mostrando info de la moto2
		System.out.println(moto2.toString());
		
		

	}

}

// Clase Coche realizada el 5/04/2017 por Guillermo López
public class Coche {
	
	// 1. Añadir los atributos de la clase
	String matricula;
	String marca;
	String modelo;
	String color;
	double precio;
	int cilindrada;
	double peso;
	char combustible;
	boolean itv;
	int plazas;
	
	//2. Método/s constructor/es
	public Coche(String matricula, String marca, String modelo, String color,
			double precio, int cilindrada, double peso, char combustible,
			boolean itv, int plazas) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
		this.cilindrada = cilindrada;
		this.peso = peso;
		this.combustible = combustible;
		this.itv = itv;
		this.plazas = plazas;
	}

	//3. Crear métodos GET y SET
		//GET nos devuelve el valor de un atributo
		//SET nos cambia el valor de un atributo
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getCombustible() {
		return combustible;
	}

	public void setCombustible(char combustible) {
		this.combustible = combustible;
	}

	public boolean isItv() {
		return itv;
	}

	public void setItv(boolean itv) {
		this.itv = itv;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	//4. Crear método toString
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", color=" + color + ", precio="
				+ precio + ", cilindrada=" + cilindrada + ", peso=" + peso
				+ ", combustible=" + combustible + ", itv=" + itv + ", plazas="
				+ plazas + "]";
	}

	//5. Creación manual de métodos
	// Método que añade un 21% de IVA al precio del coche
	
	public double precioConIVA () {
		
		double precioTotal = 0;
		precioTotal = precio * 1.21;
		return precioTotal;
		
	}
	
	
	
	
	
	
	
	
	
}

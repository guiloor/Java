package graficos;

public final class Sprite {
	// Tama�o del sprite cuadrado
	private final int lado;

	private int x;
	private int y;

	// Array que guarda la coleccion de colores del sprite
	public int[] pixeles;
	private HojaSprites hoja;



	// Constructor para Sprites normales
	public Sprite(final int lado, final int columna, final int fila, final int version, final HojaSprites hoja) {
		this.lado = lado;

		// Da tama�o al array Sprite de lado por lado segun se le mande
		pixeles = new int[lado * lado];

		this.x = columna * lado;
		this.y = fila * lado;
		this.hoja = hoja;
		

		// recorre la imagen
		cargaManipulada(version);
	}

	// Rellena de un color donde no se representen Sprites
	public Sprite(final int lado, final int color) {
		this.lado = lado;
		pixeles = new int[lado * lado];

		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = color;
		}
	}

	public int getlado() {
		return lado;
	}

	// Almacena el Sprite temporalmente para manipularlo
	private int[] iniciarPixelesTemporales() {
		int[] pixelesTemporales = new int[lado * lado];
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				// copia a un array de pixeles los colores de la imagen.
				pixelesTemporales[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
		return pixelesTemporales;
	}

	// Segun la version carga el Sprite de una manera u otra
	private void cargaManipulada(int version) {
		int[] pixelesTemporales = iniciarPixelesTemporales();

		switch (version) {
			case 1 :
				invertirX(pixelesTemporales);
				break;
			case 2 :
				invertirY(pixelesTemporales);
				break;
			case 3 :
				invertirXY(pixelesTemporales);
				break;
			case 4 :
				rotar90I(pixelesTemporales);
				break;
			case 5 :
				rotar90D(pixelesTemporales);
				break;
			case 6 :
				rotarI90InvertidoY(pixelesTemporales);
				break;
			case 7 :
				rotarD90InvertidoY(pixelesTemporales);
				break;
			default :
				cargaNormal();
		}
	}

	// Carga ek sprite con la X invertida
	private void invertirX(int[] pixelesTemporales) {
		int i = 0;
		for (int y = 0; y < lado; y++) {
			for (int x = lado - 1; x > -1; x--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// Carga el Sprite invirtiendo la Y
	private void invertirY(int[] pixelesTemporales) {
		int i = 0;
		for (int y = lado - 1; y > -1; y--) {
			for (int x = 0; x < lado; x++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 3 Carga el Sprite invirtiendo XY
	private void invertirXY(int[] pixelesTemporales) {
		for (int i = 0; i < pixeles.length; i++) {
			pixeles[i] = pixelesTemporales[pixelesTemporales.length - 1 - i];
		}
	}

	// 4 Carga el Sprite rotandolo 90� a la Izquierda
	private void rotar90I(int[] pixelesTemporales) {
		int i = 0;
		for (int x = lado - 1; x > -1; x--) {
			for (int y = 0; y < lado; y++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 5 Carga el Sprite rotandolo 90� a la Derecha
	private void rotar90D(int[] pixelesTemporales) {
		int i = 0;
		for (int x = 0; x < lado; x++) {
			for (int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 6 Carga el Sprite rotandolo 90� a la Izquierda e invierte la Y
	private void rotarI90InvertidoY(int[] pixelesTemporales) {
		int i = 0;
		for (int x = 0; x < lado; x++) {
			for (int y = 0; y < lado; y++) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// 7 Carga el Sprite rotandolo 90� a la Derecha e invierte la Y
	private void rotarD90InvertidoY(int[] pixelesTemporales) {
		int i = 0;
		for (int x = lado - 1; x > -1; x--) {
			for (int y = lado - 1; y > -1; y--) {
				pixeles[i] = pixelesTemporales[x + y * lado];
				i++;
			}
		}
	}

	// Carga el Sprite de forma normal
	private void cargaNormal() {
		for (int y = 0; y < lado; y++) {
			for (int x = 0; x < lado; x++) {
				// copia a un array de pixeles los colores de la imagen.
				pixeles[x + y * lado] = hoja.pixeles[(x + this.x) + (y + this.y) * hoja.getAncho()];
			}
		}
	}
}

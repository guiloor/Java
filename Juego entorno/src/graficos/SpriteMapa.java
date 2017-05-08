package graficos;

import Sprite;



public class SpriteMapa {
	
	// Colecci�n de sprites
	// Sprite color = negro
	public static final Sprite VACIO = new Sprite(32, 0);
	public static final Sprite LAVA = new Sprite(32, 3, 0, 0, HojaSprites.FondoLava);
	public static final Sprite ESQUINANO = new Sprite(32, 0, 0, 0, HojaSprites.FondoLava);
	public static final Sprite ESQUINANE = new Sprite(32, 0, 0, 1, HojaSprites.FondoLava);
	public static final Sprite ESQUINASO = new Sprite(32, 0, 0, 2, HojaSprites.FondoLava);
	public static final Sprite ESQUINASE = new Sprite(32, 0, 0, 3, HojaSprites.FondoLava);
	public static final Sprite PAREDN = new Sprite(32, 1, 0, 0, HojaSprites.FondoLava);
	public static final Sprite PAREDS = new Sprite(32, 1, 0, 2, HojaSprites.FondoLava);
	public static final Sprite PAREDO = new Sprite(32, 0, 1, 0, HojaSprites.FondoLava);
	public static final Sprite PAREDE = new Sprite(32, 0, 1, 1, HojaSprites.FondoLava);
	public static final Sprite CENTRO = new Sprite(32, 1, 1, 0, HojaSprites.FondoLava);
	// Fin de la colecci�n

}

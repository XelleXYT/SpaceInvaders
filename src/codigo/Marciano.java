/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Alejandro Luna Gomez
 */
public class Marciano {

    public Image imagen = null;
    public Image imagen2 = null;
    public int x = 0;
    public int y = 0;

    private int anchoPantalla;

    public boolean direccion = false; //False -> Movimiento izquierda

    public Marciano(int _anchoPantalla) {
	try {
	    imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
	    imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
	} catch (IOException e) {

	}
	anchoPantalla = _anchoPantalla;
    }

    public void muevete() {
	if (direccion) {
	    if (x < anchoPantalla - imagen.getWidth(null)) {
		x++;
	    }
	} else {
	    if (x > 0) {
		x--;
	    }
	}

    }
}

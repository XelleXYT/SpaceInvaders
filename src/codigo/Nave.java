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
public class Nave {

    public Image imagen = null;
    public int x = 0;
    public int y = 0;

    private boolean pulsadoIzq = false;
    private boolean pulsadoDer = false;

    public Nave() {
	try {
	    imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
	} catch (IOException e) {

	}
    }

    public boolean isPulsadoIzq() {
	return pulsadoIzq;
    }

    public void setPulsadoIzq(boolean pulsadoIzq) {
	this.pulsadoIzq = pulsadoIzq;
    }

    public boolean isPulsadoDer() {
	return pulsadoDer;
    }

    public void setPulsadoDer(boolean pulsadoDer) {
	this.pulsadoDer = pulsadoDer;
    }
    
    public void muevete(){
	if(pulsadoIzq && x > 0){
	    x--;
	}
	
	//TODO: Movimiento derecha
    }
}

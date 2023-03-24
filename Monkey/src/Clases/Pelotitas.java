package Clases;

import java.awt.Color;
import java.awt.Component;
import static java.lang.Thread.sleep;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Pelotitas extends Thread {

    private Color color;
    private int posicionX;
    private int posicionY;
    private int tiempo;
    private JPanel bolita;

    public Pelotitas(Color color, int posicionX, int posicionY, int tiempo) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tiempo = tiempo;
        this.bolita = new JPanel();
        this.bolita.setSize(25, 25);
        this.bolita.setLocation(posicionX, posicionY);
        this.bolita.setForeground(color);
        this.bolita.setBackground(color);
    }

    @Override
    public void run() {
        try {
            // Mueve los cuadrados en referencia a X
            if (this.bolita.getX() > this.posicionX) {
                for (int i = this.bolita.getX(); i > this.posicionX; i--) {
                    this.bolita.setLocation(i, this.bolita.getY());
                    Thread.sleep(1);
                }
            } else if (this.bolita.getX() <= this.posicionX) {
                for (int i = this.bolita.getX(); i <= this.posicionX; i++) {
                    this.bolita.setLocation(i, this.bolita.getY());
                    Thread.sleep(1);
                }
            }
            
            // Mueve los cuadrados en referencia a Y
            if (this.bolita.getY() > this.posicionY) {
                for (int i = this.bolita.getY(); i > this.posicionY; i--) {
                    this.bolita.setLocation(this.bolita.getX(), i);
                    Thread.sleep(1);
                }
            } else if (this.bolita.getY() <= this.posicionY) {
                for (int i = this.bolita.getY(); i <= this.posicionY; i++) {
                    this.bolita.setLocation(this.bolita.getX(), i);
                    Thread.sleep(1);
                }
            }
        } catch (InterruptedException e) {
            // Handle the exception if the sleep is interrupted
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public JPanel getBolita() {
        return bolita;
    }

    public void setBolita(JPanel bolita) {
        this.bolita = bolita;
    }
}
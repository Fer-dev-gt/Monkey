package Clases;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Animacion extends JPanel implements Runnable {

    private int numCircles;
    private Thread animationThread;
    private boolean isRunning;

    public Animacion(int numCircles) {
        this.numCircles = numCircles;
        isRunning = false;
    }

    public void start() {
        if (animationThread == null) {
            animationThread = new Thread(this);
            isRunning = true;
            animationThread.start();
        }
    }

    public void stop() {
        if (animationThread != null) {
            isRunning = false;
            animationThread.interrupt();
            animationThread = null;
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            for (int i = 1; i <= numCircles; i++) {
                Circle circle = new Circle(getWidth(), getHeight());
                add(circle);
                Thread circleThread = new Thread(circle);
                circleThread.start();
                try {
                    circleThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                remove(circle);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Circle extends JPanel implements Runnable {

        private int x;
        private int y;
        private int size;
        private Color color;
        private Random random;

        public Circle(int maxX, int maxY) {
            random = new Random();
            x = 10;
            y = 10;
            size = 50;
            color = Color.RED;
        }

        @Override
        public void run() {
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0:
                        color = Color.RED;
                        break;
                    case 1:
                        color = Color.GREEN;
                        break;
                    case 2:
                        color = Color.BLUE;
                        break;
                    case 3:
                        color = Color.YELLOW;
                        break;
                }
                try {
                    Thread.sleep(random.nextInt(500) + 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(color);
            g.fillOval(x, y, size, size);
        }
    }

}






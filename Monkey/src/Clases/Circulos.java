package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

    public class Circulos extends JPanel implements Runnable {

        private int x;
        private int y;
        private int size;
        private Color color;
        private Random random;

        public Circulos(int maxX, int maxY) {
            random = new Random();
            x = random.nextInt(maxX);
            y = random.nextInt(maxY);
            size = random.nextInt(50) + 50;
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
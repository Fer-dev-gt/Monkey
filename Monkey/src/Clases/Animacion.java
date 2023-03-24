package Clases;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class MovePanelThread extends Thread {
    private final JPanel panel;

    public MovePanelThread(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Move the panel by updating its bounds
                Rectangle bounds = panel.getBounds();
                bounds.translate(5, 0);
                panel.setBounds(bounds);

                // Wait for one second
                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            // Thread was interrupted, exit gracefully
        }
    }
}





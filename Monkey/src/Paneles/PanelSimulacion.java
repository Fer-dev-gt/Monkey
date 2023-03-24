package Paneles;

import Clases.Pelotitas;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class PanelSimulacion extends javax.swing.JPanel {
    Pelotitas bolita;
    JPanel[] estaciones;

    public PanelSimulacion() {
        initComponents();
        // Creo las 30 pelotitas
        
    }
    
    public void iniciarSimulacion(){
        this.bolita.setPosicionX(this.estaciones[0].getX());
        this.bolita.setPosicionY(this.estaciones[0].getY());
        this.bolita.start();
    }
    
    public void coordenadasPaneles(){
        this.estaciones = new JPanel[4];
        this.estaciones[0] = panelInventario;
        this.estaciones[1] = panelProduccion;
        this.estaciones[2] = panelEmpaquetado;
        this.estaciones[3] = panelSalida;
    }
    
    public void crearPelotitas(){
        for (int i = 0; i < 30; i++) {
            this.bolita = new Pelotitas(Color.GREEN, (770+i*2), 350,5);
            this.add(this.bolita.getBolita());
            System.out.println("Se creo pelotita #" + (i+1));
            iniciarSimulacion();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelEmpaquetado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelSalida = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelProduccion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel1.setText("Tiempo transcurrido");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jButton1.setText("Regresar");

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jButton2.setText("Reporte");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel2.setText("00:00");

        panelEmpaquetado.setBackground(new java.awt.Color(204, 153, 255));
        panelEmpaquetado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel6.setText("Empaquetado:");

        javax.swing.GroupLayout panelEmpaquetadoLayout = new javax.swing.GroupLayout(panelEmpaquetado);
        panelEmpaquetado.setLayout(panelEmpaquetadoLayout);
        panelEmpaquetadoLayout.setHorizontalGroup(
            panelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpaquetadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        panelEmpaquetadoLayout.setVerticalGroup(
            panelEmpaquetadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpaquetadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        panelSalida.setBackground(new java.awt.Color(255, 102, 102));
        panelSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel5.setText("Salida:");

        javax.swing.GroupLayout panelSalidaLayout = new javax.swing.GroupLayout(panelSalida);
        panelSalida.setLayout(panelSalidaLayout);
        panelSalidaLayout.setHorizontalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        panelSalidaLayout.setVerticalGroup(
            panelSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        panelProduccion.setBackground(new java.awt.Color(153, 255, 153));
        panelProduccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel8.setText("Producción:");

        javax.swing.GroupLayout panelProduccionLayout = new javax.swing.GroupLayout(panelProduccion);
        panelProduccion.setLayout(panelProduccionLayout);
        panelProduccionLayout.setHorizontalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        panelProduccionLayout.setVerticalGroup(
            panelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProduccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        panelInventario.setBackground(new java.awt.Color(102, 153, 255));
        panelInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel7.setText("Inventario:");

        javax.swing.GroupLayout panelInventarioLayout = new javax.swing.GroupLayout(panelInventario);
        panelInventario.setLayout(panelInventarioLayout);
        panelInventarioLayout.setHorizontalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        panelInventarioLayout.setVerticalGroup(
            panelInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Inicio");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(panelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(panelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jButton2))
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelEmpaquetado;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelProduccion;
    private javax.swing.JPanel panelSalida;
    // End of variables declaration//GEN-END:variables
}

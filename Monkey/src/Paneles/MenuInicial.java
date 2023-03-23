package Paneles;

import Clases.Animacion;
import javax.swing.JOptionPane;

public class MenuInicial extends javax.swing.JFrame {
    
    private int tiempoInvetario;
    private int tiempoProduccion;
    private int tiempoEmpaquetado;
    private int tiempoSalida;
    private int costoInvetario;
    private int costoProduccion;
    private int costoEmpaquetado;
    private int costoSalida;
    
    
    PanelSimulacion bolitas = new PanelSimulacion();
    
    public MenuInicial() {
        initComponents();
        this.setTitle("Monkey");
    }
    
    
    private void cambiarPanel(javax.swing.JPanel miPanel){
        miPanel.setSize(820,650);
        miPanel.setLocation(0,0);        
        simulacion.removeAll();
        simulacion.add(miPanel);
        simulacion.revalidate();
        simulacion.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tiempoInvetariotxt = new javax.swing.JTextField();
        tiempoEmpaquetadotxt = new javax.swing.JTextField();
        tiempoProducciontxt = new javax.swing.JTextField();
        tiempoSalidatxt = new javax.swing.JTextField();
        costoSalidatxt = new javax.swing.JTextField();
        costoEmpaquetadotxt = new javax.swing.JTextField();
        costoProducciontxt = new javax.swing.JTextField();
        costoInvetariotxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        simulacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans Myanmar", 2, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Monkey");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 43, 239, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans Myanmar", 2, 14)); // NOI18N
        jLabel2.setText("Costo(Q/seg)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 134, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 51));
        jLabel3.setFont(new java.awt.Font("Noto Sans Myanmar", 2, 14)); // NOI18N
        jLabel3.setText("Tiempo (seg)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 134, -1, -1));
        getContentPane().add(tiempoInvetariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 224, 160, -1));
        getContentPane().add(tiempoEmpaquetadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 306, 160, -1));
        getContentPane().add(tiempoProducciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 265, 160, -1));
        getContentPane().add(tiempoSalidatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 347, 160, -1));
        getContentPane().add(costoSalidatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 347, 160, -1));
        getContentPane().add(costoEmpaquetadotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 306, 160, -1));
        getContentPane().add(costoProducciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 265, 160, -1));
        getContentPane().add(costoInvetariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 224, 160, -1));

        jLabel5.setFont(new java.awt.Font("Gujarati Sangam MN", 2, 14)); // NOI18N
        jLabel5.setText("PRODUCCIÓN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 266, 122, -1));

        jLabel6.setFont(new java.awt.Font("Gujarati Sangam MN", 2, 14)); // NOI18N
        jLabel6.setText("INVENTARIO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 225, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gujarati Sangam MN", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("SALIDA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 348, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gujarati Sangam MN", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("EMPAQUETADO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 307, -1, -1));

        jButton1.setFont(new java.awt.Font("Kohinoor Bangla", 2, 13)); // NOI18N
        jButton1.setText("Iniciar Simulación");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 444, -1, -1));

        javax.swing.GroupLayout simulacionLayout = new javax.swing.GroupLayout(simulacion);
        simulacion.setLayout(simulacionLayout);
        simulacionLayout.setHorizontalGroup(
            simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        simulacionLayout.setVerticalGroup(
            simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 870, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            tiempoInvetario = Integer.parseInt(tiempoInvetariotxt.getText());
            tiempoProduccion = Integer.parseInt(tiempoProducciontxt.getText());
            tiempoEmpaquetado = Integer.parseInt(tiempoEmpaquetadotxt.getText());
            tiempoSalida = Integer.parseInt(tiempoSalidatxt.getText());
            costoInvetario = Integer.parseInt(costoInvetariotxt.getText());
            costoProduccion = Integer.parseInt(costoProducciontxt.getText());
            costoEmpaquetado = Integer.parseInt(costoEmpaquetadotxt.getText());
            costoSalida = Integer.parseInt(costoSalidatxt.getText());
            cambiarPanel(bolitas);
            Animacion panel = new Animacion(30);
            panel.start();
       } catch (NumberFormatException noEsNumero) {
            JOptionPane.showMessageDialog(null, "ERROR: Todos los campos tienen que ser números enteros, no decimales");
            System.out.println("ERROR: Todos los campos tienen que ser números enteros, no decimales");
       }        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField costoEmpaquetadotxt;
    private javax.swing.JTextField costoInvetariotxt;
    private javax.swing.JTextField costoProducciontxt;
    private javax.swing.JTextField costoSalidatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel simulacion;
    private javax.swing.JTextField tiempoEmpaquetadotxt;
    private javax.swing.JTextField tiempoInvetariotxt;
    private javax.swing.JTextField tiempoProducciontxt;
    private javax.swing.JTextField tiempoSalidatxt;
    // End of variables declaration//GEN-END:variables
}

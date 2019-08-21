package view;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import primitivas.Primitivas;

/**
 *
 * @author wesley
 */
public class FormPrincipal extends javax.swing.JFrame {

    private final Primitivas png;
    private final List<Point> lista;

    public FormPrincipal() {
        initComponents();
        png = new Primitivas(pn.getSize());
        pn.add(png);
        lista = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn = new javax.swing.JPanel();
        txtXY = new javax.swing.JTextField();
        pnSegmentoReta = new javax.swing.JPanel();
        txtY1 = new javax.swing.JTextField();
        lblX1 = new javax.swing.JLabel();
        lblY1 = new javax.swing.JLabel();
        txtX1 = new javax.swing.JTextField();
        btnDesenharSegmentoReta = new javax.swing.JButton();
        lblX2 = new javax.swing.JLabel();
        txtX2 = new javax.swing.JTextField();
        lblY2 = new javax.swing.JLabel();
        txtY2 = new javax.swing.JTextField();
        pnCor = new javax.swing.JPanel();
        pnCorContorno = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnCircunferencia = new javax.swing.JPanel();
        lblRaio = new javax.swing.JLabel();
        txtRaio = new javax.swing.JTextField();
        btnDesenharCircunferencia = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn.setBackground(new java.awt.Color(255, 255, 255));
        pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn.setPreferredSize(new java.awt.Dimension(400, 400));
        pn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pnMouseMoved(evt);
            }
        });
        pn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnLayout = new javax.swing.GroupLayout(pn);
        pn.setLayout(pnLayout);
        pnLayout.setHorizontalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        pnLayout.setVerticalGroup(
            pnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtXY.setEditable(false);
        txtXY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtXY.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pnSegmentoReta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Segmento de Reta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtY1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblX1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblX1.setText("X1");

        lblY1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblY1.setText("Y1");

        txtX1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharSegmentoReta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharSegmentoReta.setText("desenhar");
        btnDesenharSegmentoReta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharSegmentoRetaActionPerformed(evt);
            }
        });

        lblX2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblX2.setText("X2");

        txtX2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblY2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblY2.setText("Y2");

        txtY2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnSegmentoRetaLayout = new javax.swing.GroupLayout(pnSegmentoReta);
        pnSegmentoReta.setLayout(pnSegmentoRetaLayout);
        pnSegmentoRetaLayout.setHorizontalGroup(
            pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesenharSegmentoReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblX2)
                            .addComponent(lblX1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                                .addComponent(lblY1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                                .addComponent(lblY2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnSegmentoRetaLayout.setVerticalGroup(
            pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoRetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblY1)
                    .addComponent(lblX1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSegmentoRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX2)
                    .addComponent(lblY2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharSegmentoReta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        pnCor.setPreferredSize(new java.awt.Dimension(60, 60));

        pnCorContorno.setBackground(new java.awt.Color(255, 0, 0));
        pnCorContorno.setPreferredSize(new java.awt.Dimension(60, 60));
        pnCorContorno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnCorContornoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCorContornoLayout = new javax.swing.GroupLayout(pnCorContorno);
        pnCorContorno.setLayout(pnCorContornoLayout);
        pnCorContornoLayout.setHorizontalGroup(
            pnCorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        pnCorContornoLayout.setVerticalGroup(
            pnCorContornoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("contorno");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnCorLayout = new javax.swing.GroupLayout(pnCor);
        pnCor.setLayout(pnCorLayout);
        pnCorLayout.setHorizontalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorLayout.setVerticalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCircunferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circunferência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblRaio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRaio.setText("Raio");

        txtRaio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharCircunferencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharCircunferencia.setText("desenhar");
        btnDesenharCircunferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharCircunferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCircunferenciaLayout = new javax.swing.GroupLayout(pnCircunferencia);
        pnCircunferencia.setLayout(pnCircunferenciaLayout);
        pnCircunferenciaLayout.setHorizontalGroup(
            pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesenharCircunferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                        .addComponent(lblRaio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCircunferenciaLayout.setVerticalGroup(
            pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCircunferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRaio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesenharCircunferencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtXY)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pnSegmentoReta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnCor, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(pnCircunferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnCor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnSegmentoReta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(txtXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnCircunferencia.getAccessibleContext().setAccessibleName("CIrcunferência");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseMoved
        int x = evt.getX();
        int y = evt.getY();
        txtXY.setText(String.format("%d,%d", x, y));
    }//GEN-LAST:event_pnMouseMoved

    private void pnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnMouseClicked
        png.desenharPixel(
                evt.getX(), evt.getY(), 
                pnCorContorno.getBackground()
        );
        
        lista.add(new Point(evt.getX(), evt.getY()));
        if (lista.size() == 2) {
            png.desenharSegmentoReta(
                lista.get(0).x, lista.get(0).y,
                lista.get(1).x, lista.get(1).y,
                pnCorContorno.getBackground()
            );
            lista.clear();
        }
    }//GEN-LAST:event_pnMouseClicked

    private void pnCorContornoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnCorContornoMouseClicked
        Color cor = JColorChooser.showDialog(this, "Selecione a cor", pnCor.getBackground());
        pnCorContorno.setBackground(cor);
    }//GEN-LAST:event_pnCorContornoMouseClicked

    private void btnDesenharSegmentoRetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharSegmentoRetaActionPerformed
        try {
            int x1 = Integer.parseInt(txtX1.getText());
            int y1 = Integer.parseInt(txtY1.getText());
            int x2 = Integer.parseInt(txtX2.getText());
            int y2 = Integer.parseInt(txtY2.getText());
//            png.desenharSegmentoReta(x1, y1, x2, y2,
//                    pnCorContorno.getBackground());

            png.desenharSegmentoRetaBresenham(x1, y1, x2, y2,
                    pnCorContorno.getBackground());
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnDesenharSegmentoRetaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        png.limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDesenharCircunferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharCircunferenciaActionPerformed
        try {
            int raio = Integer.parseInt(txtRaio.getText());
            png.desenharCircunferencia(raio, pnCorContorno.getBackground());
       
            for (int i = raio; i < 1000; i+=5) {
                png.desenharCircunferencia(raio, pnCorContorno.getBackground());
            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDesenharCircunferenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesenharCircunferencia;
    private javax.swing.JButton btnDesenharSegmentoReta;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRaio;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblY1;
    private javax.swing.JLabel lblY2;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pnCircunferencia;
    private javax.swing.JPanel pnCor;
    private javax.swing.JPanel pnCorContorno;
    private javax.swing.JPanel pnSegmentoReta;
    private javax.swing.JTextField txtRaio;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtXY;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    // End of variables declaration//GEN-END:variables
}

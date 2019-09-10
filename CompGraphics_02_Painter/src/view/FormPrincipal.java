package view;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import primitivas.Curvas;
import primitivas.Primitivas;
import primitivas.Transformacoes;

/**
 *
 * @author wesley
 */
public class FormPrincipal extends javax.swing.JFrame {

    private final Primitivas png;
    private List<Point> lista;
    private boolean xretas;

    public FormPrincipal() {
        initComponents();
        configurarFormulario();
        
        png = new Primitivas(pn.getSize());
        pn.add(png);
        lista = new ArrayList<>();
        xretas = true;
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
        btnRetas = new javax.swing.JButton();
        btnCurvas = new javax.swing.JButton();
        pnCircunferencia = new javax.swing.JPanel();
        lblRaio = new javax.swing.JLabel();
        txtRaio = new javax.swing.JTextField();
        btnDesenharCircunferencia = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pnCircunferencia1 = new javax.swing.JPanel();
        btnHermite = new javax.swing.JButton();
        btnBezier = new javax.swing.JButton();
        btnBSplines = new javax.swing.JButton();
        txtHermite1 = new javax.swing.JTextField();
        txtHermite2 = new javax.swing.JTextField();
        pnTranslacao = new javax.swing.JPanel();
        lblTx = new javax.swing.JLabel();
        txtTx = new javax.swing.JTextField();
        lblTy = new javax.swing.JLabel();
        txtTy = new javax.swing.JTextField();
        btnDesenharTranslacao = new javax.swing.JButton();
        pnEscala = new javax.swing.JPanel();
        lblSx = new javax.swing.JLabel();
        txtSx = new javax.swing.JTextField();
        lblSy = new javax.swing.JLabel();
        txtSy = new javax.swing.JTextField();
        btnDesenharEscala = new javax.swing.JButton();
        pnRotacao = new javax.swing.JPanel();
        lblTheta = new javax.swing.JLabel();
        txtTheta = new javax.swing.JTextField();
        btnDesenharRotacao = new javax.swing.JButton();
        pnSegmentoReta5 = new javax.swing.JPanel();
        btnDesenharTriangulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
            .addGap(0, 867, Short.MAX_VALUE)
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
        btnDesenharSegmentoReta.setText("Desenhar");
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btnRetas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRetas.setText("Retas");
        btnRetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetasActionPerformed(evt);
            }
        });

        btnCurvas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCurvas.setText("Curvas");
        btnCurvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurvasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCorLayout = new javax.swing.GroupLayout(pnCor);
        pnCor.setLayout(pnCorLayout);
        pnCorLayout.setHorizontalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnCorLayout.createSequentialGroup()
                        .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCurvas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorLayout.setVerticalGroup(
            pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnCorContorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCorLayout.createSequentialGroup()
                        .addComponent(btnRetas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCurvas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCircunferencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circunferência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblRaio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRaio.setText("Raio");

        txtRaio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharCircunferencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharCircunferencia.setText("Desenhar");
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

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pnCircunferencia1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Curvas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnHermite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHermite.setText("Hermite");
        btnHermite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHermiteActionPerformed(evt);
            }
        });

        btnBezier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBezier.setText("Bézier");
        btnBezier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBezierActionPerformed(evt);
            }
        });

        btnBSplines.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBSplines.setText("B-Splines");
        btnBSplines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBSplinesActionPerformed(evt);
            }
        });

        txtHermite1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtHermite2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnCircunferencia1Layout = new javax.swing.GroupLayout(pnCircunferencia1);
        pnCircunferencia1.setLayout(pnCircunferencia1Layout);
        pnCircunferencia1Layout.setHorizontalGroup(
            pnCircunferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferencia1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCircunferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBezier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnCircunferencia1Layout.createSequentialGroup()
                        .addComponent(btnHermite, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnCircunferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHermite1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(txtHermite2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnBSplines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnCircunferencia1Layout.setVerticalGroup(
            pnCircunferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCircunferencia1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCircunferencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHermite, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCircunferencia1Layout.createSequentialGroup()
                        .addComponent(txtHermite1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHermite2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBezier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnBSplines, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnTranslacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Translação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblTx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTx.setText("Tx");

        txtTx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTy.setText("Ty");

        txtTy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharTranslacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharTranslacao.setText("Desenhar");
        btnDesenharTranslacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharTranslacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTranslacaoLayout = new javax.swing.GroupLayout(pnTranslacao);
        pnTranslacao.setLayout(pnTranslacaoLayout);
        pnTranslacaoLayout.setHorizontalGroup(
            pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTranslacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesenharTranslacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnTranslacaoLayout.createSequentialGroup()
                        .addComponent(lblTx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTranslacaoLayout.setVerticalGroup(
            pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTranslacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTranslacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTy)
                    .addComponent(lblTx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharTranslacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnEscala.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escala", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblSx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSx.setText("Sx");

        txtSx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSy.setText("Sy");

        txtSy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharEscala.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharEscala.setText("Desenhar");
        btnDesenharEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharEscalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnEscalaLayout = new javax.swing.GroupLayout(pnEscala);
        pnEscala.setLayout(pnEscalaLayout);
        pnEscalaLayout.setHorizontalGroup(
            pnEscalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEscalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEscalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesenharEscala, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnEscalaLayout.createSequentialGroup()
                        .addComponent(lblSx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnEscalaLayout.setVerticalGroup(
            pnEscalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEscalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEscalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSy)
                    .addComponent(lblSx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharEscala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnRotacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rotação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblTheta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTheta.setText("<html>&Theta<html>");

        txtTheta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnDesenharRotacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharRotacao.setText("Desenhar");
        btnDesenharRotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharRotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnRotacaoLayout = new javax.swing.GroupLayout(pnRotacao);
        pnRotacao.setLayout(pnRotacaoLayout);
        pnRotacaoLayout.setHorizontalGroup(
            pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesenharRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnRotacaoLayout.createSequentialGroup()
                        .addComponent(lblTheta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTheta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRotacaoLayout.setVerticalGroup(
            pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRotacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTheta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTheta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDesenharRotacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnSegmentoReta5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Triângulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btnDesenharTriangulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesenharTriangulo.setText("Desenhar");
        btnDesenharTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenharTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSegmentoReta5Layout = new javax.swing.GroupLayout(pnSegmentoReta5);
        pnSegmentoReta5.setLayout(pnSegmentoReta5Layout);
        pnSegmentoReta5Layout.setHorizontalGroup(
            pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoReta5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDesenharTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnSegmentoReta5Layout.setVerticalGroup(
            pnSegmentoReta5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSegmentoReta5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDesenharTriangulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnCor, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(pnCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnSegmentoReta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnCircunferencia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtXY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnRotacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnSegmentoReta5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTranslacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnEscala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnRotacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnSegmentoReta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnCor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnSegmentoReta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnCircunferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtXY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
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
        
        if (xretas == true) {
            if (lista.size() == 2) {
                png.desenharSegmentoReta(
                    lista.get(0).x, lista.get(0).y,
                    lista.get(1).x, lista.get(1).y,
                    pnCorContorno.getBackground()
                );
                lista.clear();
            }
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

    private void btnHermiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHermiteActionPerformed
        
        int x1 = Integer.parseInt(txtHermite1.getText());
        int x2 = Integer.parseInt(txtHermite2.getText());
        
        // Curva de Hermite precisa de DOIS pontos
        if (lista.size() >= 2) {
            Curvas.Hermite(
                png.getGraphics(),
                lista.get(0),
                lista.get(1),
                x1, x2,
                pnCorContorno.getBackground()
                
            );
            lista.clear();
        }
    }//GEN-LAST:event_btnHermiteActionPerformed

    private void btnBezierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBezierActionPerformed
        
        // Curva de Bézier precisa de QUATRO pontos
        if (lista.size() >= 4) {
            Curvas.Bezier(
                png.getGraphics(),
                lista.get(0),
                lista.get(1),
                lista.get(2),
                lista.get(3),
                pnCorContorno.getBackground()
                
            );
            lista.clear();
        }
    }//GEN-LAST:event_btnBezierActionPerformed

    private void btnBSplinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBSplinesActionPerformed
    
        // Curva de B-Splines precisa de uma lista de pontos
        Curvas.BSplines(
            png.getGraphics(),
            lista,
            pnCorContorno.getBackground()
        );
        lista.clear();
    }//GEN-LAST:event_btnBSplinesActionPerformed

    private void btnRetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetasActionPerformed
        setarCurvaReta(true);
    }//GEN-LAST:event_btnRetasActionPerformed

    private void btnCurvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurvasActionPerformed
        setarCurvaReta(false);
    }//GEN-LAST:event_btnCurvasActionPerformed

    private void btnDesenharTranslacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharTranslacaoActionPerformed
        
        int tx = Integer.parseInt(txtTx.getText());
        int ty = Integer.parseInt(txtTy.getText());

        new Transformacoes().translacao(lista, tx, ty);
        png.limpar();
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnDesenharTranslacaoActionPerformed

    private void btnDesenharEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharEscalaActionPerformed
        
        double Sx = Integer.parseInt(txtSx.getText());
        double Sy = Integer.parseInt(txtSy.getText());
        
        new Transformacoes().escala(lista, Sx, Sy);
        png.limpar();
        png.desenharPoligono(lista, pnCorContorno.getBackground());
        
    }//GEN-LAST:event_btnDesenharEscalaActionPerformed

    private void btnDesenharRotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharRotacaoActionPerformed
        double theta = Double.parseDouble(txtTheta.getText());
        
        new Transformacoes().rotacao(lista, theta);
        png.limpar();
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnDesenharRotacaoActionPerformed

    private void btnDesenharTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenharTrianguloActionPerformed
        int cx = pn.getWidth() / 2;
        int cy = png.getHeight() / 2;

        lista.clear();
        lista.add(new Point(cx, cy - 100));
        lista.add(new Point(cx - 100, cy + 100));
        lista.add(new Point(cx + 100, cy + 100));
        png.desenharPoligono(lista, pnCorContorno.getBackground());
    }//GEN-LAST:event_btnDesenharTrianguloActionPerformed

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
    private javax.swing.JButton btnBSplines;
    private javax.swing.JButton btnBezier;
    private javax.swing.JButton btnCurvas;
    private javax.swing.JButton btnDesenharCircunferencia;
    private javax.swing.JButton btnDesenharEscala;
    private javax.swing.JButton btnDesenharRotacao;
    private javax.swing.JButton btnDesenharSegmentoReta;
    private javax.swing.JButton btnDesenharSegmentoReta1;
    private javax.swing.JButton btnDesenharTranslacao;
    private javax.swing.JButton btnDesenharTriangulo;
    private javax.swing.JButton btnHermite;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblRaio;
    private javax.swing.JLabel lblSx;
    private javax.swing.JLabel lblSy;
    private javax.swing.JLabel lblTheta;
    private javax.swing.JLabel lblTx;
    private javax.swing.JLabel lblTy;
    private javax.swing.JLabel lblX1;
    private javax.swing.JLabel lblX2;
    private javax.swing.JLabel lblX3;
    private javax.swing.JLabel lblX4;
    private javax.swing.JLabel lblY1;
    private javax.swing.JLabel lblY2;
    private javax.swing.JLabel lblY3;
    private javax.swing.JLabel lblY4;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pn1;
    private javax.swing.JPanel pnCircunferencia;
    private javax.swing.JPanel pnCircunferencia1;
    private javax.swing.JPanel pnCor;
    private javax.swing.JPanel pnCorContorno;
    private javax.swing.JPanel pnEscala;
    private javax.swing.JPanel pnRotacao;
    private javax.swing.JPanel pnSegmentoReta;
    private javax.swing.JPanel pnSegmentoReta1;
    private javax.swing.JPanel pnSegmentoReta5;
    private javax.swing.JPanel pnTranslacao;
    private javax.swing.JTextField txtHermite1;
    private javax.swing.JTextField txtHermite2;
    private javax.swing.JTextField txtRaio;
    private javax.swing.JTextField txtSx;
    private javax.swing.JTextField txtSy;
    private javax.swing.JTextField txtTheta;
    private javax.swing.JTextField txtTx;
    private javax.swing.JTextField txtTy;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtX3;
    private javax.swing.JTextField txtX4;
    private javax.swing.JTextField txtXY;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtY3;
    private javax.swing.JTextField txtY4;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Painter");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    private void setarCurvaReta(boolean status) {
        xretas = status;
    }
}

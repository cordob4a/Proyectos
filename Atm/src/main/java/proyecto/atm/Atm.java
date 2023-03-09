package proyecto.atm;
import javax.swing.*;
import Sistema.SistemaAtm;
public class Atm extends javax.swing.JFrame {
    boolean opciondepositar = false;
    boolean opcionretirar = false;
    
    double nuevaCantidad = 0;
    String nuevoNumero;
    String pw;
    
    SistemaAtm atm = new SistemaAtm();
    public Atm() {
        initComponents();
        txt_nombre.setText("");
    txt_cantidad.setText("");
        
    panel_opcion.setVisible(false);
    btn_depositar.setEnabled(false);
    btn_retirar.setEnabled(false);
    btn_salir.setEnabled(false);
        
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
    btn0.setEnabled(false);
    
    btn_cancelar.setEnabled(false);
    btn_borrar.setEnabled(false);
    btn_aceptar.setEnabled(false);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_saldo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_opcion = new javax.swing.JPanel();
        txt_opcion = new javax.swing.JLabel();
        txt_cantidad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_depositar = new javax.swing.JButton();
        btn_retirar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel1.setText("CAJERO LINK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("User:");

        txt_nombre.setText("nombre");

        jLabel4.setText("Saldo: $");

        txt_saldo.setText("0.00");

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Depositar");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Retirar");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Salir");

        panel_opcion.setBackground(new java.awt.Color(0, 102, 102));
        panel_opcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_opcion.setText("Opcion");

        txt_cantidad.setText("Cantidad");

        javax.swing.GroupLayout panel_opcionLayout = new javax.swing.GroupLayout(panel_opcion);
        panel_opcion.setLayout(panel_opcionLayout);
        panel_opcionLayout.setHorizontalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_opcionLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(txt_opcion)
                .addGap(106, 106, 106))
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addComponent(txt_cantidad)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_opcionLayout.setVerticalGroup(
            panel_opcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionLayout.createSequentialGroup()
                .addComponent(txt_opcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidad)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombre))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_saldo)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel_opcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_saldo))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(panel_opcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_ingresar)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_depositar.setText("<");
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });

        btn_retirar.setText("<");
        btn_retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirarActionPerformed(evt);
            }
        });

        btn_salir.setText("<");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_depositar)
                    .addComponent(btn_retirar)
                    .addComponent(btn_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btn_depositar)
                        .addGap(4, 4, 4)
                        .addComponent(btn_retirar)
                        .addGap(3, 3, 3)
                        .addComponent(btn_salir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {                                              
       opciondepositar = true;
        btn_retirar.setEnabled(false);
        btn_depositar.setEnabled(false);
        panel_opcion.setEnabled(true);
        
    txt_opcion.setText("[Deposito] -Ingresar una cantidad- ");
        
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
        
        btn_cancelar.setEnabled(true); 
        btn_borrar.setEnabled(true);
        btn_aceptar.setEnabled(true);
    }                                             

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(opciondepositar == true || opcionretirar == true)
{
          opciondepositar = false;
          opcionretirar = false;
      panel_opcion.setVisible(false);
      btn_depositar.setEnabled(true);
      btn_retirar.setEnabled(true);
      
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
        
      btn_cancelar.setEnabled(true); 
      btn_borrar.setEnabled(true);
      btn_aceptar.setEnabled(true);
      
            txt_cantidad.setText(" ");
}else{JOptionPane.showMessageDialog(null,"Gracias hasta la proximaaaaaaaaaaaa"); 
System.exit(0);}
    }                                         

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        txt_nombre.setText(JOptionPane.showInputDialog("Ingrese su nombre"));
        JOptionPane.showInputDialog("Ingrese su contraseña");
        btn_ingresar.setEnabled(false);
        btn_depositar.setEnabled(true);
        btn_retirar.setEnabled(true);
        btn_salir.setEnabled(true);
 
    }                                            

    private void btn_retirarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        opcionretirar= true;
        btn_retirar.setEnabled(false);
        btn_depositar.setEnabled(false);
        panel_opcion.setEnabled(true);
        
    txt_opcion.setText("[Retiro] -Ingresar una cantidad- ");
        
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
        
        btn_cancelar.setEnabled(true); 
        btn_borrar.setEnabled(true);
        btn_aceptar.setEnabled(true);  

    }                                           

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
if(txt_cantidad.getText().equals(""))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "1";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "1";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
      if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "2";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "2";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "3";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "3";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
      if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "4";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "4";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
  if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "5";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "5";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
      if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "6";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "6";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
  if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "7";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "7";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "8";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "8";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "9";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "9";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(txt_cantidad.getText().equals(" "))
        {
        txt_cantidad.setText("");
        nuevoNumero = txt_cantidad.getText() + "0";
        txt_cantidad.setText(nuevoNumero);
        }else{
        nuevoNumero = txt_cantidad.getText() + "0";
        txt_cantidad.setText(nuevoNumero);}
    }                                    

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                             
       if(opciondepositar == true || opcionretirar == true)
{
          opciondepositar = false;
          opcionretirar = false;
      panel_opcion.setVisible(false);
      btn_depositar.setEnabled(true);
      btn_retirar.setEnabled(true);
      
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
        
      btn_cancelar.setEnabled(true); 
      btn_borrar.setEnabled(true);
      btn_aceptar.setEnabled(true);
      
            txt_cantidad.setText(" ");
}else{JOptionPane.showMessageDialog(null,"Gracias hasta la proximaaaaaaaaaaaa"); 
System.exit(0);}
    
    }                                            

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
       txt_cantidad.setText(txt_cantidad.getText().substring(0, txt_cantidad.getText().length()-1));
        if(txt_cantidad.getText().equals("")){
            txt_cantidad.setText(" ");
        }
    }                                          

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(txt_cantidad.getText().equals(" ")){
       opciondepositar=false;
       opcionretirar=false;
       panel_opcion.setVisible(false);
       btn_depositar.setEnabled(true);
       btn_retirar.setEnabled(true);
       txt_cantidad.setText(" ");
       
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
    btn0.setEnabled(false);
    
    btn_cancelar.setEnabled(false);
    btn_borrar.setEnabled(false);
    btn_aceptar.setEnabled(false);
       }else if(opciondepositar == true){
           opciondepositar = false;
           nuevaCantidad = Double.parseDouble(String.valueOf(txt_cantidad.getText()));
           atm.depositar(nuevaCantidad);
           txt_saldo.setText(String.valueOf(atm.obtenerSaldo()));
           
           panel_opcion.setVisible(false);
           txt_cantidad.setText(" ");
           btn_depositar.setEnabled(true);
           btn_retirar.setEnabled(true);
           
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
    btn0.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_aceptar.setEnabled(false); 
        }else if(opcionretirar==true){
            opcionretirar= false;
            nuevaCantidad = Double.parseDouble(String.valueOf(txt_cantidad.getText()));
            atm.retirar(nuevaCantidad);
            txt_saldo.setText(String.valueOf(atm.obtenerSaldo()));
            
            panel_opcion.setVisible(false);
           txt_cantidad.setText(" ");
           btn_depositar.setEnabled(true);
           btn_retirar.setEnabled(true);
           
    btn1.setEnabled(false);
    btn2.setEnabled(false);
    btn3.setEnabled(false);
    btn4.setEnabled(false);
    btn5.setEnabled(false);
    btn6.setEnabled(false);
    btn7.setEnabled(false);
    btn8.setEnabled(false);
    btn9.setEnabled(false);
    btn0.setEnabled(false);
        btn_cancelar.setEnabled(false);
        btn_borrar.setEnabled(false);
        btn_aceptar.setEnabled(false);  
       }
    }                                           

   public static void main(String args[]) {
     
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_depositar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_retirar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel panel_opcion;
    private javax.swing.JLabel txt_cantidad;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_opcion;
    private javax.swing.JLabel txt_saldo;
    // End of variables declaration                   
}


package Interfaces;

import static Interfaces.Alumnos.tabla;
import javax.swing.*;
import proyecto.MysqlC;

public class Temas extends javax.swing.JInternalFrame {
    int cont=1,id;
    int num = 0;
    int idtem=4;
    int in=1,c=0,v=1;
    public int x,y;
    public String nombre2;
    public String pregunta,preg,respuesta,resp,calif,preg2;
    public String formula;
    public boolean prog = false; 
    public String tabla; 
    
    public void Tabla(String tabla){
        this.tabla=tabla;
        //System.out.println("Entre al void tabla: "+this.tabla);
    }
    
     public void getNombre(String nombre){
        this.nombre2=nombre;
    }
    
    public Temas() {
        borrarBarra();
        Tabla(Alumnos.setTabla());
        //jLabel3.setText(tabla);
        //this.setTitle(tabla);
        MysqlC db = new MysqlC();
        
        num = db.contar(tabla.replaceAll("\\s",""));
        nombre2=Alumnos.setNombres();
        
        initComponents();
                
        if(cont==1){
            preg=db.getPregunta(1,tabla.replaceAll("\\s",""));
            jLabel2.setText(preg);
            formula = db.getFormula(tabla.replaceAll("\\s",""));
            labelformula.setText(formula);
        }
        if(cont==num){
            sigfin1.setEnabled(false);
            sigfin2.setEnabled(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        sigfin1 = new javax.swing.JButton();
        sigfin2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fraccion = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        labelformula = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(103, 178, 66)));
        setFocusCycleRoot(false);

        jPanel1.setBackground(new java.awt.Color(103, 178, 66));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(103, 178, 66)));
        jPanel1.setPreferredSize(new java.awt.Dimension(524, 36));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar a2.png"))); // NOI18N
        jLabel7.setToolTipText("Cerrar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(tabla);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(103, 178, 66));
        jLabel1.setText("Respuesta:");

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textKeyTyped(evt);
            }
        });

        sigfin1.setText("Siguiente");
        sigfin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigfin1ActionPerformed(evt);
            }
        });

        sigfin2.setText("Finalizar");
        sigfin2.setEnabled(false);
        sigfin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigfin2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(103, 178, 66));

        fraccion.setText("x/y");
        fraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraccionActionPerformed(evt);
            }
        });

        potencia.setText("x²");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        raiz.setText("√");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(sigfin1))
                            .addComponent(text))
                        .addGap(33, 33, 33)
                        .addComponent(sigfin2)
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fraccion)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(potencia)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(raiz)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelformula, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(labelformula, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(raiz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(potencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sigfin1)
                        .addComponent(sigfin2))
                    .addComponent(fraccion))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        
    }//GEN-LAST:event_textActionPerformed

    private void textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyTyped

    }//GEN-LAST:event_textKeyTyped

    private void sigfin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigfin1ActionPerformed
        cambioPreg();
        System.out.println(cont);
    }//GEN-LAST:event_sigfin1ActionPerformed

    private void sigfin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigfin2ActionPerformed
        cambioPreg2();
    }//GEN-LAST:event_sigfin2ActionPerformed

    private void fraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraccionActionPerformed
        text.setText(text.getText()+"/");
    }//GEN-LAST:event_fraccionActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        text.setText(text.getText()+"²");
    }//GEN-LAST:event_potenciaActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        text.setText(text.getText()+"√");
    }//GEN-LAST:event_raizActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(getLocation().x + evt.getX() - x, getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar a1.png")));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar a2.png")));
    }//GEN-LAST:event_jLabel7MouseExited

    private void borrarBarra(){
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setEastPane(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setWestPane(null);
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setSouthPane(null);
    }
    
    private void cambioPreg(){
        MysqlC db = new MysqlC();
        int c=cont;
        resp = db.getRespuesta(cont,tabla.replaceAll("\\s",""));
        respuesta = text.getText().replace(" ", "");
        if(respuesta.equals(resp)){
            JOptionPane.showMessageDialog(null,"Respuesta correcta","Correcto",JOptionPane.INFORMATION_MESSAGE,null);
            calif = "Correcto";
            id = db.getId(preg);
            db.updateProg(calif, id);
            cont++;
            text.setText(null);
            preg=db.getPregunta(cont,tabla.replaceAll("\\s",""));
            jLabel2.setText(preg);;
            
            if(num==cont){
                sigfin1.setEnabled(false);
                sigfin2.setEnabled(true);
            }
            
        }else{
		
            if(in==1){
                JOptionPane.showMessageDialog(null,"Respuesta incorrecta","Correcto",JOptionPane.WARNING_MESSAGE,null);
		in=2;
		}else{
                    
                    calif = "Incorrecto";
                    id = db.getId(preg);
                    db.updateProg(calif, id);
                    cont++;
                    JOptionPane.showMessageDialog(null,"Te has quedado sin intentos","Incorrecto",JOptionPane.WARNING_MESSAGE,null);
                    text.setText(null);
                    preg=db.getPregunta(cont,tabla.replaceAll("\\s",""));
                    jLabel2.setText(preg);
                    
                    if(num==cont){
                        sigfin1.setEnabled(false);
                        sigfin2.setEnabled(true);
                    }
            }
        }
		
	if(c!=cont){
            in=1;
	}
    }
    
    private void cambioPreg2(){
        MysqlC db = new MysqlC();
        int c=cont;
     
        resp = db.getRespuesta(cont,tabla.replaceAll("\\s",""));
        respuesta = text.getText().replaceAll("\\s","");
        if(respuesta.equals(resp)){
            JOptionPane.showMessageDialog(null,"Respuesta correcta","Correcto",JOptionPane.INFORMATION_MESSAGE,null);
            calif = "Correcto";
            id = db.getId(preg);
            db.updateProg(calif, id);
            this.dispose();
            JOptionPane.showMessageDialog(null,"Has finalizado el tema","Final",JOptionPane.INFORMATION_MESSAGE,null);
        }else{
		
            if(in==1){
                JOptionPane.showMessageDialog(null,"Respuesta incorrecta","Correcto",JOptionPane.WARNING_MESSAGE,null);
		in=2;
		}else{
                    JOptionPane.showMessageDialog(null,"Te has quedado si intentos","Icorrecto",JOptionPane.WARNING_MESSAGE,null);
                    calif = "Incorrecto";
                    id = db.getId(preg);
                    db.updateProg(calif, id);
                    this.dispose();
                    JOptionPane.showMessageDialog(null,"Has finalizado el tema","Final",JOptionPane.INFORMATION_MESSAGE,null);
            }
        }
		
	if(c!=cont){
            in=1;
	}
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fraccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelformula;
    private javax.swing.JButton potencia;
    private javax.swing.JButton raiz;
    private javax.swing.JButton sigfin1;
    private javax.swing.JButton sigfin2;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}

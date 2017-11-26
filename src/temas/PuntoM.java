package temas;
import Interfaces.Alumnos;
import Interfaces.MenuInicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import proyecto.MysqlC;

public class PuntoM extends javax.swing.JInternalFrame {
    int cont,id;
    int num = 0;
    int idtem=2;
    int x=1,c=0,v=1;
    public String nombre2;
    public String pregunta,preg,respuesta,resp,calif,preg2;
    public String formula;
        
    public String tabla = "punto_medio"; 
    
     public void getNombre(String nombre){
        this.nombre2=nombre;
    }
     
    public PuntoM() {
        initComponents();
        MysqlC db = new MysqlC();
        cont=Integer.parseInt(db.getid(idtem,tabla));
        num = db.contar(tabla);
        System.out.println(num);
        nombre2=Alumnos.setNombres();
        
        initComponents();
        for(int i=1;i<=num;i++){
            preg2=db.getPregunta(i,tabla);
            db.createProg(preg2, nombre2, idtem);
            System.out.println(i);
        }
                
        if(cont==1){
            preg=db.getPregunta(1,tabla);
            jLabel2.setText(preg);
            formula = db.getFormula(tabla);
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

        finalizar = new javax.swing.JButton();
        sigfin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        potencia = new javax.swing.JButton();
        fraccion = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        text = new javax.swing.JTextField();
        finalizar1 = new javax.swing.JButton();
        sigfin1 = new javax.swing.JButton();
        sigfin2 = new javax.swing.JButton();
        labelformula = new javax.swing.JLabel();

        finalizar.setText("Salir");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        sigfin.setText("Siguiente");
        sigfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigfinActionPerformed(evt);
            }
        });

        setTitle("Punto Medio");

        jLabel1.setText("Respuesta:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        potencia.setText("x²");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });

        fraccion.setText("x/y");
        fraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fraccionActionPerformed(evt);
            }
        });

        raiz.setText("√");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

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

        finalizar1.setText("Salir");
        finalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizar1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(finalizar1)
                                .addGap(76, 76, 76)
                                .addComponent(sigfin1)
                                .addGap(37, 37, 37)
                                .addComponent(sigfin2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(labelformula, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(raiz)
                            .addComponent(potencia)
                            .addComponent(fraccion))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(raiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(finalizar1)
                                .addComponent(sigfin1)
                                .addComponent(sigfin2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(fraccion))
                            .addComponent(labelformula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        text.setText(text.getText()+"²");
    }//GEN-LAST:event_potenciaActionPerformed

    private void fraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fraccionActionPerformed
        text.setText(text.getText()+"/");
    }//GEN-LAST:event_fraccionActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        text.setText(text.getText()+"√");
    }//GEN-LAST:event_raizActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        if(text.getText() == " "){
            finalizar1.setEnabled(false);
        }
        else{
            finalizar1.setEnabled(true);
        }
    }//GEN-LAST:event_textActionPerformed

    private void textKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyTyped

    }//GEN-LAST:event_textKeyTyped

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
      //  this.dispose();
    }//GEN-LAST:event_finalizarActionPerformed

    private void finalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_finalizar1ActionPerformed

    private void sigfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigfinActionPerformed
       // cambioPreg();
    }//GEN-LAST:event_sigfinActionPerformed

    private void sigfin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigfin1ActionPerformed
        cambioPreg();
        System.out.println(cont);
    }//GEN-LAST:event_sigfin1ActionPerformed

    private void sigfin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigfin2ActionPerformed
        cambioPreg2();
    }//GEN-LAST:event_sigfin2ActionPerformed

    private void Iniciar(){
        MysqlC db = new MysqlC();
        String preg = db.getPregunta(cont,tabla);
        jLabel1.setText(preg);
        cont++;
    }
    
    
    private void cambioPreg(){
        MysqlC db = new MysqlC();
        int c=cont;
        resp = db.getRespuesta(cont,tabla);
        respuesta = text.getText();
        if(respuesta.equals(resp)){
            JOptionPane.showMessageDialog(null,"Respuesta correcta","Correcto",JOptionPane.INFORMATION_MESSAGE,null);
            calif = "Correcto";
            id = db.getId(preg);
            db.updateProg(calif, id);
            cont++;
            text.setText(null);
            preg=db.getPregunta(cont,tabla);
            jLabel2.setText(preg);
            
            
            
           // calif = "Correcto";
            //db.Progpregunta(nombre2, preg, calif, idtem);
            
            if(num==cont){
                sigfin1.setEnabled(false);
                sigfin2.setEnabled(true);
            }
            
        }else{
		
            if(x==1){
                JOptionPane.showMessageDialog(null,"Respuesta incorrecta","Correcto",JOptionPane.WARNING_MESSAGE,null);
		x=2;
		}else{
                    calif = "Incorrecto";
                    id = db.getId(preg);
                    db.updateProg(calif, id);
                    cont++;
                    JOptionPane.showMessageDialog(null,"Te has quedado sin intentos","Incorrecto",JOptionPane.WARNING_MESSAGE,null);
                    text.setText(null);
                    preg=db.getPregunta(cont,tabla);
                    jLabel2.setText(preg);
                    
                    if(num==cont){
                        sigfin1.setEnabled(false);
                        sigfin2.setEnabled(true);
                    }
            }
        }
		
	if(c!=cont){
            x=1;
	}
    }
    
    private void cambioPreg2(){
        MysqlC db = new MysqlC();
        int c=cont;
     
        resp = db.getRespuesta(cont,tabla);
        respuesta = text.getText();
        if(respuesta.equals(resp)){
            JOptionPane.showMessageDialog(null,"Respuesta correcta","Correcto",JOptionPane.INFORMATION_MESSAGE,null);
            this.dispose();
            JOptionPane.showMessageDialog(null,"Has finalizado el tema","Final",JOptionPane.INFORMATION_MESSAGE,null);
        }else{
		
            if(x==1){
                JOptionPane.showMessageDialog(null,"Respuesta incorrecta","Correcto",JOptionPane.WARNING_MESSAGE,null);
		x=2;
		}else{
                    JOptionPane.showMessageDialog(null,"Te has quedado si intentos","Icorrecto",JOptionPane.WARNING_MESSAGE,null);
                    this.dispose();
                    JOptionPane.showMessageDialog(null,"Has finalizado el tema","Final",JOptionPane.INFORMATION_MESSAGE,null);
            }
        }
		
	if(c!=cont){
            x=1;
	}
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton finalizar;
    private javax.swing.JButton finalizar1;
    private javax.swing.JButton fraccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelformula;
    private javax.swing.JButton potencia;
    private javax.swing.JButton raiz;
    private javax.swing.JButton sigfin;
    private javax.swing.JButton sigfin1;
    private javax.swing.JButton sigfin2;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}


package Interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import proyecto.MysqlC;
import proyecto.fondo;


public class Alumnos extends javax.swing.JFrame {

    public static String nombre1;
    public static String tabla=null;
    public int id_tem=0,num_preg=0;
    private List<JMenuItem> items;
    int g=0;
    
    public Alumnos() {
        MenuInicio m = new MenuInicio();
        initComponents();
        Menu();
        jDesktopPane1.setBorder(new fondo());
        this.setLocationRelativeTo(null);
        this.setExtendedState(Alumnos.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        jMenu4.setText("Opciones");

        jMenuItem5.setText("Cerrar sesión");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Temas");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        MenuInicio mn = new MenuInicio();
        mn.setVisible(true);
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void validarProg(String tabla1,int id_tem,String nombre){
        MysqlC db = new MysqlC();
        int count=db.getCount1(tabla1);
        int count2=db.getCountP("progreso", id_tem,nombre);
        //System.out.println("Count: "+count+"\nCount2: "+count2);
        if(count!=count2){
            create();
        }
    }
    
    private void Menu(){
        MysqlC db = new MysqlC();
        g = db.contar("temas");
        items = new ArrayList<>();
        for(int i=1;i<=g;i++){
            String texto = db.getTemas(i);
            JMenuItem menuI = new JMenuItem(texto);
            jMenu2.add(menuI);
            items.add(menuI);
            
            menuI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                tabla=menuI.getText();
                id_tem=db.getIdTema(tabla);
                num_preg=db.contar(tabla.replaceAll("\\s",""));
                
                if(num_preg==0){
                    JOptionPane.showMessageDialog(null, "El tema aún no tiene preguntas","Advertencia",JOptionPane.WARNING_MESSAGE,null);
                }else{
                    /*System.out.println("Tabla: "+tabla.replace(" ",""));
                    System.out.println("item: "+menuI.getText());
                    System.out.println("id_tem: "+ id_tem);
                    System.out.println("nombre: "+nombre1);
                    System.out.println("Num preg: "+num_preg);*/
                    
                    Temas t = new Temas();
                    t.Tabla(tabla.replaceAll("\\s",""));
                    jDesktopPane1.add(t);
                    t.show();
                    validarProg(tabla.replaceAll("\\s",""),id_tem,nombre1);
                    
                }
            }
        });
            
        }
    }
    
    
    public void getNombres(String nombre){
        this.nombre1=nombre;
    }
    
    public static String setNombres(){
        return nombre1;
    }
    
    public static String setTabla(){
        //System.out.println("setTabla alumnos: "+tabla);
        return tabla;
    }
    
    private void create(){
        MysqlC db = new MysqlC();
        int num = db.contar(tabla.replaceAll("\\s",""));
        
        for(int i=1;i<=num;i++){
            String preg2=db.getPregunta(i,tabla.replaceAll("\\s",""));
            db.createProg(preg2, nombre1, id_tem);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}

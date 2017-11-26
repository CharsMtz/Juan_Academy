
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MysqlC {
    private static Connection Conexion;
    
    public String result = null;
    public String resul = null;
    public String result1 = null;
    public String result2 =  null;
    public int result3 = 0;
    public int result5=0;
    public int result6=0;
    public String result4 = null;
    public int id2 = 0;
    public String frmla = null;
    public String result7 = null;
    public int resultid=0;
    
    public void Connection(String user,String pass, String db_name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name,user,pass);
        } catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos","Base de datos",JOptionPane.ERROR_MESSAGE,null);
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null,ex);
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al conectar a la base de datos","Base de datos",JOptionPane.ERROR_MESSAGE,null);
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
        
    public void InsertUser(String tabla,String nombre, String contraseña, int edad, String tipo,String fecha_alta){
        try {
            String Query = "INSERT INTO " + tabla + " VALUES(NULL,"
                    + "\"" + nombre + "\", "
                    + "\"" + contraseña + "\", "
                    + "\"" + edad + "\", "
                    + "\"" + tipo + "\", "
                    + "\"" + fecha_alta + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Nueva cuenta creada :)","Registro",JOptionPane.INFORMATION_MESSAGE,null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear registro,\nel nombre de usuario ya existe","Registro",JOptionPane.ERROR_MESSAGE,null);
        }
    }
    
    public String Login(String tabla,String campo, String nombre){
        
        try{
            String Query = "SELECT contraseña FROM usuarios WHERE nombre=\""+nombre+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result = rs.getString("contraseña");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar","Inicio de sesión",JOptionPane.WARNING_MESSAGE,null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar","Inicio de sesión",JOptionPane.WARNING_MESSAGE,null);
        }
        
        return result;
    }
    
    public String Nombre(String tabla, String nombre){
        try{
            String Query = "SELECT nombre FROM usuarios WHERE nombre=\""+nombre+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                resul = rs.getString("nombre");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar","Inicio de sesión",JOptionPane.WARNING_MESSAGE,null);
        }
        
        return resul;
    }
    
    public String Tipo(String nombre){
        try{
            String Query = "SELECT tipo FROM usuarios WHERE nombre=\""+nombre+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result1 = rs.getString("tipo");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener tipo","Error",JOptionPane.ERROR_MESSAGE,null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar","Inicio de sesión",JOptionPane.WARNING_MESSAGE,null);
        }
        return result1;
    }
    
    public String getPregunta(int id,String tabla){
        try{
            String Query = "SELECT preguntas FROM "+tabla+" WHERE id = "+id;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result2 = rs.getString("preguntas");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener pregunta","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result2;
    }
    
   public int contar(String tabla){
        try{
            String Query = "SELECT COUNT(*) FROM "+tabla;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result3 = rs.getInt(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero de preguntas","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result3;
   } 
   
   public String getRespuesta(int id,String tabla){
       try{
            String Query = "SELECT respuestas FROM "+tabla+" where id="+id;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result4 = rs.getString(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la respuesta","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result4;
   }
   
   public String getid(int idtem,String tabla){
       try{
            String Query = "SELECT MAX(id) FROM "+tabla+" where id="+idtem;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result4 = rs.getString(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al maximo de preg","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result4;
   }
   
   
   public void Progpregunta(String nombre, String pregunta,String respuesta, int id_tema){
        try {
            String Query = "INSERT INTO progreso VALUES("
                    + "\"" + nombre + "\", "
                    + "\"" + pregunta + "\", "
                    + "\"" + respuesta + "\", "
                    + "\"" + id_tema + "\", "
                    + "null)";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            //JOptionPane.showMessageDialog(null,"Nueva cuenta creada :)","Registro",JOptionPane.INFORMATION_MESSAGE,null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al calificar pregunta","Error",JOptionPane.ERROR_MESSAGE,null);
        }
   }
   
   public void updateProg(String calif, int id){
       try{
           String Query = "UPDATE progreso SET respuesta=\""+calif+"\" WHERE progreso.id="+id;
           Statement st = Conexion.createStatement();
           st.executeUpdate(Query);;
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al crear update","Error",JOptionPane.ERROR_MESSAGE,null);
        }
   }
   
   public void createProg(String pregunta,String nombre,int id_tema){
       try {
            String Query = "INSERT INTO progreso VALUES(NULL,"
                    + "\"" + nombre + "\","
                    + "\"" + pregunta + "\","
                    + "\"Sin intentar\","
                    + id_tema + ", "
                    + "NULL)";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al calificar pregunta","Error",JOptionPane.ERROR_MESSAGE,null);
        }
   } 
   
   public int getId(String preg){
       try{
            String Query = "SELECT id FROM progreso where pregunta=\""+preg+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                id2 = rs.getInt(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener id de respuesta","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return id2;
   }
   public String getFormula(String tabla){
        try{
            String Query = "SELECT formula FROM "+tabla+" where id = 1";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                frmla = rs.getString("formula");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la formula","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return frmla;
   }
   
   public int getCount1(String tabla){
       try{
            String Query = "SELECT COUNT(*) FROM "+tabla;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result5 = rs.getInt(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero de preguntas","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result5;
   }
   
   public int getCountP(String tabla,int id_tema,String nombre){
       try{
            String Query = "SELECT COUNT(*) FROM "+tabla+" WHERE id_tema="+id_tema+" AND nombre=\""+nombre+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result6 = rs.getInt(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener el numero de preguntas 2","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result6;
   }
   
   public ResultSet MostrarProg(){
     ResultSet rs = null;
       try{
            String Query = "SELECT * FROM progreso";
            Statement st = Conexion.createStatement();
            rs = st.executeQuery(Query);
            
        }catch (SQLException ex) {
            Logger.getLogger(MysqlC.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al obtener el progreso","Error",JOptionPane.ERROR_MESSAGE,null);
        }  
     return rs;
   }
   
   public void Agtema(String tema){
        try {
            String Query = "CREATE TABLE "+tema+" ( `id` INT NOT NULL AUTO_INCREMENT , "
                    + "`preguntas` VARCHAR(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL , "
                    + "`respuestas` VARCHAR(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL , "
                    + "`formula` VARCHAR(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL , "
                    + "PRIMARY KEY (`id`)) ENGINE = InnoDB;";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "El tema ha sido agregado", "Agregar", JOptionPane.INFORMATION_MESSAGE, null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al agregar tema","Error",JOptionPane.ERROR_MESSAGE,null);
        }
   }  
   
   public String getTemas(int id){
       try{
            String Query = "SELECT tema FROM temas WHERE id_tema="+id;
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                result7 = rs.getString("tema");
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener temas","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return result7;
   }
   
   public int getIdTema(String tema){
       try{
            String Query = "SELECT id_tema FROM temas WHERE tema=\""+tema+"\"";
            Statement st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(Query);
            while(rs.next()){
                resultid = rs.getInt(1);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener id tema","Error",JOptionPane.ERROR_MESSAGE,null);
        }
        return resultid;
   }
   
   
}

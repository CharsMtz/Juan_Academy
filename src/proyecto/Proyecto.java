
package proyecto;

import Interfaces.MenuInicio;
import javax.swing.*;

public class Proyecto {

    
    public static void main(String[] args) {
        MysqlC db = new MysqlC();
        db.Connection("root", "", "testp");
        
        MenuInicio v = new MenuInicio();
        v.setVisible(true); 
        
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e){
            e.printStackTrace();
        }
        
       /* Colors c = new Colors();
        c.setVisible(true);*/
               
    }
    
}

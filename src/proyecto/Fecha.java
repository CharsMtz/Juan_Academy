
package proyecto;

import java.util.Calendar;

public class Fecha {
    Calendar fecha = Calendar.getInstance();
    
    public String fecha(){
        
        String dia = Integer.toString(fecha.get(Calendar.DATE));
        String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
        String año = Integer.toString(fecha.get(Calendar.YEAR));
        String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
        String minutos = Integer.toString(fecha.get(Calendar.MINUTE));
        String segundos = Integer.toString(fecha.get(Calendar.SECOND));
        
        String date = año+"-"+mes+"-"+dia+" "+hora+":"+minutos+":"+segundos;
        return date;
        
    }
}

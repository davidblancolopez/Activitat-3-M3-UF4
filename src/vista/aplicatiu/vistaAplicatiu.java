
package vista.aplicatiu;

import java.util.Scanner;


public class vistaAplicatiu {
   Scanner lector = new Scanner(System.in);
    
    public int mostrarMEnu(){
        int opcio;
        
        System.out.println("MENÚ: \n"
                + "1. Crear figura.\n"
                + "2. Veure les figures.\n"
                + "3. Modificar figura.\n");
        
        do{
        System.out.println("Quina opció vols?");
            if (lector.hasNext()) {
                opcio = 0;
            }
        opcio = lector.nextInt();
        }while(comprovarMenu1(opcio));
        
        return 0;
    }
    
    
    public boolean comprovarMenu1(int opcio){
        boolean comprovar = true;
        
        if (opcio < 0 && opcio > 3) {
            comprovar = false;
        }
        
        return comprovar;
    }
}

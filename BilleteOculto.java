
package tareabilleteoculto;

import java.util.Random;

public class BilleteOculto {
    public static void main(String[] args) {
        int fila = 8;
        int columna = 4;
        
        String[][] clase = new String[fila][columna];
        Random random = new Random();
        int fil = random.nextInt(fila);
        int colum = random.nextInt(columna);
        clase[fil][colum] = "€";
        
        System.out.println("Coordenadas del billete: ");
        System.out.println("X: " + fil + "\nY: " + colum);
    }
}

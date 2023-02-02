
package tema6.biblioteca;

public class LibroMain {
    
    public static void main(String[] args) {
        
        Libro n1 = new Libro("Don Quijote", "Miguel de Cervantes", 100, 50);
        Libro n2 = new Libro();
        Libro n3 = new Libro("Platero y yo", "Antonio Machado", 20, 19);
        
        
        n1.prestamo();
        n1.prestamo();
        n3.devolucion();
        n3.devolucion();
        n3.prestamo();
        
        System.out.println(n1.toString());
        System.out.println(n3.toString());
        
    }
}

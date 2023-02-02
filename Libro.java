

package tema6.biblioteca;


public class Libro {
    //Atributos
    private String titulo, autor;
    private int NELibro, NEPrestados;
    
    //Constructor por defecto
    public Libro() {}
    
    //Constructor con parámetros
    public Libro(String titulo, String autor, int NELibro, int NEPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.NELibro = NELibro;
        this.NEPrestados = NEPrestados;
    }
    
    //Métodos getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNELibro() {
        return NELibro;
    }
    public int getNEPrestados() {
        return NEPrestados;
    }
    
    //Métodos setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNELibro(int NELibro) {
        this.NELibro = NELibro;
    }
    public void setNEPrestados(int NEPrestados) {
        this.NEPrestados = NEPrestados;
    }
    
    //Metodo préstamo
    public boolean prestamo(){
        boolean res;
        if(NELibro-NEPrestados>0){ //SI QUEDAN LIBROS, SUMAS 1.
            NEPrestados+=1;
            NELibro-=1;
            res= true;
        }else{
            System.out.println("No quedan libros disponibles.");
            res=false;
        }
        return res;
    }
    //Método devolución
    public boolean devolucion(){
        boolean res;
        if (prestamo()==true) { //Si ese libro es prestado, aumenta 1 libro disponible 
            NEPrestados-=1;     //y decrementa libro prestado.
            NELibro+=1;
            res=true;
        } else {
            System.out.println("Este libro no se puede devolver. No ha sido prestado.");
            res=false;
        }
        return res;
    }
}

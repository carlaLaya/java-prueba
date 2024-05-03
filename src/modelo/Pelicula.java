package modelo;

public class Pelicula extends Titulo {
    //titulo le extiendde todo lo que tiene a pelicula-herencia
    private String director;

    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
     }
    
}

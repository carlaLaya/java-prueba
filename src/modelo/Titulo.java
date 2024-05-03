package modelo;

public class Titulo {
    
private String nombre;
private int fechaDeLanzamiento;
private int tiempoDeDuracionEnMinutos;

//metodos para acceder a los atributos de las clases
// Getters ..obtiene el nombre atributo
public String getNombre() {
    return nombre;
}

public int getFechaDeLanzamiento() {
    return fechaDeLanzamiento;
}

public int getTiempoDeDuracionEnMinutos() {
    return tiempoDeDuracionEnMinutos;
}

// Setters obtengo el valor de in atributo, setao este nombre para ese atributo
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
    this.fechaDeLanzamiento = fechaDeLanzamiento;
}

public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
    this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
}


//declaro un metodo cualwuier persona puede acceder al metodo especifico
public void muestraFichaTecnica(){
    System.out.println("Ficha tecnica de la pelicula");
    System.out.println("Nombre: " + nombre);
    System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
    System.out.println("Tiempo de duracion en minutos: " + tiempoDeDuracionEnMinutos + "minutos");
}
}

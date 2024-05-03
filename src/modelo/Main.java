package modelo;


public class Main {

    public static void main(String[] args) {
        //punto de ejecucion que me permite
        //ejecutar el programa
        Titulo matrix = new Titulo();
        
        matrix.setNombre("Matrix");
        matrix.setTiempoDeDuracionEnMinutos(120);
        matrix.setFechaDeLanzamiento(1999);   

        matrix.muestraFichaTecnica();

        // Aquí necesitas definir la clase Serie si planeas usarla
        Serie Friends = new Serie();

        Friends.setNombre ("Friends");  
        Friends.setFechaDeLanzamiento(1999);
        Friends.setTiempoDeDuracionEnMinutos(30);

        Friends.muestraFichaTecnica();
    }
        
    }

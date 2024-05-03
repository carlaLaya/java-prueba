package modelo;


public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosPorEpisodio;

    public int getTiempoDeDuracionEnMinutos() {
        return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    
    public void muestraFichaTecnica(){
        System.out.println("Ficha tecnica de la serie");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Fecha de lanzamiento: " + getFechaDeLanzamiento());
        System.out.println("Tiempo de duracion en minutos: " + getTiempoDeDuracionEnMinutos() + "minutos");
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episodios: " + episodiosPorTemporada);
    }
}

    
    


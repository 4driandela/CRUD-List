import java.util.ArrayList;

public class Galeria {

    private ArrayList<Pelicula> cartelera = new ArrayList<Pelicula>();

    public ArrayList<Pelicula> getCartelera() {
        return cartelera;
    }

    public void setCartelera(ArrayList<Pelicula> cartelera) {
        this.cartelera = cartelera;
    }

    @Override
    public String toString() {
        return "Galería{" +
                "cartelera=" + cartelera +
                '}';
    }
    public void addPelicula(Pelicula pelicula){
        cartelera.add(pelicula);
    }
    public void removePelicula(int posicion){
        cartelera.remove(posicion);
    }
    public int longitudLista(){
        int longitud;

        longitud = cartelera.size();
        return longitud;
    }
    public void mostrarArrayList(){
        for(Pelicula item: cartelera){
            System.out.println("Título: " + item.getNombre() + "; Director: " + item.getDirector() + "; Género: " + item.getGénero());
        }

    }

}



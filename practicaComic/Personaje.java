public class Personaje {
    private final String nombre;
    private final String especie;

    public Personaje(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }
}

package practicaHarry;

public class Character {
    private final int id;
    private final String name;
    private final String species;
    private final String house;
    private final String genre;
    private final String boggart;
    private final String patronus;

    public Character(int id, String name, String species, String house, String genre, String boggart, String patronus) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.house = house;
        this.genre = genre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String showMessage() {
        return "ID: " + id + "\nName: " + name + "\nSpecies: " + species + "\nHouse: " + house + "\nGenre: " + genre + "\nBoggart: " + boggart + "\nPatronus: " + patronus;
    }
}

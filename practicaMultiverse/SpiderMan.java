package practicaMultiverse;

public class SpiderMan {
    private final String fullName;
    private final String genre;
    private final String universe;
    private final String occupation;

    public SpiderMan(String fullName, String genre, String universe, String occupation) {
        this.fullName = fullName;
        this.genre = genre;
        this.universe = universe;
        this.occupation = occupation;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGenre() {
        return genre;
    }

    public String getUniverse() {
        return universe;
    }

    public String getOccupation() {
        return occupation;
    }

    public String showSpiderMan() {
        return "Full name: " + fullName + "\nGenre: " + genre + "\nUniverse: " + universe + "\nOccupation: " + occupation;
    }
}

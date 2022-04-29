package practicaMona;

public class DinoToCat extends Mona {
    private final String costume;

    public DinoToCat(int id, String name, String skinColor, String costume) {
        super(id, name, skinColor);
        this.costume = costume;
    }

    @Override
    public void activity() {
        System.out.println("Me gusta aplastar y destruir cosas.");
    }

    @Override
    public String showMessage() {
        return "Costume: " + costume;
    }
}

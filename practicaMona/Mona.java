package practicaMona;

public abstract class Mona {
    private final int id;
    private final String name;
    private final String skinColor;

    public Mona(int id, String name, String skinColor) {
        this.id = id;
        this.name = name;
        this.skinColor = skinColor;
    }

    public abstract void activity();

    public void showGreeting() {
        System.out.println("ID: " + id + "\nHola soy " + name + " color " + skinColor);
    }

    public abstract String showMessage();
}

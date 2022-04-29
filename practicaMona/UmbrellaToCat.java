package practicaMona;

public class UmbrellaToCat extends Mona {
    private final String accessory;
    private final String accessoryColor;

    public UmbrellaToCat(int id, String name, String skinColor, String accessory, String accessoryColor) {
        super(id, name, skinColor);
        this.accessory = accessory;
        this.accessoryColor = accessoryColor;
    }

    @Override
    public void activity() {
        System.out.println("Me divierto jugando con mi sombrilla.");
    }

    @Override
    public String showMessage() {
        return "Accessory: " + accessory + "\nAccessory color: " + accessoryColor;
    }
}

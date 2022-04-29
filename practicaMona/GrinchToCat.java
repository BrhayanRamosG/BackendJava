package practicaMona;

public class GrinchToCat extends Mona {
    private final String custome;
    private final String customeColor;
    private final String capColor;
    private final String accessory;
    private final String accessoryColor;

    public GrinchToCat(int id, String name, String skinColor, String custome, String customeColor, String capColor, String accessory, String accessoryColor) {
        super(id, name, skinColor);
        this.custome = custome;
        this.customeColor = customeColor;
        this.capColor = capColor;
        this.accessory = accessory;
        this.accessoryColor = accessoryColor;
    }

    @Override
    public void activity() {
        System.out.println("Cada navidad me gusta arruinar la navidad de las personas jejeje.");
    }

    @Override
    public String showMessage() {
        return "Custome: " + custome + "\nCustome color: " + customeColor + "\nCap color: " + capColor + "\nAccessory: " + accessory + "\nAccessory color: " + accessoryColor;
    }
}

package practicaMona;

public class SentryToCat extends Mona {

    private final int HoseSize;
    private final String costumeColor;
    private final String hoseColor;
    private final String helmetColor;

    public SentryToCat(int id, String name, String skinColor, int hoseSize, String costumeColor, String hoseColor, String helmetColor) {
        super(id, name, skinColor);
        HoseSize = hoseSize;
        this.costumeColor = costumeColor;
        this.hoseColor = hoseColor;
        this.helmetColor = helmetColor;
    }

    @Override
    public void activity() {
        System.out.println("Estoy siempre alerta, apago incendios y salvo vidas.");
    }

    @Override
    public String showMessage() {
        return "Hose size: " + HoseSize + "\nCostume color: " + costumeColor + "\nHose color: " + hoseColor + "\nHelmet color: " + helmetColor;
    }

}

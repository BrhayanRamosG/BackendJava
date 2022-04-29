package practicaMona;

public class FemaleCoderToCat extends Mona {
    private final String hairColor;
    private final String shoesColor;
    private final String tool;

    public FemaleCoderToCat(int id, String name, String skinColor, String hairColor, String shoesColor, String tool) {
        super(id, name, skinColor);
        this.hairColor = hairColor;
        this.shoesColor = shoesColor;
        this.tool = tool;
    }

    @Override
    public void activity() {
        System.out.println("Me gusta beber café mientras escribo código en mi computadora.");
    }

    @Override
    public String showMessage() {
        return "Hair color: " + hairColor + "\nShoes color: " + shoesColor + "\nTool: " + tool;
    }
}

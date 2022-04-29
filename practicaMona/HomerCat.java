package practicaMona;

public class HomerCat extends Mona {
    private final String shirtColor;
    private final String pantsColor;
    private final String shoesColor;

    public HomerCat(int id, String name, String skinColor, String shirtColor, String pantsColor, String shoesColor) {
        super(id, name, skinColor);
        this.shirtColor = shirtColor;
        this.pantsColor = pantsColor;
        this.shoesColor = shoesColor;
    }

    @Override
    public void activity() {
        System.out.println("Me gusta beber mucha cerveza.");
    }

    @Override
    public String showMessage() {
        return "Shirt color: " + shirtColor + "\nPants color: " + pantsColor + "\nShoes color: " + shoesColor;
    }
}

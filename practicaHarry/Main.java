package practicaHarry;

public class Main {

    public static void main(String[] args) {
        initCharacter();
    }

    public static void initCharacter() {
        Character harry, ronald, hermione, tom, albus;
        harry = new Character(
                1,
                "Harry James Potter",
                "Humano",
                "Gryffindor",
                "Masculino",
                "Dementor",
                "Ciervo"
        );
        ronald = new Character(
                2,
                "Ronald Bilius Weasley",
                "Humano",
                "Gryffindor",
                "Masculino",
                "Aragog",
                "Jack Russell Terrier"
        );
        hermione = new Character(
                3,
                "Hermione Jean Granger",
                "Humano",
                "Gryffindor",
                "Femenino",
                "Fracasar",
                "Nutria"
        );
        tom = new Character(
                4,
                "Tom Marvolo Riddle",
                "Humano",
                "Slytherin",
                "Masculino",
                "Su propio cadáver",
                "Ninguno"
        );
        albus = new Character(
                5,
                "Albus Percival Wulfric Brian Dumbledore",
                "Humano",
                "Gryffindor",
                "Masculino",
                "El cadáver de su hermana, Ariana.",
                "Fénix"
        );
        printCharacter(harry);
        printCharacter(ronald);
        printCharacter(hermione);
        printCharacter(tom);
        printCharacter(albus);
    }

    public static void printCharacter(Character chr) {
        System.out.println(chr.showMessage() + "\n");
    }

}

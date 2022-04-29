package practicaMona;

public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        UmbrellaToCat utcat = new UmbrellaToCat(
                140,
                "Umbrella to cat",
                "Negro",
                "Sombrilla",
                "Morado"
        );
        SentryToCat stcat = new SentryToCat(
                141,
                "Sentry to cat",
                "Negro",
                7,
                "Naranja y Gris",
                "Amarillo, negro y café",
                "Naranja y negro"
        );
        DinoToCat dtcat = new DinoToCat(
                128,
                "Dino to cat",
                "Verde",
                "Dinosaurio"
        );
        GrinchToCat gtcat = new GrinchToCat(
                109,
                "Grinch to cat",
                "Verde",
                "Ropa de navidad",
                "Rojo y blanco",
                "Rojo y blanco",
                "Costal de navidad",
                "Café"
        );
        FemaleCoderToCat ftcat = new FemaleCoderToCat(
                101,
                "Female coder to cat",
                "Negro",
                "Café",
                "Rojo",
                "Computadora"
        );
        HomerCat hcat = new HomerCat(
                80,
                "Homer cat",
                "Amarillo",
                "Blanco",
                "Azul",
                "Negro"
        );
        //Imprimnir información de objetos
        printCharacter(utcat);
        printCharacter(stcat);
        printCharacter(dtcat);
        printCharacter(gtcat);
        printCharacter(ftcat);
        printCharacter(hcat);
    }

    public static void printCharacter(Mona object) {
        object.showGreeting();
        System.out.println("-----Atributos-----");
        System.out.println(object.showMessage());
        System.out.println("-----Actividad-----");
        object.activity();
        System.out.println();
    }
}

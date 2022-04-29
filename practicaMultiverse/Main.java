package practicaMultiverse;

public class Main {
    private static final PeterParker peter = new PeterParker(
            "Peter Benjamin Parker",
            "Masculino",
            "Tierra-616",
            "Aventurero, Científico"
    );
    private static final MilesGonzalo miles = new MilesGonzalo(
            "Miles Gonzalo Morales",
            "Masculino",
            "Tierra-1610",
            "Estudiante de ciencias, Aventurero"
    );
    private static final GwendolyneMaxine gwendolyne = new GwendolyneMaxine(
            "Gwendolyne Maxine Stacy",
            "Femenino",
            "Tierra-65",
            "Estudiante, Baterista, Heroína"
    );

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        printCharacter(peter);
        printAbilitiesPeter();
        System.out.println();
        printCharacter(miles);
        printAbilitiesMiles();
        System.out.println();
        printCharacter(gwendolyne);
        printAbilitiesGwendolyne();
    }

    public static void printCharacter(SpiderMan object) {
        System.out.println("-----Information-----");
        System.out.println(object.showSpiderMan());
    }

    public static void printAbilitiesPeter() {
        System.out.println("-----Abilities " + peter.getFullName() + "-----");
        peter.resistenciaSobrehumana();
        peter.factorDeCuración();
        peter.habilidadParaSaltar();
        peter.velocidadSobrehumana();
    }

    public static void printAbilitiesMiles() {
        System.out.println("-----Abilities " + miles.getFullName() + "-----");
        miles.durabilidadSobrehumana();
        miles.camuflajeAracnido();
        miles.explosionDeEnergia();
        miles.rayoVenenoso();
    }

    public static void printAbilitiesGwendolyne() {
        System.out.println("-----Abilities " + gwendolyne.getFullName() + "-----");
        gwendolyne.velocidadSobrehumana();
        gwendolyne.sentidoAracnido();
        gwendolyne.reflejosSobrehumanos();
        gwendolyne.trepaMuros();
    }

}

package practicaMultiverse;

public class PeterParker extends SpiderMan implements PeterParkerHabilidades {

    public PeterParker(String fullName, String genre, String universe, String occupation) {
        super(fullName, genre, universe, occupation);
    }

    @Override
    public void resistenciaSobrehumana() {
        System.out.println("---Resistencia sobrehumana");
        System.out.println("Le permite mantener la respiración por un tiempo prolongado, incluso por encima de los 20 minutos.");
    }

    @Override
    public void factorDeCuración() {
        System.out.println("---Factor de curación");
        System.out.println("Puede curar heridas en horas o días lo que a una persona normal le tomaría semanas.");
    }

    @Override
    public void velocidadSobrehumana() {
        System.out.println("---Velocidad sobrehumana");
        System.out.println("Su factor de velocidad y reflejos son varias decenas de veces más rápidos que cualquier persona en perfecta condiciones físicas.");
    }

    @Override
    public void habilidadParaSaltar() {
        System.out.println("---Habilidad para saltar");
        System.out.println("Realiza saltos extraordinarios y de gran velocidad pudiendo cubrir 100 metros en un salto largo y 30 metros en altura.");
    }
}

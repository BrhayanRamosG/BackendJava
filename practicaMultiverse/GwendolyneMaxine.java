package practicaMultiverse;

public class GwendolyneMaxine extends SpiderMan implements GwendolyneStacyHabilidades {

    public GwendolyneMaxine(String fullName, String genre, String universe, String occupation) {
        super(fullName, genre, universe, occupation);
    }

    @Override
    public void trepaMuros() {
        System.out.println("---Trepa muros");
        System.out.println("Puede controlar mentalmente el flujo de atracción interatómica (electrostática) entre el límite molecular de las superficies.");
    }

    @Override
    public void reflejosSobrehumanos() {
        System.out.println("---Reflejos sobrehumanos");
        System.out.println("Le permiten esquivar casi cualquier objeto que viaje a grandes velocidades.");
    }

    @Override
    public void sentidoAracnido() {
        System.out.println("---Sentido arácnido");
        System.out.println("Posee un sentido extrasensorial o sentido arácnido que le avisa de los potenciales peligros inmediatos con una sensación de hormigueo en la parte posterior de la cabeza.");
    }

    @Override
    public void velocidadSobrehumana() {
        System.out.println("---Velocidad sobrehumana");
        System.out.println("Su factor de velocidad y reflejos son varias decenas de veces más rápidos que cualquier ser humano en perfectas condiciones físicas.");
    }
}

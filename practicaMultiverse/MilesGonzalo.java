package practicaMultiverse;

public class MilesGonzalo extends SpiderMan implements MilesMoralesHabilidades {

    public MilesGonzalo(String fullName, String genre, String universe, String occupation) {
        super(fullName, genre, universe, occupation);
    }

    @Override
    public void durabilidadSobrehumana() {
        System.out.println("---Durabilidad sobrehumana");
        System.out.println("Permite resistir ataques y daños físicos que matarían a cualquier humano normal.");
    }

    @Override
    public void rayoVenenoso() {
        System.out.println("---Rayo venenoso");
        System.out.println("Posee una enorme cantidad de bio-energía que ha aprendido a canalizar y descargar para paralizar temporalmente a sus enemigos con tal solo tocarlos.");
    }

    @Override
    public void camuflajeAracnido() {
        System.out.println("---Camuflaje arácnido");
        System.out.println("Puede mezclarse con su entorno, lo que le permite acercarse sigilosamente a sus enemigos o, en algunos casos, huir de ellos.");
    }

    @Override
    public void explosionDeEnergia() {
        System.out.println("---Explosion de energía");
        System.out.println("En momentos de estrés, puede generar una fuerte explosión de energía capaz de derribar a quien este a su alrededor.");
    }
}


public class Main {

    public static void main(String[] args) {
        Comic comic = new Comic("Bob Esponja");
        Thread hilo = new Thread(comic);
        hilo.start();
    }
}

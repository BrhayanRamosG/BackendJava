
public class Comic implements accionesComic, Runnable {
    private final Screen screen = new Screen();
    private final Personaje bob, calamardo, donCangrejo, patricio, arenita;

    public Comic(String nombreComic) {
        screen.setTitle("Comic " + nombreComic);
        screen.setSize(900, 480);
        screen.setResizable(false);
        screen.setVisible(true);
        bob = new Personaje(
                "Bob Esponja",
                "Esponja"
        );
        calamardo = new Personaje(
                "Calamardo",
                "Calamar"
        );
        donCangrejo = new Personaje(
                "Don Cangrejo",
                "Cangrejo"
        );
        patricio = new Personaje(
                "Patricio",
                "Estrella de mar"
        );
        arenita = new Personaje(
                "Arenita",
                "Ardilla"
        );
    }

    @Override
    public void run() {
        try {
            mostrarHistoria();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addMensaje(String msg, int seconds) throws InterruptedException {
        screen.out(msg + "\n", "Helvetica", 25, Colors.BLACK);
        Thread.sleep(seconds * 1000L);
    }

    @Override
    public void addPersonaje(Personaje personaje) {
        screen.out(personaje.getNombre() + ": ", "Helvetica", 28, Colors.RED);
    }

    public void mostrarHistoria() throws InterruptedException {
        addPersonaje(calamardo);
        addMensaje("This place is a ghost town!", 1);
        addMensaje("Where is everybody?", 3);
        addPersonaje(bob);
        addMensaje("That's easy, squidward!", 2);
        addMensaje("They're all at the comic book store for", 2);
        addMensaje("Everybody loves no-charge funnybook day!", 3);
        addPersonaje(calamardo);
        addMensaje("Not me", 2);
        addMensaje("What is it?", 3);
        addPersonaje(bob);
        addMensaje("Why, it's the day all the graphic literature shops provide gratis samples of their wares in a pathetic effort to bolster an industry which has spent the last two decades in a death spiral brought on by a lethal interaction between the lack of variety and a monopolistic distribution system!", 20);
        addPersonaje(calamardo);
        addMensaje("What the heck does that mean?", 3);
        addPersonaje(bob);
        addMensaje("It means they're giving away free comic books!", 2);
        addPersonaje(donCangrejo);
        addMensaje("FREE?!", 2);
        addMensaje("Did you see free?!", 2);
        addMensaje("Well, What are doing standing around here!", 3);
        addPersonaje(calamardo);
        addMensaje("APPARENTLY, WE'RE MINING", 2);
        addPersonaje(donCangrejo);
        addMensaje("Not anymore, we're not!", 2);
        addMensaje("The krusty krab is officially closed for the day", 3);
        addPersonaje(calamardo);
        addMensaje("Good! then i'll just...", 2);
        addPersonaje(donCangrejo);
        addMensaje("No ye won't!", 2);
        addMensaje("We're all going to the comic book shop fer free comics!", 2);
        addMensaje("And as long as yer still on the clock", 2);
        addMensaje("Any free comics you get...", 2);
        addPersonaje(bob);
        addMensaje("That sounds great, Mr. Krabs", 2);
        addMensaje("Sharing and trading are an essential part of the comic book experience!", 2);
        addPersonaje(donCangrejo);
        addMensaje("So is sellin' 'em later on", 4);
        addMensaje("And if I get 'em fer nuthin' in the first place", 4);
        addMensaje("That's an infinite percent markup", 3);
        addMensaje("Arf! Arf! Arf!", 2);
        addPersonaje(calamardo);
        addMensaje("Mr Krabs!!", 2);
        addPersonaje(patricio);
        addMensaje("Hey, SpongeBob, what's up?", 4);
        addPersonaje(bob);
        addMensaje("We're gong for free comics", 3);
        addPersonaje(calamardo);
        addMensaje("Under protest!", 3);
        addPersonaje(donCangrejo);
        addMensaje("Come on Patrick!", 2);
        addMensaje("I can see your free comics, too!", 4);
        addMensaje("The more the merrier", 4);
        addMensaje("And profitabler!", 2);
        addPersonaje(bob);
        addMensaje("Hey, Sandy!", 2);
        addMensaje("Bet I can beat you to the comic book store!", 2);
        addPersonaje(arenita);
        addMensaje("In a pig's eye you can!", 2);
        addMensaje("Ain't nobody likes free comics more than me", 3);
        addPersonaje(bob);
        addMensaje("That's two!", 3);
        addPersonaje(donCangrejo);
        addMensaje("Good work, lad!", 2);
    }
}

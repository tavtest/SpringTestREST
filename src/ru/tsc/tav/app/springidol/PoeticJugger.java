package ru.tsc.tav.app.springidol;

public class PoeticJugger extends Juggler {
    private Poem poem;

    public PoeticJugger (Poem p)
    {
        super();
        this.poem = p;
    }

    public PoeticJugger (int beanBags, Poem p)
    {
        super(beanBags);
        this.poem = p;
    }

    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting...");
        poem.recite();
    }
}

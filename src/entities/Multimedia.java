package entities;

public abstract class Multimedia {
    //    attributi
    protected String title;

    //    costruttore
    protected Multimedia(String title) {
        this.title = title;
    }

    //    metodi
    private void play() {
        System.out.println(this.title);
    }

    private void show() {
        System.out.println(this.title);
    }
}

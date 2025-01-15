package entities;

import interfaces.Audible;

public class Audio extends Multimedia implements Audible {
    private int duration;
    private int volume;

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 5;
    }

    public void play() {
        System.out.println(this.title.repeat(this.duration));
        System.out.println("Volume: " + "!".repeat(volume));
    }

    @Override
    public void increaseVolume() {
        if (volume < 10) {
            volume++;
        } else {
            System.out.println("Volume is already at maximum level");
        }
    }

    @Override
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume is already at minimum level");
        }
    }
}

package entities;

import interfaces.Audible;
import interfaces.Visible;

public class Video extends Multimedia implements Visible, Audible {
    private int brightness;
    private int duration;
    private int volume;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
        this.brightness = 5;
        this.volume = 5;
    }

    public void play() {
        System.out.println(this.title.repeat(this.duration));
        System.out.println("Volume: " + "!".repeat(volume));
        System.out.println("Brightness: " + "*".repeat(brightness));
    }

    @Override
    public void increaseBrightness() {
        if (brightness < 10) {
            brightness++;
        } else {
            System.out.println("Brightness is already at maximum level");
        }
    }

    @Override
    public void decreaseBrightness() {
        if (brightness > 0) {
            brightness--;
        } else {
            System.out.println("Brightness is already at minimum level");
        }
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

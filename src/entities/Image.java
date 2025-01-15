package entities;

import interfaces.Visible;

public class Image extends Multimedia implements Visible {
    private int brightness;

    public Image(String title) {
        super(title);
        this.brightness = 5;
    }

    public void show() {
        System.out.println(this.title);
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
}

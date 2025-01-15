import entities.Audio;
import entities.Image;
import entities.Multimedia;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Audio audio1 = new Audio("Song", 3);
        Audio audio2 = new Audio("Melody", 5);
        Video video1 = new Video("Videoclip", 6);
        Image image1 = new Image("Photo");
        Image image2 = new Image("Picture");

        Multimedia[] multimedia = {audio1, audio2, video1, image1, image2};

        player(multimedia);

    }

    public static void player(Multimedia[] multimedia) {
        int chosenFile;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a multimedia to play (write a number from 1 to 5, or 0 to close the player):");
            chosenFile = scanner.nextInt();
            if (chosenFile != 0 && multimedia[chosenFile - 1] instanceof Image) {
                Image currentFile = (Image) multimedia[chosenFile - 1];
                currentFile.show();

            } else if (chosenFile != 0 && multimedia[chosenFile - 1] instanceof Audio) {
                Audio currentFile = (Audio) multimedia[chosenFile - 1];
                currentFile.play();
            } else if (chosenFile != 0 && multimedia[chosenFile - 1] instanceof Video) {
                Video currentFile = (Video) multimedia[chosenFile - 1];
                currentFile.play();
            } else {
                System.out.println("Player closed");
            }
        }
        while (chosenFile != 0);
    }
}

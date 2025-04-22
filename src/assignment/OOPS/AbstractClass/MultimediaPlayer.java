package assignment.OOPS.AbstractClass;

public class MultimediaPlayer {
    public static void main(String[] args) {
        System.out.println("AudioPlayer : ");
        AudioPlayer audioPlayer = new AudioPlayer("MP3", "Jai Krishna" , "Gulshan Kumar");
        audioPlayer.play();
        audioPlayer.displayDetails();
        System.out.println();

        System.out.println("VideoPlayer");
        VideoPlayer videoPlayer = new VideoPlayer("VLC player", "Hare krishna" , 2.00);
        videoPlayer.play();
        videoPlayer.displayDetails();
        System.out.println();

        System.out.println("Image Display");
        ImageDisplay imageDisplay = new ImageDisplay("JPEG", "Krishan" , 1024.0);
        imageDisplay.displayImage();
        imageDisplay.displayDetails();
    }
}

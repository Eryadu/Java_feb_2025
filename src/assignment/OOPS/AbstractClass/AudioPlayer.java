package assignment.OOPS.AbstractClass;

import java.net.Authenticator;

public class AudioPlayer extends MediaDevice {
    String songName;
    String artistName;

    public AudioPlayer(String name , String songName, String artistName) {
        super.name = name;
        this.songName = songName;
        this.artistName = artistName;
    }

    void play(){
        System.out.println("Play Audio Songs");
    }

    @Override
    void displayDetails() {
        System.out.println("Audio Player name : " + name);
        System.out.println("Song Name : " + songName);
        System.out.println("Artist Name : " + artistName);
    }
}

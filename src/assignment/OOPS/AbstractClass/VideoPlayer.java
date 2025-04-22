package assignment.OOPS.AbstractClass;

public class VideoPlayer extends MediaDevice{

    String videoTitle;
    double videoDuration;

    public VideoPlayer(String name , String videoTitle, double videoDuration) {
        super.name = name;
        this.videoTitle = videoTitle;
        this.videoDuration = videoDuration;
    }

    void play(){
        System.out.println("Play Video Songs");
    }
    @Override
    void displayDetails() {
        System.out.println("Name of Video player : " + name);
        System.out.println("Video title is : " + videoTitle);
        System.out.println("Video Duration is  : " + videoDuration);
    }
}

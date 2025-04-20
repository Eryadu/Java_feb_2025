package practice.solidPrinciple.LSP;

public class Instagram extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String users) {
 // not applicable , doesn't follow Liskov principle
    }
}

package practice.solidPrinciple.LSP;

public class Whatsapp extends SocialMedia{
    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) { // Whatsapp is not substitute of SocialMedia,not support Liskov Principle
      // not applicable
    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String users) {

    }
}

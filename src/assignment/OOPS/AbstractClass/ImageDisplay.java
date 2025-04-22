package assignment.OOPS.AbstractClass;

public class ImageDisplay extends MediaDevice{

    String imageName;
    double imageResolution;

    public ImageDisplay(String name ,String imageName, double imageResolution) {
       super.name = name;
        this.imageName = imageName;
        this.imageResolution = imageResolution;
    }

    void displayImage(){
        System.out.println("Image type : " + name);
    }
    @Override
    void displayDetails() {
        System.out.println("Image name : " + imageName);
        System.out.println("Image Resolution : " + imageResolution);
    }
}

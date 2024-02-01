/*
 * 
 * 
 * Polymorphism - is a feature that allows one interface to be used for a general class of actions.


Method Overloading:

In the MultimediaPlayer class, I added an overloaded displayInfo method with a different parameter (volume).
In the SmartTV class, I added an overloaded displayInfo method with a different parameter (is4K).

Method Overriding:

Both MultimediaPlayer and SmartTV classes override the abstract displayInfo method 
from the MultimediaDevice abstract class.

Dynamic Polymorphism:

In the PolymorphismExample class, the playMultimedia method demonstrates dynamic polymorphism 
by accepting a MultimediaDevice parameter. When called with instances of MultimediaPlayer and SmartTV, 
it invokes the overridden displayInfo method based on the actual type of the object at runtime.
 */


//Interface for multimedia features
interface MultimediaFeatures {
 void play();

 void stop();
}

//Abstract class representing a multimedia device
abstract class MultimediaDevice {
 String brand;

 MultimediaDevice(String brand) {
     this.brand = brand;
 }

 // Abstract method for displaying device information
 abstract void displayInfo();
}

//Class representing a multimedia player, implementing the MultimediaFeatures interface
class MultimediaPlayer extends MultimediaDevice implements MultimediaFeatures {
 MultimediaPlayer(String brand) {
     super(brand);
 }

 // Interface method implementation for playing
 public void play() {
     System.out.println("Playing multimedia on " + brand + " player");
 }

 // Interface method implementation for stopping
 public void stop() {
     System.out.println("Stopping multimedia on " + brand + " player");
 }

 // Display information method
 void displayInfo() {
     System.out.println("Multimedia Player - Brand: " + brand);
 }

 // Method overloading for displaying additional information
 void displayInfo(int volume) {
     System.out.println("Volume: " + volume);
 }
}

//Class representing a smart TV, extending MultimediaDevice and implementing MultimediaFeatures
class SmartTV extends MultimediaDevice implements MultimediaFeatures {
 int screenSize;

 SmartTV(String brand, int screenSize) {
     super(brand);
     this.screenSize = screenSize;
 }

 // Interface method implementation for playing
 public void play() {
     System.out.println("Streaming content on " + brand + " Smart TV");
 }

 // Interface method implementation for stopping
 public void stop() {
     System.out.println("Stopping content on " + brand + " Smart TV");
 }

 // Display information method overriding the abstract method
 void displayInfo() {
     System.out.println("Smart TV - Brand: " + brand + ", Screen Size: " + screenSize + " inches");
 }

 // Method overloading for displaying additional information
 void displayInfo(boolean is4K) {
     System.out.println("Is 4K: " + is4K);
 }
}

//Main class for demonstration
public class polymorphism {
 public static void main(String[] args) {
     // Polymorphism through method overloading
     displayInformation("Generic Device");
     displayInformation("Samsung Smart TV", 65);

     // Polymorphism through method overriding and dynamic polymorphism
     MultimediaDevice player = new MultimediaPlayer("Sony");
     MultimediaDevice tv = new SmartTV("LG", 55);

     playMultimedia(player);
     playMultimedia(tv);
 }

 // Method overloading for displaying device information
 static void displayInformation(String device) {
     System.out.println("Device Information: " + device);
 }

 static void displayInformation(String device, int screenSize) {
     System.out.println("Device Information: " + device + ", Screen Size: " + screenSize + " inches");
 }

 // Dynamic polymorphism through method overriding
 static void playMultimedia(MultimediaDevice device) {
     device.displayInfo();
     if (device instanceof MultimediaFeatures) {
         MultimediaFeatures features = (MultimediaFeatures) device;
         features.play();
         features.stop();
     }
     System.out.println(); // Line break for better output readability
 }
}

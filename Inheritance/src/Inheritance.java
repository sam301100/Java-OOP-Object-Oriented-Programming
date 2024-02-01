//This program uses inheritance to model electronic devices.
class ElectronicDevice {
 String brand;
 String model;
 double weight;

 // Constructor for ElectronicDevice
 ElectronicDevice(String brand, String model, double weight) {
     this.brand = brand;
     this.model = model;
     this.weight = weight;
 }

 // Display basic information about the electronic device
 void displayInfo() {
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Weight: " + weight + " kg");
 }
}

//Smartphone is a subclass of ElectronicDevice
class Smartphone extends ElectronicDevice {
 int screenSize;
 String operatingSystem;

 // Constructor for Smartphone
 Smartphone(String brand, String model, double weight, int screenSize, String operatingSystem) {
     super(brand, model, weight);
     this.screenSize = screenSize;
     this.operatingSystem = operatingSystem;
 }

 // Display additional information specific to smartphones
 void displaySmartphoneInfo() {
     displayInfo();
     System.out.println("Screen Size: " + screenSize + " inches");
     System.out.println("Operating System: " + operatingSystem);
 }
}

//Laptop is a subclass of ElectronicDevice
class Laptop extends ElectronicDevice {
 boolean hasTouchScreen;

 // Constructor for Laptop
 Laptop(String brand, String model, double weight, boolean hasTouchScreen) {
     super(brand, model, weight);
     this.hasTouchScreen = hasTouchScreen;
 }

 // Display additional information specific to laptops
 void displayLaptopInfo() {
     displayInfo();
     System.out.println("Has Touch Screen: " + hasTouchScreen);
 }
}

public class Inheritance {
 public static void main(String[] args) {
     Smartphone myPhone = new Smartphone("Samsung", "Galaxy S21", 0.2, 6, "Android");
     Laptop myLaptop = new Laptop("Dell", "Inspiron 15", 1.5, true);

     System.out.println("Smartphone Information:");
     myPhone.displaySmartphoneInfo();
     System.out.println("\nLaptop Information:");
     myLaptop.displayLaptopInfo();
 }
}

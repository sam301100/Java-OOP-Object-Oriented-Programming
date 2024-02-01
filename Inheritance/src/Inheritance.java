/* To inherit a class, we simply incorporate the definition of one class into another by using
the extends keyword. 
The following program creates a superclass called A and a subclass called B. The keyword extends is
used to create a subclass of A.  */


/*
 Smartphone, Laptop, and Smartwatch are subclasses of ElectronicDevice. 
 Each subclass inherits common attributes from ElectronicDevice and 
 adds its own specific attributes. 
 The super keyword is used to call the constructor of the superclass. 
 The displayInfo method in the base class is also utilized in each subclass. 
 This demonstrates the power of inheritance in creating a hierarchy of classes 
 with shared and specialized characteristics.
 */


// Base class for electronic devices
class ElectronicDevice {
    String brand;
    String model;
    double weight;

    ElectronicDevice(String brand, String model, double weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight + " kg");
    }
}

// Subclass for smartphones, extending ElectronicDevice
class Smartphone extends ElectronicDevice {
    int screenSize;
    String operatingSystem;

    Smartphone(String brand, String model, double weight, int screenSize, String operatingSystem) {
        super(brand, model, weight);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    void displaySmartphoneInfo() {
        displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Operating System: " + operatingSystem);
    }
}

// Subclass for laptops, extending ElectronicDevice
class Laptop extends ElectronicDevice {
    boolean hasTouchScreen;

    Laptop(String brand, String model, double weight, boolean hasTouchScreen) {
        super(brand, model, weight);
        this.hasTouchScreen = hasTouchScreen;
    }

    void displayLaptopInfo() {
        displayInfo();
        System.out.println("Has Touch Screen: " + hasTouchScreen);
    }
}

// Subclass for smartwatches, extending ElectronicDevice
class Smartwatch extends ElectronicDevice {
    boolean waterproof;

    Smartwatch(String brand, String model, double weight, boolean waterproof) {
        super(brand, model, weight);
        this.waterproof = waterproof;
    }

    void displaySmartwatchInfo() {
        displayInfo();
        System.out.println("Waterproof: " + waterproof);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Samsung", "Galaxy S21", 0.2, 6, "Android");
        Laptop myLaptop = new Laptop("Dell", "Inspiron 15", 1.5, true);
        Smartwatch myWatch = new Smartwatch("Apple", "Watch Series 6", 0.1, true);

        System.out.println("Smartphone Information:");
        myPhone.displaySmartphoneInfo();
        System.out.println("\nLaptop Information:");
        myLaptop.displayLaptopInfo();
        System.out.println("\nSmartwatch Information:");
        myWatch.displaySmartwatchInfo();
    }
}

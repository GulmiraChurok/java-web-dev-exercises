package exercises.technology;

public class Computer {
    private String brand;
    private int memorySize;
    private String operatingSystem;

    public Computer (String aBrand, int aMemorySize, String anOperatingSystem) {
        brand = aBrand;
        memorySize = aMemorySize;
        operatingSystem = anOperatingSystem;
    }

    public void increaseMemorySize (int n) {
        this.memorySize = this.memorySize + n;
    }


    public String getBrand() {
        return brand;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}

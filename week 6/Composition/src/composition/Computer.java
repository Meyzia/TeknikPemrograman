package composition;

public class Computer {
    public static void main(String[] args) {
        Hardware pc1 = new Hardware();
        pc1.setProcessor("Intel Core i9");
        pc1.setRAM("8GB");
        pc1.setGPU("RTX 3080 Ti");
        pc1.setStorage("SSD");
        pc1.setIODevice("SAMSUNG", "Logitech", "Logitech");
        
        Hardware pc2 = new Hardware();
        pc2.setProcessor("Intel Core i5");
        pc2.setRAM("4GB");
        pc2.setGPU("Intel UHD Graphics");
        pc2.setStorage("HDD");
        pc2.setIODevice("Mi", "Touch Screen");
        
        System.out.println("Computer 1:");
        pc1.printHardware();
        System.out.println("\nComputer 2:");
        pc2.printHardware();
    }
}

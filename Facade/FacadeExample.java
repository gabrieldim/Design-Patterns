package Facade;

public class FacadeExample {
    public static void main(String[] args) {
        System.out.println("Facade Design Pattern");
        Computer computer = new Computer();
        computer.startBooting();
    }
}

class Computer {
    //Providing an interface and covering a complex logic in the background.
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startBooting(){
        System.out.println("Computer booting starts...");
        cpu.startProcessing();
        memory.startLoadingMemory();
        hardDrive.startReadingData();
        System.out.println("Computer booting completed");
    }


}
class CPU{
    public void startProcessing(){
        System.out.println("processing starts...");
    }
}
class Memory{
    public void startLoadingMemory(){
        System.out.println("memory loading starts...");
    }
}
class HardDrive{
    public void startReadingData(){
        System.out.println("reading data from hard drive starts...");
    }
}
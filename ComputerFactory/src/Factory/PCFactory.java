package Factory;

import models.Computer;
import models.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.ram, this.hdd,this.cpu );
    }
}

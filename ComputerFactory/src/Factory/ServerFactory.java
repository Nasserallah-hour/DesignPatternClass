package Factory;

import models.Computer;
import models.PC;
import models.Server;

public class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.ram, this.hdd,this.cpu );
    }
}

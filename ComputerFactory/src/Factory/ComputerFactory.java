package Factory;

import models.Computer;
import models.PC;
import models.Server;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}

import models.AgressiveBehaviour;
import models.DefensiveBehaviour;
import models.NormalBehaviour;
import models.Robot;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot("Big Robot");
        Robot r2 = new Robot("Moon Robot");
        Robot r3 = new Robot("Go Robot");
        r1.setBehaviour(new AgressiveBehaviour());
        r2.setBehaviour(new DefensiveBehaviour());
        r3.setBehaviour(new NormalBehaviour());
        r1.performeMoveCommand();

//affiche: Big Robot shows an agressive Behaviour: if find another robot attack it

        r2.performeMoveCommand();

//affiche: Moon Robot shows a defensive Behaviour: if find another robot run from it

        r3.performeMoveCommand();

//affiche: Go Robot shows a normal Behaviour: if find another robot ignore it

    }
}

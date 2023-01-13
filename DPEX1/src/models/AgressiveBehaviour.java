package models;

public class AgressiveBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        return 1;
    }

    @Override
    public String toString() {
        return "Agressive Behaviour: if find another robot attack it";
    }
}

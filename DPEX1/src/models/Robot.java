package models;

public class Robot {
    private IBehaviour behavior;
    private String name;

    public Robot(String name){
        this.name=name;
    }

    public IBehaviour getBehavior() {
        return behavior;
    }

    public void setBehaviour(IBehaviour behavior) {
        this.behavior = behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performeMoveCommand(){
        int command = behavior.moveCommand();
        System.out.println("Move command: " + command + ". " + behavior.toString());
    }
}

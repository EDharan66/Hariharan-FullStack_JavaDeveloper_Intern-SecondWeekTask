package States;

public class PreviousState implements State{
    @Override
    public void doAction() {
        System.out.println("Opening previous video ..");
    }
}

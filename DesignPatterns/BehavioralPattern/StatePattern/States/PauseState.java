package States;

public class PauseState implements State {

    @Override
    public void doAction() {
        System.out.println("Pause the video !!");
    }

}
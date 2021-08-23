package States;

public class Context implements State {

    private State State;

    public void setState(State state) {
        this.State=state;
    }

    public State getState() {
        return this.State;
    }

    @Override
    public void doAction() {
        this.State.doAction();
    }

}
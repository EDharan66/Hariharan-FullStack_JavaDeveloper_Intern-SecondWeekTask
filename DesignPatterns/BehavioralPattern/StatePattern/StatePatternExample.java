import States.*;

public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();
        State playState = new PlayState();
        State pauseState = new PauseState();
        State nextState = new NextState();
        State previousState = new PreviousState();

        context.setState(playState);
        context.doAction();

        context.setState(pauseState);
        context.doAction();

        context.setState(nextState);
        context.doAction();

        context.setState(previousState);
        context.doAction();

    }
}

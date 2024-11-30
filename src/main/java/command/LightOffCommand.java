package command;

public class LightOffCommand implements Command{
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute(Command.Light light) {
        light.turnOff();
    }
}

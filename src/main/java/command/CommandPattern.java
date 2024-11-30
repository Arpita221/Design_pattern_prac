package command;

public class CommandPattern {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

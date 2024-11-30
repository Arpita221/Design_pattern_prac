package command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute(light);
        } else {
            System.out.println("No command is set");
        }
    }


}

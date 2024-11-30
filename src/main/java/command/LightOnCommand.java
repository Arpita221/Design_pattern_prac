package command;

class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light){
        this.light=light;
    }
@Override
public void  execute(Command.Light light){
    this.light.turnon();
        }
                }
package behavioralPattern.commandPattern.commandPatternExtension;

import java.util.ArrayList;

//树枝构件: 调用者
public class CompositeInvoker {
    private ArrayList<AbstractCommand> commandArrayList = new ArrayList<>();

    public void add(AbstractCommand abstractCommand){
        commandArrayList.add(abstractCommand);
    }

    public void remove(AbstractCommand abstractCommand){
        commandArrayList.remove(abstractCommand);
    }

    public AbstractCommand getChild(int i){
        return commandArrayList.get(i);
    }

    public void execute(){
        for (AbstractCommand abstractCommand:commandArrayList) {
            abstractCommand.execute();
        }
    }
}

package behavioralPattern.mediatorPattern.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

//具体中介者
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague colleague1:colleagues) {
            if (!colleague.equals(colleague1)){
                colleague.receive();
            }
        }
    }
}

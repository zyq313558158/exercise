package behavioralPattern.mediatorPattern.mediatorPatternExtension;

import java.util.ArrayList;
import java.util.List;

//简单单例中介者
public class SimpleMediator {
    private static SimpleMediator simpleMediator = new SimpleMediator();
    private List<SimpleColleague> simpleColleagueList = new ArrayList<>();

    public static SimpleMediator getSimpleMediator() {
        return simpleMediator;
    }

    public void register(SimpleColleague simpleColleague) {
        if (!simpleColleagueList.contains(simpleColleague)) {
            simpleColleagueList.add(simpleColleague);
        }
    }

    public void relay(SimpleColleague simpleColleague) {
        for (SimpleColleague simpleColleague1 : simpleColleagueList) {
            if (!simpleColleague.equals(simpleColleague1)){
                simpleColleague1.receive();
            }
        }
    }
}

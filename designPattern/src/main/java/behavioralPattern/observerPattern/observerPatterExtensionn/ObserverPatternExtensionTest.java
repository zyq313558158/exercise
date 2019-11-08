package behavioralPattern.observerPattern.observerPatterExtensionn;

import java.util.Observable;
import java.util.Observer;

public class ObserverPatternExtensionTest {
    public static void main(String[] args) {
        OilFutures oilFutures = new OilFutures();
        Observer bull = new Bull(); //多方
        Observer bear = new Bear(); //空方
        oilFutures.addObserver(bull);
        oilFutures.addObserver(bear);
        oilFutures.setPrice(5.2f);
        oilFutures.setPrice(-5.2f);
    }
}

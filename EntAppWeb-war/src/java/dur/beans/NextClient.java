package dur.beans;

import dur.jpa.Client;
import dur.jpa.ClientFacadeLocal;
import java.util.concurrent.atomic.AtomicInteger;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("nextClient")
@ApplicationScoped
public class NextClient implements NextClientLocal {

    @EJB
    private ClientFacadeLocal clientFacade;
    private AtomicInteger next = new AtomicInteger(1009);
    private AtomicInteger guess = new AtomicInteger(0);
    private final boolean correct = true;

    @Override
    public String getNext() {
        next.addAndGet(1);
        Client client = clientFacade.find(next.intValue());
        return client.toString();
    }

    @Override
    public void setGuess(int guessInt) {
        guess = new AtomicInteger(guessInt);
    }

    @Override
    public int getGuess() {
        return guess.intValue();
    }

    //not sure what do with these methods
    
    @Override
    public String getResponse() {
        return "the guess  of " + guess.intValue() + " is " + correct;
    }

    @Override
    public String submit() {
        return "the guess  of " + guess.intValue() + " is " + correct;
    }

}

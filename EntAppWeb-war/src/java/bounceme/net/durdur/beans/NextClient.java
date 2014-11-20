package bounceme.net.durdur.beans;

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
    private Client client = new Client();

    @Override
    public String getNext() {
        next.addAndGet(1);
        client = clientFacade.find(next.intValue());
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

     @Override
    public Client getClient() {
        return client;
    }

    @Override
    public void setClient(Client client) {
        this.client = client;
    }

}

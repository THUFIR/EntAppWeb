package dur.beans;

import dur.jpa.Client;
import dur.jpa.ClientFacadeLocal;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("nextClient")
@ApplicationScoped
public class NextClient implements NextClientLocal {

    @EJB
    private ClientFacadeLocal clientFacade;
    private int next = 1009;
    private int guess = 0;
    private final boolean correct = true;

    @Override
    public String getNext() {
        next++;
        Client client = clientFacade.find(next);
        return client.toString();
    }

    @Override
    public void setGuess(int guess) {
        this.guess = guess;
    }

    @Override
    public int getGuess() {
        return guess;
    }

    @Override
    public String getResponse() {
        return "the guess  of " + guess + " is " + correct;
    }

    @Override
    public String submit() {
        return "the guess  of " + guess + " is " + correct;
    }

}

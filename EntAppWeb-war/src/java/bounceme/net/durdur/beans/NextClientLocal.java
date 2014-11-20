package bounceme.net.durdur.beans;

import dur.jpa.Client;
import javax.ejb.Local;

@Local
public interface NextClientLocal {

    String getNext();

    void setGuess(int guessInt);

    int getGuess();

    Client getClient();

    void setClient(Client client);
}

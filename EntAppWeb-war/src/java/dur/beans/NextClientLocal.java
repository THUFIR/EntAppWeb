package dur.beans;

import dur.jpa.Client;
import javax.ejb.Local;

@Local
public interface NextClientLocal {

    String getNext();

    void setGuess(int guessInt);

    int getGuess();

    String getResponse();

    String submit();

    Client getClient();

    void setClient(Client client);
}

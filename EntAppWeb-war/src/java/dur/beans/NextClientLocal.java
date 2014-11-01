package dur.beans;

import javax.ejb.Local;

@Local
public interface NextClientLocal {

    String getNext();

    void setGuess(int guessInt);

    int getGuess();

    String getResponse();

    String submit();
}

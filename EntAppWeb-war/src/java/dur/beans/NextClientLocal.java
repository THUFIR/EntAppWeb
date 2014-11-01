package dur.beans;

import javax.ejb.Local;

@Local
public interface NextClientLocal {

    String getNext();

    void setGuess(int guess);

    int getGuess();

    String getResponse();

    String submit();
}

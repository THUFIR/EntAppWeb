package dur.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("nextClient")
@ApplicationScoped
public class NextClient implements NextClientLocal {

    private int next = 1009;

    @Override
    public int getNext() {
        next = next + 1;
        return next;
    }

}

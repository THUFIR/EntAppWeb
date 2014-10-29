package dur.jpa;

import javax.ejb.Singleton;
import javax.inject.Named;

@Named
@Singleton
public class Next implements NextLocal {

    private int next = 1009;

    @Override
    public int getNext() {
        return next++;
    }
}

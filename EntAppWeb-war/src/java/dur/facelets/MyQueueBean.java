package dur.facelets;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Singleton;

@Named
@ApplicationScoped
@Singleton
public class MyQueueBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Logger log = Logger.getLogger(MyQueueBean.class.getName());
    private int next = 1001;

    public MyQueueBean() {
    }

    public int getNext() {
        log.info("next\t" + next);
        return next++;
    }
}
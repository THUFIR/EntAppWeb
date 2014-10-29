package dur.jpa;


import java.io.Serializable;
import java.util.logging.Logger;
import javax.inject.Named;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Named
@ApplicationScoped
@Singleton
public class MyQueueBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final Logger log = Logger.getLogger(MyQueueBean.class.getName());
    private int next = 1003;
    @Inject private ClientFacade clientFacade;
    
    public MyQueueBean() {
    }

    public int getNext() {
        Client client = clientFacade.find(next);
        log.info(client.toString());
        return next++;
    }
}

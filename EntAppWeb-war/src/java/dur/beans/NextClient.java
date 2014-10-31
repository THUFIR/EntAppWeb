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

    @Override
    public String getNext() {
        next++;
        Client client = clientFacade.find(next);
        return client.toString();
    }

}

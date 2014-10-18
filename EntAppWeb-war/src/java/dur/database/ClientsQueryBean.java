package dur.database;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class ClientsQueryBean implements Serializable {

    private static final long serialVersionUID = 1L;
//    private final Logger log = Logger.getLogger(ClientsQueryBean.class.getName());

    @EJB
    private QueryBeanWithEntityManager queryBean;

    public List<Clients> getClients() {
        return queryBean.getClients();
    }

    public Clients getClientById(int id) {
        return queryBean.getClientById(id);
    }
}

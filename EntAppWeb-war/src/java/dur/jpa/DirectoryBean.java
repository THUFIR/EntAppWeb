package dur.jpa;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DirectoryBean implements Serializable {

    private static final long serialVersionUID = 403250971215465050L;
    private int totalCount = 99;

    public DirectoryBean() {
    }

    public int getTotalCount() {
        return totalCount++;
    }

}

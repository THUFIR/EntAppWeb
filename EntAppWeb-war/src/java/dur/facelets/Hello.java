package dur.facelets;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Hello implements Serializable {

    private static final long serialVersionUID = 403250971215465050L;
  //  private final Logger log = Logger.getLogger(Hello.class.getName());

    public Hello() {
    }

    public String foo() {
        return "bar";
    }

    public String hi(String name) {
        return "hi " + name;
    }

}

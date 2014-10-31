
package dur.beans;

import javax.ejb.Local;

@Local
public interface NextClientLocal {

    int getNext();
    
}

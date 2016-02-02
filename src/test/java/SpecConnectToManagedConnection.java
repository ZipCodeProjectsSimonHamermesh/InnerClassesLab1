/**
 * Created by simonhamermesh on 2/2/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class SpecConnectToManagedConnection {

    ConnectionManager connectionManager = new ConnectionManager();

    @Test
    public void testConnectionManager_testConnectToConnectionManager(){

      Connection c1 = connectionManager.getManagedConnection("1.2.1",1,"HTML");
        System.out.println(c1.connect());
        assertTrue(c1.connect() instanceof String );
    }
}

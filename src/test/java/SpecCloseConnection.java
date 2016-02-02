/**
 * Created by simonhamermesh on 2/2/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;


public class SpecCloseConnection {

    ConnectionManager connectionManager = new ConnectionManager();


    @Test
    public void testConnectionManager_tooManyConnections(){

        Connection c1 = connectionManager.getManagedConnection("1.2.1",1,"HTML");
        Connection c2 = connectionManager.getManagedConnection("1.2.2",2,"HTML");
        Connection c3 = connectionManager.getManagedConnection("1.2.3",3,"HTML");
        Connection c4 = connectionManager.getManagedConnection("1.2.4",4,"HTML");

        assertNotNull(c1);
        assertNotNull(c2);
        assertNotNull(c3);
        assertNull(c4);

        c3.close();
        assertTrue(c3.connect().equals("Error sucka."));

        Connection c5 = connectionManager.getManagedConnection("1.2.4",4,"HTML");
        assertNotNull(c5);
    }



}

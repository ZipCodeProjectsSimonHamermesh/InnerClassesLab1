/**
 * Created by simonhamermesh on 2/2/16.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class SpecTooManyConnections {

    ConnectionManager connectionManager = new ConnectionManager();


    @Test
    public void testConnectionManager_getTooManyConnections(){

        assertTrue(connectionManager.getManagedConnection("1.2.1",1,"HTML") instanceof Connection);
        assertTrue(connectionManager.getManagedConnection("1.2.1",1,"HTML") instanceof Connection);
        assertTrue(connectionManager.getManagedConnection("1.2.1",1,"HTML") instanceof Connection);
        assertTrue(connectionManager.getManagedConnection("1.2.1",1,"HTML") instanceof Connection);

    }


}

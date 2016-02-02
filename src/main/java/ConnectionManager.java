/**
 * Created by simonhamermesh on 2/2/16.
 */
public class ConnectionManager {

    private static int mcCounter = 0;

    public static Connection getManagedConnection(String aipAddress, int aport, String aprotocol) {

        if (ConnectionManager.mcCounter > 2) {
            System.out.println("No way Jose");
            return null;
        } else {
            mcCounter++;
            return new ManagedConnection(aipAddress, aport, aprotocol);

        }
    }

    private static class ManagedConnection implements Connection {

        private String ipAddress;
        private int port;
        private String protocol;
        private boolean open = true;

        public String getIP(){if(open){return ipAddress;} return null;}

        public int getPort(){if(open){return port;} return 55378008;}

        public String getProtocol(){if(open){return protocol;} return null;}

        public String connect(){

            if(open){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ipAddress);
            stringBuilder.append(port);
            stringBuilder.append(protocol);
            return stringBuilder.toString();}
            return "Error sucka.";
        }

        public void close(){
            open = false;
            mcCounter--;
        }

        public void open(){
            open = true;
        }

        private ManagedConnection(String aipAddress, int aport, String aprotocol) {
            ipAddress = aipAddress;
            port = aport;
            protocol = aprotocol;

        }
    }
}

/**
 * Created by simonhamermesh on 2/2/16.
 */
public interface Connection {
    String getIP();

    int getPort();

    String getProtocol();

    String connect();

    void close();

    void open();

}

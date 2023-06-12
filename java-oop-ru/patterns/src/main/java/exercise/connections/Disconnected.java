package exercise.connections;
import exercise.TcpConnection;

import java.util.List;

// BEGIN
public class Disconnected implements Connection {

    private TcpConnection tcpConnection;
    private List<String> List;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
    @Override
    public void connect() {
        this.tcpConnection.setState(new Connected(this.tcpConnection));
    }
    @Override
    public void disconnect() {
        System.out.println("Error! Connection is already exist");
    }
    @Override
    public void write(String string) {
        System.out.println("Error");
    }
}
// END

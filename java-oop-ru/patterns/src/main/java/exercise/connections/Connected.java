package exercise.connections;
import exercise.TcpConnection;

import java.util.List;

// BEGIN
public class Connected implements Connection {
    private TcpConnection tcpConnection;
    private List<String> List;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
    @Override
    public void connect() {
        System.out.println("Error! Connection is already exist");
    }
    @Override
    public void disconnect() {
        this.tcpConnection.setState(new Disconnected(this.tcpConnection));
        System.out.println("Connection closed");
    }
    @Override
    public void write(String string) {
        System.out.println("Error");
    }
}
// END

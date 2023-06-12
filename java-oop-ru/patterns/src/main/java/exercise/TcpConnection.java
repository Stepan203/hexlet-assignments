package exercise;
import exercise.connections.Connection;
import exercise.connections.Connected;
import exercise.connections.Disconnected;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection implements Connection {
    public   String address;
    public int port;

  //  private Connection connected;
    private Connection connection;

    public TcpConnection(String address, int port) {
        this.connection = new Disconnected(this);
    }
   // public TcpConnection(String address, int port) {
   //     this.address = address;
   //     this.port = port;
   // }
   // public TcpConnection() {
   // }
   // public String getAddress() {
   //     return address;
  //  }
  //  public int getPort() {
  //      return port;
  //  }
  //  public Connection getState() {
  //      return connection;
  //  }
    public void setState(Connection connection) {
        this.connection = connection;
    }
   // Connection connection = new Connection;

    @Override
    public String getCurrentState() {
        return connection.getCurrentState();
    }

    @Override
    public void connect() {
        connection.connect();
    }

    @Override
    public void disconnect() {
        connection.disconnect();
       // System.out.println(disconnected);
    }

    @Override
    public void write(String string) {
        connection.write(string);
    }
}
// END

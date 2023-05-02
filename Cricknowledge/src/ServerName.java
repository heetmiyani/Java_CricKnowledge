import java.net.*;

public class ServerName {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Local host name: " + localHost.getHostName());
        System.out.println("Local host IP address: " + localHost.getHostAddress());
    }
}


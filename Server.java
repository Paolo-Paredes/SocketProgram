import java.net.*;
import java.io.*;
import java.util.Random;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        Order or = new Order();
        ServerSocket server = new ServerSocket(4999);
        Socket s = server.accept();
        int done = 0;
        String str = "Server:";
        int notif = 0;

        System.out.println("Client Connected");

        while(str!=null)
        {
          PrintWriter pw = new PrintWriter(s.getOutputStream());
          InputStreamReader isr = new InputStreamReader(s.getInputStream());
          BufferedReader br = new BufferedReader(isr);

          str  = br.readLine();

          System.out.println(str);
        }

        System.out.println("Client Disconnected");
    }
}

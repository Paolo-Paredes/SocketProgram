import java.net.*;
import java.io.*;
import java.util.Random;

public class Server
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(4999);
        Socket s = server.accept ();

        System.out.println("Client Connected");

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        InputStreamReader isr = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(isr);

        String str  = br.readLine();
        pw.println(str);
        pw.flush();

    }
}

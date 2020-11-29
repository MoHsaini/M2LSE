import java.io.* ;
import java.net.* ;
import java.util.ArrayList;

public class ThreadedEchoServer {
   public static ArrayList<EchoThread> connections = new ArrayList<EchoThread>();

    static final int PORT = 3000;
    static int count=0;

    /*void closeConnection() throws IOException{
        this.socket.close();
    }*/

    public static void main(String args[]) {
        ServerSocket serverSocket = null;
        Socket socket = null;


        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();

        }
        while (true) {
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                System.out.println("I/O error: " + e);
            }
            // new thread for a client
            EchoThread newThread = new EchoThread(socket);
            connections.add(newThread);
            newThread.id++;            
            //if(connections.size()){id--;}
            System.out.println(newThread.id + " " + connections.size());

            /*---------------------------------------------*/



        }
    }
}


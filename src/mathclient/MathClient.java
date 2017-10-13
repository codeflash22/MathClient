package mathclient;

import java.net.*;
import java.io.*;
/**
 *
 * @author Faisal
 */
public class MathClient {

    public static void main(String[] args) throws Exception{
        
        Socket socket = new Socket("localhost", 2245);
        
        // Perform a simple math opeartion
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("+:12:21");
        writer.newLine();
        writer.flush();
        
        // get the result from server
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(reader.readLine());
        reader.close();
        writer.close();
        
    }
    
}

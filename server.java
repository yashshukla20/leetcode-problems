import java.io.*;

import java.net.*;



public class server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(1234);
        Stock s=ss.accept();
        DataInputStream dis= new DataInputStream(s.getInpputStream());
        DataOutputStream dos= new DataOutputStream(s.getOutputStream());
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str1="", str2="";

        while(!str1.equals("bye")){
            str1=dis.readUTF();
            System.out.println("clint: "+str1);
            str2=br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }

    }
}

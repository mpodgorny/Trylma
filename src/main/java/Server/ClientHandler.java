package Server;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ClientHandler extends Thread {

    DateFormat fordate = new SimpleDateFormat("yyyy/MM/dd");
    DateFormat fortime = new SimpleDateFormat("hh:mm:ss");
    final DataInputStream in;
    final DataOutputStream out;
    final Socket s;
    String nick;


    // Constructor
    public ClientHandler(Socket s, DataInputStream in, DataOutputStream out, String nickname)
    {
        this.s = s;
        this.in = in;
        this.out = out;
        this.nick=nickname;
    }

    @Override
    public void run()
    {
        String input ="";
        try { input = in.readUTF();} catch(Exception ex) {}

        if(input=="GAME_FOR_TWO") {
            //hostuj gre dla 2
        } else if (input =="GAME_FOR_THREE"){
            //hostuj gre dla 3
        } else if (input =="GAME_FOR_FOUR"){
            //hostuj gre dla 4
        } else if (input =="GAME_FOR_SIX"){
            //hostuj grę dla 6
        } else if (input == "CONNECT_TO_GAME") {
            //dolacz do istniejacej gry
        } else
            System.out.println("Program shouldn't be here");


    }
}
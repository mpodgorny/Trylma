package Client;

import Client.Board.BoardDraw;
import Client.Board.FillBoard;
import Client.Board.StarBoard;
import Server.ServerMain;
import javafx.application.Application;
import javafx.stage.Stage;


public class ClientMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        //FillBoard fb = new FillBoard(2,primaryStage);
        //BoardDraw bd = new BoardDraw(primaryStage, ServerMain.board);
        StartUpMenu start = new StartUpMenu(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

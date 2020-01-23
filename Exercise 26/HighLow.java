import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HighLow extends Application
{
    @Override
    public void start (Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("HighLow.fxml"));
        Scene scene = new Scene(root, 690, 420);
        
        stage.setTitle("Messenger FXML");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    //     Scanner keyboard = new Scanner(System.in);
    //     int secret, guess;

    //     secret = 1 + (int)(100*Math.random());
    //     System.out.println("1-100");
    //     System.out.println("Try to guess");
    //     System.out.print("> ");
    //     guess = keyboard.nextInt();

    //     while(secret != guess)
    //     {
    //         if(guess < secret)
    //         {
    //             System.out.println("Too low, Try again");
    //             guess = keyboard.nextInt();
    //         }
    //         if(guess > secret)
    //         {
    //             System.out.println("Too high, Try again");
    //             guess = keyboard.nextInt();
    //         }
    //     }

    //     System.out.println("Noice");
    // }
}


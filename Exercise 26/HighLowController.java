import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.Slider;

public class HighLowController
{
    @FXML private Slider guess;
    @FXML private TextField tf;
    @FXML protected void handleButtonClickOrWhatever(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, tf.getText());
        alert.showAndWait();
    }
}
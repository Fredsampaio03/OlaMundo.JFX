package sp.senac.br.olamundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TesteController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField TextMensagem;

    public void abrirTelaHello(ActionEvent actionEvent) throws IOException {


        welcomeText.setText(TextMensagem.getText());
    }
}




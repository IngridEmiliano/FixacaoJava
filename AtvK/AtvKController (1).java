package com.ativk.atvk;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

public class AtvKController {
    @FXML
    private Button Calcular;

    @FXML
    private TextField Capital;

    @FXML
    private TextField Taxa;

    @FXML TextField Tempo;

    @FXML Label Exibir;

    @FXML
    protected void alerta(){
try {
    if (Capital.getText().isEmpty() || Taxa.getText().isEmpty() || Tempo.getText().isEmpty()) {
        Alert msg = new Alert(Alert.AlertType.INFORMATION);
        msg.setTitle("Campo vazio");
        msg.setHeaderText("Preencha todos os campos ");
        msg.setContentText("Por favor, preencha todos os campos.");
        msg.showAndWait();
        return;
    }

        float Capital2 = Float.parseFloat(Capital.getText());
        float Taxa2 = Float.parseFloat(Taxa.getText());
        float Tempo2 = Float.parseFloat(Tempo.getText());

    float Valor = Capital2 * (float) Math.pow(1 + (Taxa2 / 100), Tempo2);

    Exibir.setText("Montante final: " + new DecimalFormat("#.##").format(Valor));

    Taxa.setText("");
    Tempo.setText("");
    Capital.setText("");


} catch (NumberFormatException e) {
    Alert msg = new Alert(Alert.AlertType.ERROR);
    msg.setTitle("Erro de Formato");
    msg.setHeaderText("Entrada inválida");
    msg.setContentText("Por favor, insira valores numéricos válidos.");
    msg.showAndWait();
    }
}
}
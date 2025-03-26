package com.atvg.atvg;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PalíndromoController {
    @FXML
    private Button Verificar;

    @FXML
    private TextField Resp;

    @FXML
    protected void Alerta() {


        String Texto = Resp.getText().replaceAll("\\s", "").toLowerCase();

        // Verifica se a string é um palíndromo
        String textoInvertido = new StringBuilder(Texto).reverse().toString();

        if (Texto.equals(textoInvertido)) {
            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("palíndromo");
            msg.setHeaderText("A palavra é um palíndromo");
            msg.setContentText(" ");
            msg.showAndWait();
        } else {
            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Não é um palíndromo");
            msg.setHeaderText("A palavra não é um palíndromo");
            msg.setContentText(" ");
            msg.showAndWait();

        }
        Resp.setText("");
    }
}
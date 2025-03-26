package com.ative.ative;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AtivEController {
    @FXML
    private Button login;

    @FXML
    private TextField RespUsuario;

    @FXML TextField RespSenha;

    @FXML
    protected void Alerta(){

        if (RespUsuario.getText().equals("admin") && RespSenha.getText().equals("1234")){
            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Sucesso!");
            msg.setHeaderText("Login bem sucedido ");
            msg.setContentText("Bem-Vindo");
            msg.showAndWait();
        } else {
            Alert msg = new Alert(Alert.AlertType.ERROR);
            msg.setTitle("Erro");
            msg.setHeaderText("Usuario ou senha incorretos ");
            msg.setContentText("Tente novamete");
            msg.showAndWait();
        }
        RespUsuario.setText("");
        RespSenha.setText("");
    }
}
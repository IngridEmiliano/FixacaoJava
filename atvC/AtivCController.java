package com.ativc.atvc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AtivCController {
    @FXML
    private Button Contar;

    @FXML
    private Label Resultado;

    @FXML
    private TextField Caractere;

    @FXML
    protected void Alerta(){
        String Palavra = Caractere.getText();

        // Contando o número de caracteres na string 'Palavra'
        int quantidadeDeCaracteres = Palavra.length();

        // Atualizando o Label com o resultado
        Resultado.setText("Número de caracteres: " + quantidadeDeCaracteres);
    }
    }
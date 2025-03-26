package org.atividadeb.atividadeb;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AtividadeB_Controller {
    @FXML
    private Label Titulo;

    @FXML
    private TextField num1;

    @FXML
    private Button Verificar;

    @FXML
    private Label texto;

    @FXML
    protected void alerta(){
        int n1 = Integer.parseInt(num1.getText());

        if (n1 % 2==0){
            texto.setText("o numero "+n1+" é par");
        }else{
            texto.setText("o numero "+n1+" é impar");
        }
    }



}
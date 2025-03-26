package com.atv1.atv1;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Duration;

import java.util.Optional;

public class Atv1Controller {
    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label resultado;

    @FXML
    protected void ClickTeste() {

        try {
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());

            double result = 0;

            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("Opçoes de calculo");
            msg.setHeaderText("Escolha as opções de cálculo  abaixo: ");
            msg.setContentText("Clique no botão desejado.");

            ButtonType btnSoma = new ButtonType("+");
            ButtonType btnSubitrair = new ButtonType("-");
            ButtonType btnMultiplicar = new ButtonType("x");
            ButtonType btnDividir = new ButtonType("÷");
            ButtonType btnCancelar = new ButtonType("Cancelar");
            msg.getButtonTypes().setAll(btnSoma, btnSubitrair, btnMultiplicar, btnDividir, btnCancelar);
            Optional<ButtonType> opt = msg.showAndWait();

            if (opt.isPresent()) {
                if (opt.get() == btnSoma) {
                    result = n1 + n2;
                    resultado.setText(n1 + " + " + n2 + " = " + result);
                } else if (opt.get() == btnSubitrair) {
                    result = n1 - n2;
                    resultado.setText(n1 + " - " + n2 + " = " + result);
                } else if (opt.get() == btnMultiplicar) {
                    result = n1 * n2;
                    resultado.setText(n1 + " x " + n2 + " = " + result);
                }else if (n2 == 0){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Aviso");
                    alert.setHeaderText("Número inválido");
                    alert.setContentText("Não é possivel fazer a divisão por 0");
                    alert.showAndWait();
                } else {
                    result = n1 / n2;
                    resultado.setText(n1 + " ÷ " + n2 + " = " + result);
                }
            }
            // Caso o usuário tenha cancelado
            else {
                    resultado.setText("");
                }

            num1.setText("");
            num2.setText("");

            PauseTransition pause = new PauseTransition(Duration.seconds(5));
            pause.setOnFinished(e -> resultado.setText(""));
            pause.play();

        } catch (NumberFormatException e) {
            Alert msg = new Alert(Alert.AlertType.INFORMATION);
            msg.setTitle("ERRO");
            msg.setHeaderText("ERRO");
            msg.setContentText("O valor informado não é valido");
            msg.showAndWait();

            num1.setText("");
            num2.setText("");

        }
        }
    }

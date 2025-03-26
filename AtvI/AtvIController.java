package com.atvi.atvi;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AtvIController {
    @FXML
    private Button Converter;

    @FXML
    private TextField Resp;

    @FXML
    private Label Exbir;

    @FXML
    protected void Alerta(){

        double Celsius = Double.parseDouble(Resp.getText());

                double formulaFahrenheit = (Celsius * 9 / 5) + 32;

                Exbir.setText("A temperatura em Fahrenheit é: " + formulaFahrenheit);

            }
        }

package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField txtPromien;
    public TextField txtWysokosc;
    public Button Oblicz;
    public TextField txtGrubosc;
    public TextArea txtWynik;

    public void OnClickButton(ActionEvent actionEvent) {
        double r = Double.parseDouble(txtPromien.getText());
        double h = Double.parseDouble(txtWysokosc.getText());
        double g = Double.parseDouble(txtGrubosc.getText());
        double waga_st = (2 * Math.PI * r * r + 2 * Math.PI * r * h) * g * 0.15;
        double cena_st = (2 * Math.PI * r * r + 2 * Math.PI * r * h) * g * 0.15 * 10;
        double waga_nrdz = (2 * Math.PI * r * r + 2 * Math.PI * r * h) * g * 0.3;
        double cena_nrdz = (2 * Math.PI * r * r + 2 * Math.PI * r * h) * g * 0.3 * 20;
        txtWynik.setText("Waga blachy stalowej wynosi: " + String.format("%.2f", waga_st) + " kg, natomiast cena materiału będzie równa " + String.format("%.2f", cena_st) + " pln. Waga blachy nierdzewnej wynosi " + String.format("%.2f", waga_nrdz) + " kg, natomiast cena materiału będzie równa " + String.format("%.2f", cena_nrdz) + " pln.");
    }
}

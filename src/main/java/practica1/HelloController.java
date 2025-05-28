package practica1;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
public class HelloController {
    static int contador;
    @FXML
    private Label welcomeText;

    @FXML
    private Label etiquetaContador;

    @FXML
    public Button contar;

    @FXML
    public void initialize(){
        Contador contador1 = new Contador(0);
        contar.setOnAction(e -> {
            contador1.incrementar();
            System.out.println(contador1.getContador());
            etiquetaContador.setText(Integer.toString(contador1.getContador()));
        });
    };

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void irApantalla2() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }
}
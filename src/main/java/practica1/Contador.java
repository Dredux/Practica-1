package practica1;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @AllArgsConstructor
public class Contador {
    private int contador;

    public void incrementar(){
        contador++;
    }
}

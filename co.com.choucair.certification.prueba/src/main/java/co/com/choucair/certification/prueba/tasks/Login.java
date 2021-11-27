package co.com.choucair.certification.prueba.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
public class    Login {

    public  static  Login onThePage(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performas(T actor){

    }
}

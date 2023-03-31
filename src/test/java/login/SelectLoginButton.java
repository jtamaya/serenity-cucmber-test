package login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static login.LoginButton.LOGIN_BUTTON;


public class SelectLoginButton implements Task {
    private String username;
    private String password;

    public SelectLoginButton(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static SelectLoginButton Session(String username, String password) { return Tasks.instrumented(SelectLoginButton.class, username, password);}
}

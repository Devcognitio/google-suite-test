package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_APPS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Ir implements Task {

    private String url;

    public Ir(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Open.url(url),
               Click.on(GOOGLE_APPS)
       );
    }

   public static Performable a(String url) {
        return instrumented(Ir.class, url);
   }
}

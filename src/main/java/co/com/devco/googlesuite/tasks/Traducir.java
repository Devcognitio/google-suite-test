package co.com.devco.googlesuite.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

public class Traducir implements Task {

    private String palabra;
    private String lenguajeOrigen;
    private String lenguajeDestino;

    public Traducir(String palabra, String lenguajeOrigen, String lenguajeDestino) {
        this.palabra = palabra;
        this.lenguajeOrigen = lenguajeOrigen;
        this.lenguajeDestino = lenguajeDestino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OPCION_LENGUAJE_ORIGEN),
                Enter.theValue(lenguajeOrigen).into(LENGUAJE_ORIGEN).thenHit(ENTER),
                Click.on(OPCION_LENGUAJE_DESTINO),
                Enter.theValue(lenguajeDestino).into(LENGUAJE_DESTINO).thenHit(ENTER),
                Enter.theValue(palabra).into(TEXTAREA_ORIGEN)
        );
    }

    public static Performable laPalabra(String palabra, String lenguajeOrigen, String lenguajeDestino) {
        return instrumented(Traducir.class, palabra, lenguajeOrigen, lenguajeDestino);
    }
}

package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.tasks.AbrirLa;
import co.com.devco.googlesuite.tasks.Ir;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_TRANSLATE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GoogleTranslateStepDefinitions {

	@Before
	public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
	}

	@Dado("que Susan quiere traducir una palabra")
	public void queSusanQuiereTraducirUnaPalabra() {
		theActorCalled("Susan").attemptsTo(
				Ir.a("https://www.google.com/"),
				AbrirLa.opcion(GOOGLE_TRANSLATE)
		);
	}

	@Cuando("ella traduce la palabra cheese del Inglés al Español")
	public void ellaTraduceLaPalabraCheeseDelInglésAlEspañol() {


	}

	@Entonces("ella debería ver la palabra queso en la pantalla")
	public void ellaDeberíaVerLaPalabraQuesoEnLaPantalla() {


	}


}

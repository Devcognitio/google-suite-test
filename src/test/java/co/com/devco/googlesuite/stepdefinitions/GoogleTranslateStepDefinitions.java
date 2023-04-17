package co.com.devco.googlesuite.stepdefinitions;

import co.com.devco.googlesuite.questions.LaPalabraTraducida;
import co.com.devco.googlesuite.tasks.AbrirLa;
import co.com.devco.googlesuite.tasks.Ir;
import co.com.devco.googlesuite.tasks.Traducir;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.devco.googlesuite.userinterfaces.GoogleAppsComponent.GOOGLE_TRANSLATE;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

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

	@Cuando("ella traduce la palabra {word} del {word} al {word}")
	public void ellaTraduceUnaPalabra(String palabra, String lenguajeOrigen, String lenguajeDestino) {
		theActorInTheSpotlight().attemptsTo(
				Traducir.laPalabra(palabra, lenguajeOrigen, lenguajeDestino)
		);
	}

	@Entonces("ella debería ver la palabra {} en la pantalla")
	public void ellaDeberiaVerLaPalabraTraducidaEnLaPantalla(String palabraTraducida) {
		theActorInTheSpotlight().should(eventually(seeThat(LaPalabraTraducida.es(), equalTo(palabraTraducida))));
	}


}

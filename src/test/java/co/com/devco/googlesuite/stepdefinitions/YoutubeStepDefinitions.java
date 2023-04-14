package co.com.devco.googlesuite.stepdefinitions;

import io.cucumber.java.Before;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class YoutubeStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Mike quiere buscar un video")
    public void queMikeQuiereBuscarUnVideo() {
        OnStage.theActorCalled("Mike").attemptsTo(Open.url("https://www.google.com/"));
    }
    @Cuando("el busca Beethoven Symphony {int} + Hubble images")
    public void elBuscaBeethovenSymphonyHubbleImages(Integer int1) {

    }
    @Entonces("el debería ver al menos {int} video listado")
    public void elDeberíaVerAlMenosVideoListado(Integer int1) {

    }

}

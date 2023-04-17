package co.com.devco.googlesuite.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.googlesuite.userinterfaces.GoogleTranslatePage.RESULTADO;


public class LaPalabraTraducida implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        //return Text.of(RESULTADO).viewedBy(actor).asString().replace("\n", "");
        return actor.asksFor(Text.of(RESULTADO).asString()).replace("\n", "");
    }

    public static LaPalabraTraducida es() {
        return new LaPalabraTraducida();
    }
}

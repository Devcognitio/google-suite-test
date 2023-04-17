package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

	public static final Target OPCION_LENGUAJE_ORIGEN = Target.the("Botón de lenguaje de origen").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[2]/button");
	public static final Target OPCION_LENGUAJE_DESTINO = Target.the("Botón de lenguaje de destino").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/button");
	public static final Target LENGUAJE_ORIGEN = Target.the("Lenguaje de origen").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[1]/div/div[2]/input"));
	public static final Target LENGUAJE_DESTINO = Target.the("Lenguaje de destino").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[2]/input"));
	public static final Target TEXTAREA_ORIGEN = Target.the("Area de texto de palabra de origen").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
	public static final Target RESULTADO = Target.the("Area de texto de lenguaje de destino").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[2]/div/div[9]/div/div[1]/span[1]/span/span");
}

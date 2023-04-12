package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

	public static final Target OPCION_LENGUAJE_ORIGEN = Target.the("Botón de lenguaje de origen").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]");
	public static final Target OPCION_LENGUAJE_DESTINO = Target.the("Botón de lenguaje de destino").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]");
	public static final Target LENGUAJE_ORIGEN = Target.the("Lenguaje de origen").located(By.id("sl_list-search-box"));
	public static final Target LENGUAJE_DESTINO = Target.the("Lenguaje de destino").located(By.id("tl_list-search-box"));
	public static final Target TEXTAREA_ORIGEN = Target.the("Area de texto de palabra de origen").located(By.id("source"));
	public static final Target RESULTADO = Target.the("Area de texto de lenguaje de destino").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]");
}

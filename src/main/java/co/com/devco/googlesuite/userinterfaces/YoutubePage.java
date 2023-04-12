package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class YoutubePage {
	
	public static final Target TEXTO_DE_BUSQUEDA = Target.the("Caja de texto de búsqueda").locatedBy("//div[@id='search-input']/input");
	public static final Target BOTON_BUSQUEDA = Target.the("Botón de búsqueda").located(By.id("search-icon-legacy"));

}

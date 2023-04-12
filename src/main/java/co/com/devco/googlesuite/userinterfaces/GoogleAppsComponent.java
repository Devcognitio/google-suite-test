package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Botón Google Apps").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Opción Google Translate").located(By.id("gb51"));
	public static final Target YOUTUBE = Target.the("Opción Youtube").located(By.id("gb36"));

}

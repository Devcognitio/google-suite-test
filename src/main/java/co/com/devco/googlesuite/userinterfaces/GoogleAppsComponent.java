package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleAppsComponent {
	
	public static final Target GOOGLE_APPS = Target.the("Botón Google Apps").located(By.id("gbwa"));
	public static final Target GOOGLE_TRANSLATE = Target.the("Opción Google Translate").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[13]/a"));
	public static final Target YOUTUBE = Target.the("Opción Youtube").located(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[4]/a"));

}

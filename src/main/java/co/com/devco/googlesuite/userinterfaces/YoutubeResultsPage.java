package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YoutubeResultsPage {
	
	public static final Target LISTA_DE_VIDEOS = Target.the("Lista de videos").locatedBy("//div[@id='contents']/ytd-video-renderer");

}

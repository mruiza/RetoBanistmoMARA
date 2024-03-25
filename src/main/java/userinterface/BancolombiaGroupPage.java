package userinterface;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class BancolombiaGroupPage extends PageObject {
    public static final Target ENTENDIDO_BUTTON = Target.the("Button that allows you to click Understood on the privacy notice").
            located(By.id("btn-aceptar-cookies"));


    //a[contains(text(),'Productos')]


}

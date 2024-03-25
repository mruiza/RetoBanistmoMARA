package userinterface;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class BancolombiaGroupPage extends PageObject {
    public static final Target ENTENDIDO_BUTTON = Target.the("Button that allows you to click Understood on the privacy notice").
            located(By.id("btn-aceptar-cookies"));
    public static final Target PRODUCTS_AND_SERVICES_BUTTON = Target.the("Button that shows you the options services and products").
            located(By.xpath("//a[contains(text(),'Productos')]"));
    public static final Target LOANS_LINK = Target.the("Link that shows you the loans information").
            located(By.xpath("//a[contains(text(),'Préstamos')]"));
    public static final Target LOANS_CAR_AND_MOTORCYCLE_LINK = Target.the("Link that shows you the loans of cars and motorcycle information").
            located(By.xpath("//a[contains(text(),'Préstamos de Auto y Moto')]"));
    public static final Target RATES_AND_FEES_LINK = Target.the("Link that shows you the rates and fees information").
            located(By.xpath("//a[contains(text(),'Tasas y tarifas')]"));
    public static final Target PROHIBITIONS_PDF_BTN = Target.the("Button for download prohibitions PDF").
            located(By.xpath("//div[@id=\"tab4\"]//a[contains(@href,'ProhibicionesSuperIntendenciaDeBancosSIB')]"));





    //a[contains(text(),'Tasas y tarifas')]










}

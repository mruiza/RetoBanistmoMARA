package tasks;

import interactions.GoToTheWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static userinterface.BancolombiaGroupPage.*;

public class Download implements Task {

    public static Download thePDFProhibitions() {
        return Tasks.instrumented(Download.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ENTENDIDO_BUTTON),
                Click.on(PRODUCTS_AND_SERVICES_BUTTON),
                Click.on(LOANS_LINK),
                Click.on(LOANS_CAR_AND_MOTORCYCLE_LINK),
                Click.on(RATES_AND_FEES_LINK),
                Click.on(PROHIBITIONS_PDF_BTN),
                GoToTheWindow.number()
        );
    }
}
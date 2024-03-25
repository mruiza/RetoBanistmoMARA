package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
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
                Click.on(ENTENDIDO_BUTTON)

        );
    }
}

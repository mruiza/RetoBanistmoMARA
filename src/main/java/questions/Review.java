package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.nio.charset.Charset;

public class Review implements Question<Boolean>{

    public String title;
    public Review(String title) {
        this.title = title;
    }

    public static Review toThePDF(String prohibitions) {
        return new Review(prohibitions);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String url = Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl();
        String respuesta = "";
        boolean flag = false;
        try {
            byte[] bytesResponse = url.getBytes(Charset.forName("UTF8"));
            respuesta = new String(bytesResponse, "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (respuesta.contains(title)) {
            flag = true;
        }
        return flag;
    }
}

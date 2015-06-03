package controllers;

import com.avaje.ebean.Ebean;
import models.Anuncio;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        List<Anuncio> anuncios = Ebean.createQuery(Anuncio.class).findList();
        return ok(index.render(anuncios));
    }

    public static Result sobre() {
        return ok(views.html.sobre.render(
                "Sobre o Encontro Musical",
                play.core.PlayVersion.current()
        ));
    }

    public static Result formNovoAnuncio() {
        Form<Anuncio> form = Form.form(Anuncio.class);
        return ok(formNovoAnuncio.render(form));
    }

    public static Result novoAnuncio() {
        Form<Anuncio> form = Form.form(Anuncio.class).bindFromRequest();

        if (form.hasErrors()) {
            return badRequest(formNovoAnuncio.render(form));
        }

        Anuncio anuncio = form.get();
        anuncio.save();
        return redirect(routes.Application.index());
    }
}

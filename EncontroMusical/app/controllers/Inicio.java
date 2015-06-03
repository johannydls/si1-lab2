package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Johanny on 22/05/2015.
 */
public class Inicio extends Controller {

    public static Result index() {
        return ok(views.html.inicio.render());
    }
}

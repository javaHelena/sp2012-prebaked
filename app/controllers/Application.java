package controllers;

import java.util.Arrays;

import models.Comment;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    static Form<Comment> commentForm = form(Comment.class);

    public static Result index() {
        return ok(index.render(Comment.all(), commentForm));
    }
    
    public static Result add() {
        Form<Comment> filledForm = commentForm.bindFromRequest();
        if (filledForm.hasErrors()) {
            return badRequest(index.render(Comment.all(), filledForm));
        } else {
            filledForm.get().save();
            
            return redirect(routes.Application.index());
        }
    }

}
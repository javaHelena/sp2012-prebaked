package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Comment extends Model {
    
    @Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    @Constraints.Required
    public String text;
    
    private static final Finder<Long, Comment> find = new Finder<Long, Comment>(Long.class, Comment.class);
    
    public static List<Comment> all() {
        return find.where().orderBy("id desc").findList();
    }
}

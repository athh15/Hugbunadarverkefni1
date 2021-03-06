package project.persistence.entities;

import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @SafeHtml
    private String name;
    @SafeHtml
    private String userOwner;



    public Team(){
    }

    public Team(Long id, String name, String userOwner){
        this.id = id;
        this.name = name;
        this.userOwner = userOwner;

        //this.player = player;
    }

    public Long getId(){ return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public String getUserOwner() { return userOwner; }

    public void setUserOwner(String userOwner) {this.userOwner = userOwner;}


    //public Player getPlayer() {return player;}

    //public void setPlayer(Player player) {this.player = player;}
    // This is for easier debug.
    @Override
    public String toString() {
        return String.format(
                "Team [id=%s, name=%s, userOwner=%s]",
                id, name, userOwner);
    }

}

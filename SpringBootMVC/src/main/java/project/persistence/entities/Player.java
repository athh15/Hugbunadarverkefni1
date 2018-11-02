package project.persistence.entities;

import javax.persistence.*;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static javax.persistence.GenerationType.*;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Long playerNr;
    private String name;
    private String playerPos;
    //private Team<Id> teamId;
    //private Player<Stats> PlayerStats


    public Player() {

    }

    public Player(Long id, String name, String playerPos, Long playerNr ) {
        this.id = id;
        this.name = name;
        this.playerPos = playerPos;
        this.playerNr = playerNr;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) { this.name = name;}

    public String getPlayerPos() { return playerPos;}

    public void setPlayerPos(String playerPos) { this.playerPos = playerPos;}

    public Long getPlayerNr() { return playerNr;}

    public void setPlayerNr(Long playerNr) { this.playerNr = playerNr;}


    // This is for easier debug.
    @Override
    public String toString() {
        return String.format(
                "Player[name=%s, playerPos=%s]",
                name,playerPos);
    }


}


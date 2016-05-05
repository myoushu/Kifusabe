package project.domain;

/**
 * Created by Dave on 5/4/2016.
 */
public class Player {
    private final int playerId;
    private final String userName;
    private final String playerName;

    public Player(int playerId, String userName, String playerName) {
        this.playerId = playerId;
        this.userName = userName;
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getUserName() {
        return userName;
    }

    public int getPlayerId() {
        return playerId;
    }
}

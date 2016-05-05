package project.domain;

/**
 * Created by Dave on 5/4/2016.
 */
public class Game {
    private final int gameId;
    private final int playerId;
    private final int playerTwoId;
    private final String playerOneColor;
    private final String playerTwoColor;
    private final float blackScore;
    private final float whiteScore;
    private final String result;
    private final int handicap;
    private final float komi;
    private final String boardSize;
    private final String dateTime;

    public Game(int gameId, int playerId, int playerTwoId, String playerOneColor, String playerTwoColor, float blackScore, float whiteScore, String result, int handicap, float komi, String boardSize, String dateTime) {
        this.gameId = gameId;
        this.playerId = playerId;
        this.playerTwoId = playerTwoId;
        this.playerOneColor = playerOneColor;
        this.playerTwoColor = playerTwoColor;
        this.blackScore = blackScore;
        this.whiteScore = whiteScore;
        this.result = result;
        this.handicap = handicap;
        this.komi = komi;
        this.boardSize = boardSize;
        this.dateTime = dateTime;
    }

    public int getGameId() {
        return gameId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getPlayerTwoId() {
        return playerTwoId;
    }

    public String getPlayerOneColor() {
        return playerOneColor;
    }

    public String getPlayerTwoColor() {
        return playerTwoColor;
    }

    public float getBlackScore() {
        return blackScore;
    }

    public float getWhiteScore() {
        return whiteScore;
    }

    public String getResult() {
        return result;
    }

    public int getHandicap() {
        return handicap;
    }

    public float getKomi() {
        return komi;
    }

    public String getBoardSize() {
        return boardSize;
    }

    public String getDateTime() {
        return dateTime;
    }
}

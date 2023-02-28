package domain;

public class Player {

    private final PlayerName playerName;

    public Player(final String playerName) {
        this.playerName = new PlayerName(playerName);
    }

    public int getLengthOfPlayerName() {
        return this.playerName.getLengthOfName();
    }

    public String getName() {
        return this.playerName.getName();
    }
}
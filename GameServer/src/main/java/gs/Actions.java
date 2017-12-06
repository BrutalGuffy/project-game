package gs;

public class Actions {
    private static String player;
    private static String action;
    private static String direction;

    public static String get_player() {
        return player;
    }

    public static String get_action() {
        return action;
    }

    public static String get_direction() {
        return direction;
    }

    public static void set_player (String player_) {
        player = player_;
    }

    public static void set_action (String action_) {
        action = action_;
    }

    public static void set_direction (String deriction_) {
        direction = deriction_;
    }

    @Override
    public String toString() {
        return "Player:" + player + "Action:" + action + "Direction:" + direction;
    }
}

package mazerunner;

//store directions in enum to avoid magic numbers
public enum Direction {
    UP, DOWN, LEFT, RIGHT;

    public Direction turn() 
    {
        switch (this) 
        {
            case UP: return RIGHT;
            case RIGHT: return DOWN;
            case DOWN: return LEFT;
            case LEFT: return UP;
            default: System.err.println("invalid direction");
        }
                return null;
    }
}

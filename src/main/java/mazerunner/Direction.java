package mazerunner;

//store directions in enum to avoid magic numbers
public enum Direction {
    UP, DOWN, LEFT, RIGHTn;

    public Direction changeRight() 
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

    public Direction changeLeft() 
    {
        switch (this) 
        {
            case UP: return LEFT;
            case RIGHT: return UP;
            case DOWN: return RIGHT;
            case LEFT: return DOWN;
            default: System.err.println("invalid direction");
        }
                return null;
    }

    
}

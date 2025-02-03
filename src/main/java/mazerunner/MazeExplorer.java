package mazerunner;

public class MazeExplorer
{
    //x and y positions
    private int x;
    private int y;

    Direction currentDirection; 

    public MazeExplorer()
    {
        this.x = 0;
        this.y = 0;
        this.currentDirection = Direction.RIGHT; //start facing RIGHT
    }

    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void move()
    {
        switch (this.currentDirection)
    {
        case LEFT:
            x--;  //move left 
            break;        
        case RIGHT:
            x++;  //move right 
            break;
        case UP:
            y--;  //move up 
            break;
        case DOWN:
            y++;  //move down 
            break;
    }
    }

    public void turnRight() 
    {
        currentDirection = currentDirection.changeRight();
        System.out.println(currentDirection);
    }

    public void turnLeft() 
    {
        currentDirection = currentDirection.changeLeft();
        System.out.println(currentDirection);
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getDirectionX()
{
    switch (currentDirection)
    {
        case LEFT: return -1;  // Moving left decreases X
        case RIGHT: return 1;  // Moving right increases X
        default: return 0;     // No change in X for UP/DOWN
    }
}

public int getDirectionY()
{
    switch (currentDirection)
    {
        case UP: return -1;   // Moving up decreases Y
        case DOWN: return 1;  // Moving down increases Y
        default: return 0;    // No change in Y for LEFT/RIGHT
    }
}
}

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

    public void start(int y)
    {
        this.y = y;
    }

    public void move()
    {
        switch (currentDirection)
        {
            case LEFT:
                x--;
                break;        
            case RIGHT:
                x++;
                break;
            case UP:
                y--;
                break;
            case DOWN:
                y++;
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
}

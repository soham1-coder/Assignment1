package mazerunner;

public class MazeExplorer
{
    //x and y positions
    private int x;
    private int y;

    Direction currentDirection; 
    Maze maze;

    public MazeExplorer(Maze maze)
    {
        this.x = 0;
        this.y = 0;
        this.currentDirection = Direction.RIGHT; //start facing RIGHT
        //this.y = maze.findEntrance(); //sets starting y position to entrance
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

    public void turn() 
    {
        currentDirection = currentDirection.turn();
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

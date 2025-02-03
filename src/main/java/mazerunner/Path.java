package mazerunner;

public class Path
{
    
    private String path;

    public Path()
    {
        path = "";
    }

    public void addMovement(char movement) 
    {
        path += movement;
    }

    public void printPath()
    {
        System.out.println(path);
    }
}

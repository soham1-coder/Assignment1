package mazerunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Maze 
{
    private ArrayList<char[]> maze; //declares the maze in an ArrayList of character arrays

    public Maze(String filePath) throws IOException {
        maze = new ArrayList<>(); //initializes the ArrayList
        loadMaze(filePath);
    }

    public Boolean wallCheck(int x, int y)
    {
        return maze.get(x)[y] == '#';
    } 

    public void loadMaze(String filePath) throws IOException
    {
  
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                maze.add(line.toCharArray()); //converts the line to char array and adds to list
            }
        }
    }

    public int findEntrance()
    {
        
        for (int i = 0; i < maze.size(); i++) 
        {
            if (maze.get(i)[0] == ' ') //checks the first column of every row for a space
            {
                return i; //returns the row with the entrance
            }
        }
        return 0;
    }

    public ArrayList<char[]> getMaze()
    {
        return maze;
    }

    public void printMaze()
    {
        for (char[] row : maze) 
        { 
            for (char cell : row)
            {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}

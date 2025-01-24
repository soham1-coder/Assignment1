package mazerunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Maze 
{
    private ArrayList<char[]> maze; //stores the maze in an ArrayList of character arrays

    public void loadMaze(String filePath) throws IOException
    {
        maze = new ArrayList<>(); //initializes the ArrayList

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
        {
            String line;
            while ((line = reader.readLine()) != null) {
                maze.add(line.toCharArray()); //converts the line to char array and adds to list
            }
        }
    }


    public void buildMaze()
    {



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

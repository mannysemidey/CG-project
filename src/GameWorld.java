//TODO: Add more pixelTypes. Update ELEMENT_COUNT

//Class responsible for managing game world objects
public class GameWorld
{
    //Map of all the pixels on-screen
    //Send this to user interface component to update user-display
    //2Darray indices represent (x,y) coordinates of each pixels
    final int PIXEL_MAP_HEIGHT = 500;
    final int PIXEL_MAP_WIDTH = 500;
    Particle[][] pixelMap;
    
    //Associates an element name with an array index.
    //Determines name of particle on pixelMap where
    //pixelMap's stored integer represents an index in the pixelType array
    final int ELEMENT_COUNT = 3;
    String[] pixelNameList = new String[ELEMENT_COUNT];
    
    
    //Boolean variables to keep track of mouse operations by user
    boolean mouseIsDown;
    boolean mouseIsUp;
    boolean mouseClicked;
    
    //Default constructor
    public GameWorld()
    {
        //Initializes pixelMap with "Nothing" in all indices
        pixelMap = new Particle[PIXEL_MAP_WIDTH][PIXEL_MAP_HEIGHT];
        for(int iY = 0; iY < PIXEL_MAP_HEIGHT; iY++){
            for(int iX = 0; iX < PIXEL_MAP_WIDTH; iX++){
                pixelMap[iX][iY] = new Particle("Nothing", "Black", true, iX, iY);
            }
        }
        
        //Initializes pixelType with every element to be used in-game
        pixelNameList[0] = "Nothing";
        pixelNameList[1] = "Sand";
        pixelNameList[2] = "Wall";
        
    }
    
    //Assesses the situation and determines the next course of action for the game
    //We must find a way to call this repeatedly during gamepay
    public void update(){
        
    }
      
}
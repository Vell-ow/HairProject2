/**
 * fish are friends, not food
 * 
 * Donovan Birch
 * 4/20/17
 * death to the batterwitch
 */

public class Fish
{
    private int hungry;
    
    public static final int NOT_HUNGRY = 0;
    public static final int SOMEWHAT_HUNGRY = 1;
    public static final int VERY_HUNGRY = 1;
    
    public void eat()
    {
      hungry = NOT_HUNGRY  ;
    }
    
    public void move()
    {
        if (hungry < VERY_HUNGRY)
        {
            hungry++;
        }
        
    }
    
    public static void main(String[] args)
    {
        Fish fish = new Fish();
        fish.eat();
        fish.move();
    }
}



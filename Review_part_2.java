
/**
 * Write a description of class Review_part_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review_part_2
{
    private int price = 120;
    public void checkPrice(){
    if(price >100)
    {
        System.out.println("Expensive");
    }else
    {
        System.out.println("Cheap");
    }
    }
        public void checkPrice2(){
        System.out.println(price>100 ? "Expensive" : "Cheap");
    }
    public static void help(){
        System.out.println("Help info displaying");
    }
    public static void quit(){
        System.out.println("Leaving program");
    }
    public static void main(String[] args){
        String command = "help";
        if(command.equals("help")){
            help();
        }else if(command.equals("quit")){
            quit();
        }else{
            System.out.println("sorry I don't understand");
        }
    }
    
    
    
    
    
    
    
    
    
    
}
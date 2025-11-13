import java.util.ArrayList;
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
        switch (command) {
            case "help":
                help();
                break;
            case "quit":
                quit();
                break;
            default:
                System.out.println("sorry I don't understand");
                break;
        }
    }
    
    public void printNumbers(){
        int i = 1;
        while(i <=10)
        {
            System.out.println(i);
            i++;
        }
    }
    
    public void printNumbers2()
    {
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
    
    public void printEvenNumbers(){
        for(int i = 0; i <= 10; i = i+2)
        {
            System.out.println(i);
        }
    }
    
        public void printOddNumbers(){
        for(int i = 1; i <= 100; i = i+2)
        {
            System.out.println(i);
        }
    }
    
    public void evenNumbersPrint(int a, int b){
        for(int i = a; i <= b; i = i+2){
            System.out.println(i);
        }
    }
    
    public void collectionNumbers(int a, int b){
        ArrayList<Integer> numbers = new ArrayList<>();
        
        for(int i=a; i <= b; i++){
            if(i % 2==0){
                numbers.add(i);
            }
            System.out.println(numbers);
        }
    }
    
    public boolean findNumbers(ArrayList<Integer> list, int num){
        return list.contains(num);
    }
    
    public void removeBelow(ArrayList<Integer> list, int limit) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < limit) {
                list.remove(i);
            }
        }
    }

    }
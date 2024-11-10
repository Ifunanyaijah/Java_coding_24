public class Main {
  public static void main (String[] args) {
        int age = 5;
        if (age>=45){
            System.out.println("ew! you're old");
        } 
        else if (age>=18){
            System.out.println("you can vote! yay!!");
        } 
        else{
            System.out.println("go to your room, kiddo!");
        }
          //switching variables//
    
      String a = "apple";
    String b = "ball";
    String temp;
    
    temp = a;
    a = b;
    b =temp;
    
    System.out.println("a=" +a);
    System.out.println("b=" +b);
    
    /*arrays*/
    String[] food = {"yam", "beans", "reeds"};
    for (int i=0; i<food.length; i++) {
        System.out.println(food[i]);
    }
    
    String day = "monday";
    switch (day) {
        case "sunday": System.out.println("have some rice, bitch!");
        break;
        case "monday": System.out.println("go to work/school, bitch!");
        break;
          case "tuesday": System.out.println("no lockdown today, bitch!");
        break;  
        case "wednesday": System.out.println("happy wedin's day bitch!");
        break;
          case "thursday": System.out.println("Thor's day, bitch!");
        break; 
        case "friday": System.out.println("TGIF, bitch!");
        break;
        case "saturday": System.out.println("wash ya clothes, bitch!");
        break;
        default: System.out.println("not today, satan!");
    }
    
    for (i=5; i<=0; i=--){
        System.out.println(i);
    }
    System.out.println("ROCKET LAUNCH");
    
    }
   
   
   
   
        
  
}
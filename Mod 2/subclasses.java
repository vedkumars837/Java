class Cricketers {
    String no() {
        System.out.println("Player jersey number is: ");
        return "Unknown";
    }
    
}

class rohit extends Cricketers{
    String odi(){
        System.out.println("45");
        return "45";
    }
}

class virat extends Cricketers{
    String odi18(){
        System.out.println("18");
        return "18";
    }
}


public class subclasses{
    public static void main(String[] args){
        rohit r = new rohit();
        System.out.println(r.no() + " " + r.odi() );

        virat v = new virat();
        System.out.println(v.no() + " " + v.odi18() );
    }
}
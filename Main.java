public class Main{
    public static void main(String[] args){
        int a = (int) (Math.random()*10);
        double b = Math.random()*10.0;
        boolean c = false;
        if (a < b) c = true;
        final String output = "It is " + c + " that a is less than b";
        System.out.println(output);
    }
}
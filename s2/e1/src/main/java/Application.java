public class Application{
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance("DANIEL");
        Singleton singleton2 = Singleton.getInstance("MALDONADO");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}
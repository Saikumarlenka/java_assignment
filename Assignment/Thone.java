public class Thone extends Exception {
    public Thone(String message){
        super(message);
        System.out.println("Exception is thrown");
    }


    public static void main(String[] args) {
        try{
            
            throw new Thone("Insufficent ballence");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}


public class CommandLineArguments {

    public static void main(String[] args) {
        
        if (args.length<1){
            System.out.println("Enter number through command line arguements");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int length = 10;

        if (args.length>1){
            length = Integer.parseInt(args[1]);

        }

        for (int i = 1; i<=length; i++){

        System.out.printf("%d x %d = %d%n", number,i, number * i);
        }
    }
    
}
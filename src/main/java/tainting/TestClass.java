package tainting;

public class TestClass {

    String fieldVariableCommand="ls";
    public void defineAndExecuteCommand() {
        String localVariableCommand="ls";   // String literal inferred as Untainted
        ProcessBuilder pb = new ProcessBuilder(localVariableCommand);
        ProcessBuilder pb1 = new ProcessBuilder(fieldVariableCommand);
    }

    public String performOperation(String param) {
        // Perform operations on param
        param=param+" -l";
        return param;
    }

}


// package tainting;

// import java.util.Scanner;

// public class TestClass {

//     @SuppressWarnings("ucrtainting")
//     public void executeCommandFromUser() {
//         Scanner sc=new Scanner(System.in);
//         String command=sc.nextLine();
//         ProcessBuilder pb = new ProcessBuilder(command);
//         try {
//             Process p = pb.start();
//         } catch (Exception e) {
//             //handle exception
//         }
//     }
// }


















// package tainting;

// public class TestClass {

//     String fieldVariableCommand="ls";
//     public void defineAndExecuteCommand() {
//         String localVariableCommand="ls";   // String literal inferred as Untainted
//         ProcessBuilder pb = new ProcessBuilder(command);
//         ProcessBuilder pb1 = new ProcessBuilder(testCommand);
//     }

//     public String performOperation(String param) {
//         // Perform operations on param
//         param=param+" -l";
//         return param;
//     }

// }


// package tainting;
// import java.io.IOException;
// import edu.ucr.cs.riple.taint.ucrtainting.qual.RUntainted;

// public class TestClass {

//     public void defineAndExecuteCommand() {
//         String command="ls";   // String literal inferred as Untainted
//         command = performOperation(command);
//         executeCommand(command);
//     }

//     public String performOperation(String param) {
//         // Perform operations on param
//         param=param+" -l";
//         return param;
//     }

//     public void executeCommand(@RUntainted String command) {
//         ProcessBuilder pb = new ProcessBuilder(command);
//         try {
//             Process p = pb.start();
//         } catch (IOException e) {
//             // Do nothing
//         }
//     }
// }
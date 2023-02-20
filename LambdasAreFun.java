/*
 * Lambdas are a means to run methods using code as arguments, as opposed to variables.
 * You need a functional interface, and a proper lambda call. No class needs to 'implement' anything
 */
import java.util.ArrayList;


class LambdasAreFun {
    public static void main(String[] args) {
        System.out.println();
        
        // initialize instances
        Person person = new Person();
        Person guitarist = new Guitarist();
        Person cinemaMaster = new CinemaMaster();
        Person eSporter = new ESporter();


        // add them to a list
        ArrayList <Person> players = new ArrayList<>();
        players.add(person);
        players.add(guitarist);
        players.add(cinemaMaster);
        players.add(eSporter);

        // mandatory modules are the parameter name, arrow and body. use {} with several expressions
        IPlayer lambda = (x) -> System.out.println(x.getMessage());
        /*
         * Notice how we HAVE to use a getter instead of calling the variable directly?
         * That's because though the children of Person might override the variable, variables
         * are bound at compile time, and thus a reference of Person will only look through
         * the instance's Person oject for variables.
         * 
         * Methods are looked at by the JRE, who realizes this child seeks to break away from
         * its parent's ways, and thus accepts their implementation of the method, which now
         * calls on the child's.
         */

        for (Person y : players)
        lambda.Play(y);
        
        System.out.println();
    }
}
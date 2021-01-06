package solver;


import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.*;;

//import org.testng.mustache.Model;
//import org.testng.reporters.jq.Model;;

public class SolverInt {
	
	public static void main(String[] args) {
        // 1. Create a Model
        Model model = new Model("my first problem");
        // 2. Create variables
        IntVar x = model.intVar("X", 0, 5);                 // x in [0,5]
        IntVar y = model.intVar("Y", new int[]{2, 4, 3, 8});   // y in {2, 4, 3, 8}
        // 3. Post constraints
        model.arithm(x, "-", y, "<", -1).post(); // x - y < -1
        model.arithm(x, "+", y, "=", 6).post(); // x + y = 6
        
        // 4. Solve the problem
        model.getSolver().solve();
        
        model.getSolver().solve();
        // 5. Print the solution
        System.out.println(x); // Prints X = 2
        System.out.println(y); // Prints Y = 4
    }
}

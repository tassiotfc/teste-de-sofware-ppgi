package solver;


import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.*;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;;

//import org.testng.mustache.Model;
//import org.testng.reporters.jq.Model;;

public class SolverBoolean {
	
	public static void main(String[] args) {
		Model model = new Model("my first problem");
		// 2. Create variables
		BoolVar A = model.boolVar("A");
		BoolVar B = model.boolVar("B");
		BoolVar C = model.boolVar("C");
		BoolVar D = model.boolVar("D");
		// 3. Post constraints
		// (A or ~B) ^ (A or ~C) ^ (~B or ~C) ^ (~C ∨ ~D)
		model.addClauses(
		 LogOp.and(
		 LogOp.or(A, B.not()),
		 LogOp.or(A, C.not()),
		 LogOp.or(B.not(), C.not()),
		 LogOp.or(C.not(), D.not())
		 )
		);
		// 4. Solve the problem
		model.getSolver().solve();
		// 5. Print the solution
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
    }
}

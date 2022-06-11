import java.util.*;

public class QuadraticEquationSolver {
    public double[] solve(double a, double b, double c) {
        double[] empty = {};
        double[] oneRoot = new double[1];
        double discriminant = b * b - 4 * a * c;
        double[] twoRoots = new double[2];
        if (discriminant > 0) {
            double discriminantBiggerZero1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            twoRoots[0] = discriminantBiggerZero1;
            double discriminantBiggerZero2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            twoRoots[1] = discriminantBiggerZero2;
            return twoRoots;
        } else if (discriminant == 0) {
            double discriminantZero = -b / (2 * a);
            oneRoot[0] = discriminantZero ;
            return oneRoot;
        } else {
            return empty;
        }
    }
        public static void main (String[]args){
            QuadraticEquationSolver ship = new QuadraticEquationSolver();
            System.out.println(ship.solve(6, -96, 384));
        }
    }




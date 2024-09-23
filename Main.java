public class Main
{
  public static void main(String[] args)
  {
    double someDist = distFormula(1,1,2,2);
    System.out.println(someDist);
    double someQuad = quadFormulaP(3, 5, 1);
    System.out.println(someQuad);
    double otherQuad = quadFormulaN(3, 5, 1);
    System.out.println(someQuad);
  }

  // Implement distance formula method here
  public static double distFormula(double x1, double  y1, double x2, double y2)
  {
    //Math.sqrt()
    double dist = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    return dist;
  }

  // implement one of your quadratic formula methods here
  public static double quadFormulaP(double a, double b, double c)
  {
    double SquareRoot = Math.sqrt((b * b) - (4 * a * c));
    return (-b+ SquareRoot) / (2*a);
  }

  // implement the other quadratic formula here
    public static double quadFormulaN(double a, double b, double c)
  {
    double mySquareRoot = Math.sqrt((b * b) - (4 * a * c));
    return (-b - mySquareRoot) / (2*a);
  }
}

public class Main
{
    public static void main(String[] args)
    {
        double springCost = 100.12;
        double summerCost = 98.83;
        double winterCost = 175.76;
        double fallCost = 125.25;
        double yearlyCost = 0;

        System.out.println(" Spring Cost is " + springCost);
        System.out.println(" Summer Cost is " + summerCost);
        System.out.println(" Winter Cost is " + winterCost);
        System.out.println(" Fall Cost is " + fallCost);

        yearlyCost = springCost + summerCost + winterCost + fallCost;

        System.out.println(" The yearly cost is "+ yearlyCost );
    }
}
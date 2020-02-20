package Epam.interest;

public interface Functions {
	public abstract double simpleInterest(double principleAmount, double time, double rateOfInterest);

    public abstract double compoundInterest(double principleAmount, double time, double rateOfInterest);
}

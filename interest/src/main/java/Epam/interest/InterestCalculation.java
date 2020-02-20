package Epam.interest;

public class InterestCalculation  implements Functions{
	public double simpleInterest(double principleAmount, double time, double rateOfInterest) {

        return (principleAmount * time * rateOfInterest) / 100.0;
    }

    public double compoundInterest(double principleAmount, double time, double rateOfInterest) {

        return principleAmount * Math.pow((1+rateOfInterest/100), time);
    }
}

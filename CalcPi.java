// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		double sum=0;
		int sign=1;
		int denominator=1;
		int i;
		for(i=0;i<n;i++)
		{
			sum=sum+((double)sign/denominator);
			sign=-1*sign;
			denominator=denominator+2;
		}
		double piApprox=sum*4;
		System.out.println("pi according to Java: "+Math.PI);
		System.out.println("pi, approximated: "+piApprox);
	}
}

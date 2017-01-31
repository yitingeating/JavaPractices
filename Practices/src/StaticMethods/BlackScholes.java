package StaticMethods;

import sedgewick.StdOut;

public class BlackScholes {
	public static double pdf(double x) {
        return Math.exp(-x*x / 2) / Math.sqrt(2 * Math.PI);
    }

    // return pdf(x, mu, signma) = Gaussian pdf with mean mu and stddev sigma
    public static double pdf(double x, double mu, double sigma) {
        return pdf((x - mu) / sigma) / sigma;
    }

    // return cdf(z) = standard Gaussian cdf using Taylor approximation
    public static double cdf(double z) {
        if (z < -8.0) return 0.0;
        if (z >  8.0) return 1.0;
        double sum = 0.0, term = z;
        for (int i = 3; sum + term != sum; i += 2) {
            sum  = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + sum * pdf(z);
    }
	public static double val(double s, double x, double r, double sigma, double t){
		double a = (Math.log(s/x) + (r + sigma * sigma/2) * t) / (sigma * Math.sqrt(t));
        double b = a - sigma * Math.sqrt(t);
        return s * pdf(a) - x * Math.exp(-r * t) * pdf(b);
	}

	public static void main(String[] args) {
		double s     = Double.parseDouble(args[0]);
        double x     = Double.parseDouble(args[1]);
        double r     = Double.parseDouble(args[2]);
        double sigma = Double.parseDouble(args[3]);
        double t     = Double.parseDouble(args[4]);
        StdOut.println(val(s, x, r, sigma, t));
    }
		// TODO Auto-generated method stub

	}



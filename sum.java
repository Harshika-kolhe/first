public class Main
{
	public static void main(String[] args) {
	    int a=5;
	    int b=6;
		System.out.println("Sum = "+sum(a,b));
		System.out.println("subtraction = "+subtract(a,b));
		System.out.println("subtraction = "+sqr(a));
	}

    public static int sum(int a,int b){
        return (a+b);
    }
    
    public static int subtract(int a,int b){
        return(a-b);
    }
    public static int sqr(int a){
        return(a*a);
    }
    
}

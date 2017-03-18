
public class TestCases {
	public static long fib(int n) {
	    if(n <= 1) {
	        return n;
	    } else {
	        return fib(n - 1) + fib(n - 2);
	    }
	}
	
	public static long factorial(long n) { 
	    if (n == 1) return 1; 
	    return n * factorial(n-1); 
	} 
	
	public static double harmonic(int n) {
	    if(n == 1) {
	        return 1.0;
	    } else {
	        return (1.0 / n) + harmonic(n - 1);
	    }
	}
	
	public static boolean isOdd(int n) {
	  if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
	  return (n == 0) ? false : isEven(n-1);
	}
		     
	public static boolean isEven(int n) {
		if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
		return (n == 0) ? true : isOdd(n-1);
	}
	
	static class List {
		Object value;
		List next;
		
		List(Object a) {
			this.value=a;
		}
		
		int length() {
			if(next==null)
				return 0;
			else return this.next.length()+1;
		}
		
		void append(Object a) {
			if(next==null)
				this.next=new List(a);
			else this.next.append(a);
		}
		
		void append(String a) {
			if(next==null)
				this.next=new List(a);
			else this.next.append((Object) a);
		}
		
		@Override public String toString() {
			if(next==null)
				return value.toString();
			else return value.toString()+", "+next.toString();
		}
	}

	
	public static long nonRecursive() {return factorial(2);}
	
	public static void main(String[] args) {
		int v = 5;
		System.out.println(TestCases.nonRecursive());
		System.out.println(TestCases.factorial(v));
		System.out.println(TestCases.fib(v));
		System.out.println(TestCases.harmonic(v));
		System.out.println(TestCases.isEven(v));
		System.out.println(TestCases.isOdd(v));
		List res = new List(v);
		for(int i = v-1; i >0; i--)
			res.append(i);
		System.out.println(res.toString());
	}
	
}

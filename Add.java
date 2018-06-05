public class Add{
			public static void main(String[] args){
				int a = 2,b = 2,c = 5,d = 12,e = 1,f = 1;
				while(d!=0 ){
					f *=b;
					--d;
				}
				while(c!=0){
					e *=a;
					--c;
				}
				System.out.println("Output is "+ e+"+"+(2*a*b)+"+"+f);	
			}
}
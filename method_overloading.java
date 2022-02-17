class method_overloading {

    int addition(){

        int a = 10;
        int b = 25;
        return a+b;
    }

    int addition(int a , int b){
        return a + b;
    }

    int addition(int sum, int a, int b){
        	sum= a + b;
	return sum;
    }

    public static void main(String[] args) {
        
        int sum,a = 15,b = 65;
        method_overloading obj = new method_overloading();
        System.out.println("Addition by addition() function : "+(obj.addition()));
        System.out.println("Addition with 2 arguments : "+(obj.addition(a,b)));
        a = 12;
        b = 16;
        System.out.println("Addition with 3 arguments : "+   obj.addition(0,a,b));
    }
}
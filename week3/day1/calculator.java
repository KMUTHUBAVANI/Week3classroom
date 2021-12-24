package week3.day1;

public class calculator {
	 public static void add(int num1,int num2) {
		 System.out.println(num1+num2);
			 }
	 public static void add(int num1,int num2,int num3) {
		 System.out.println(num1+num2+num3);
			 }
	 public static void sub(int num1,int num2) {
		 System.out.println(num1-num2);
			 }
	 public static void sub(double num1,double num2) {
		 System.out.println(num1-num2);
			 }
	 public static void div(int num1,int num2) {
		 System.out.println(num1/num2);
			 }
	 public static void div(double num1,double num2) {
		 System.out.println(num1/num2);
			 }
		public static void main(String[] args) {
			calculator cu =new calculator();
			cu.add(1, 2);
			cu.add(1, 2,3);
			cu.sub(5,4);
			cu.sub(6.0, 5.0);
			cu.div(5,4);
			cu.div(6.0, 5.0);
		}

}

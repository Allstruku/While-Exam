
public class whileExam {
	public static void main(String[] args) {
		int i = 0;
			while(i < 10) {
//				// As long as the condition after the while statement remains true, the block of code within the while statement
//				// will continue to run.
				System.out.println(i);
				i ++;
//				// by placing the i ++; code in the while statement, the value of i will continue to increase by 1, ultimately 
//				// causing the condition after the while statement to become false after i becomes 10.
			}
//			while(true) {
//				System.out.println(i);
//				// by placing a true in the position of the condition after the while statement, the condition will indefinitely
//				// be met, causing the block of code within the whle statement to infinitely run.
//			
//			}
			int total = 0;
			i = 1;
			while(i <= 100) {
				total = total + i;
				++ i;
			}
			System.out.println(total);
	}
}

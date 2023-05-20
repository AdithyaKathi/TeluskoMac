*************************************  Programmer : Adithya Kathi ******************************************/
import java.util.*;
public class Pascal
{
    // It Computes Pascal Triangle In Memoized Approach	
    public static List<List<Integer>> memoizedPascal(int num){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row , pre = null;
        for(int i = 0; i<num; i++){
            row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                // Since Start and End Are Always '1' For Any Row
                if(j ==0 || j == i) row.add(1);
                // Using Precomputed Values Which are From Previous Row
                else row.add(pre.get(j-1)+pre.get(j));
            }
                
                pre = row;
                // Assigning Current Row To Previous As it Becomes Previous For The Next Row
                res.add(row);
                // Ultimately Stroing Each Row In The Result List
        }
        return res;
    }
	
    // It Computes Pascal Triangle In Iterative Approach	
    public static void iterPascal(int num){
          for (int i = 0; i < num; i++) {
                int number = 1;
                System.out.printf("%" + (num - i) * 2 + "s", ""); 
		// Printing spaces for alignment

                for (int j = 0; j <= i; j++){
                    System.out.printf("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
		// This Is The Best Of 3 Approaches That I've Tried
           }
     }
     
     // It Computes Pascal Triangle In Recursive Approach
     public static int calculatePascalValue(int row, int col){
        if(col == 0 || col == row){
            return 1;
        }else{
            return calculatePascalValue(row - 1,col - 1) + calculatePascalValue(row - 1,col);
        }
	     // S H O R T
	     // S I M P L E
	     // Y E T    I N S I G H T F U L
     }
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		// User Input
		int num = scan.nextInt();
		System.out.println("The Memoized Output : ");
		System.out.println();
		System.out.println("The Pascals Triangle is : ");
		List<List<Integer>> res = memoizedPascal(num);
		//  Printing Pascals Triangle
		for(int i = 0; i<res.size(); i++){
		    System.out.println(res.get(i).toString());
		    System.out.println();
		}
		
		System.out.println("The Iterative Output : ");
		System.out.println();
		iterPascal(num);
		System.out.println();
		System.out.println();
		System.out.println("The Recursive Approach : ");
		
		System.out.println("The Pascal's Triangle ");
		for (int i = 0; i <num; i++) {
                     for (int j = 0; j <= i; j++) {
                            System.out.print(calculatePascalValue(i, j) + " ");
                     }
                     System.out.println();
                }
	}
}

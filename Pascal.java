*************************************  Programmer : Adithya Kathi ******************************************/
import java.util.*;
public class Pascal
{
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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		// User Input
		int num = scan.nextInt();
		System.out.println("The Pascals Triangle is : ");
		List<List<Integer>> res = memoizedPascal(num);
		//  Printing Pascals Triangle
		for(int i = 0; i<res.size(); i++){
		    System.out.println(res.get(i).toString());
		    System.out.println();
		}
	}
}
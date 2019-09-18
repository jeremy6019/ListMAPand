package datastructure;

import java.util.Scanner;
import java.util.TreeSet;

public class LottoMain3 {

	public static void main(String[] args) {
				
		// ArrayList, LinkedList, stack  정렬 중복검사 해야
		// PriorityQueue, ArrayDeque 
		// HashSet, LinkedHashSet, TreeSet 중복검사 편하게 

		//저장하는 자료구조 객체 만들기 
		
		TreeSet<Integer> lotto 
		    = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		for(;lotto.size()  < 6;) {  //사이즈 검사방식 변경에 따라 변수i 삭제 
			// input에 정수 입력 받기 
		    System.out.printf("숫자 입력(1 ~ 45):");
		    int input = sc.nextInt();
		    
		    // 1 ~ 45 사이가 아니라면 다시 입력 (범위 검사) 
		    if(input < 1 || input > 45) {
		    	System.out.printf("1 - 45 사이의 숫자만 입력!!!\n");
//		    	i -=  1;  //삭제 
		    	continue; 
		    }
		        		    
		    // 데이터 삽입 여부를 r에 저장하면서 삽입  (유효성 검사방식 삭제 중복검사 로직 축소)   
		   boolean r = lotto.add(input);
		   //삽입에 실패 했다면 - 데이터 중복 
		   if(r == false) {
			   System.out.printf("중복된 데이터는 않됩니다!!\n");
//			   i -= 1;  //삭제 			
		   }
			   
		}
		
		// 우선 순위 큐는 poll을 출력하면 순서대로 출력 (출력방식 변경) 
		// TreeSet 은 데이터를 크기 순서대로 접근할 수 있는 방법을 가지고 
		// 있기 때문에 정렬을 할 필요가 없음 . 
		for( Integer temp : lotto) {
			System.out.printf("%d\t",temp);
		}
		
		sc.close();
		

	}

}

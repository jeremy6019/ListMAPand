package datastructure;

import java.util.PriorityQueue;
import java.util.Scanner;

public class LottoMain2 {

	public static void main(String[] args) {
				
		// ArrayList, LinkedList, stack 
		// PriorityQueue, ArrayDeque 
		// HashSet, LinkedHashSet, TreeSet
				
		//정수 6개를 저장하는 List 변경  
		PriorityQueue<Integer> lottoQueue 
		    = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 6; i += 1) {
			// input에 정수 입력 받기 
		    System.out.printf("숫자 입력(1 ~ 45):");
		    int input = sc.nextInt();
		    
		    // 1~45 사이가 아니라면 다시 입력 
		    if(input < 1 || input > 45) {
		    	System.out.printf("1 - 45 사이의 숫자만 입력!!!\n");
		    	i -=  1;
		    	continue; 
		    }
		    
		    // 중복 검사를 해서 통과하지 못하면 다시 입력 (중복검사 방식 변경)		   
		    int j = 0;
		    //큐를 순회하면서 동일한 데이터가 있으면 j = 1로 변경 
		    for(Integer temp : lottoQueue) {
		    	if(input == temp) {
		    		j = 1 ;
		    		break;
		    	}
		    }
		    // 중복된 데이터가 있으면 다시 입력받기 
		    if( j == 1 ) {
		    	System.out.printf("중복된 데이터는 안됩니다!!\n");
		    	i -= 1;
		    	continue;
		    }
		    		    
		    // 유효성 검사를 통과하면 데이터를 배열에 저장 (유효성 검사방식 변경) 
		    lottoQueue.add(input);
		    
		}
	    
		//우선 순위 큐는 poll을 출력하면 순서대로 출력 (출력방식 변경) 
		for( int i = 0; i < 6; i+=1) {
			System.out.printf("%d\t",
					lottoQueue.poll());
		}
		
		sc.close();
		

	}

}

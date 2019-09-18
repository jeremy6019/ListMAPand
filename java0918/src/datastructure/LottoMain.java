package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1-45까지의 숫자 6개를 중복없이 저장 
		// 어떤 자료 구조를 이용해서 저장하는 것이 가장 
		// 코드를 줄일 수 있는지 생각 
		// 동일한 자료형의 데이터를 여러 개 저장하는 자료구조
		
		// 최근에는 배열도 List로 취급 
		// 배열
		// ArrayList, LinkedList, stack 
		// PriorityQueue, ArrayDeque 
		// HashSet, LinkedHashSet, TreeSet
		
		//배열을 사용하는  경우 
		//정수 6개를 저장하는 배열 
		int[] lottoAr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		// 결과가 변하지 않는 자주 접근하는 속성이나 메소드의 결과는 
		// 지역변수에 저장하고 사용 
		int len = lottoAr.length; 
		
		for(int i = 0; i < len; i += 1) {
			// input에 정수 입력 받기 
		    System.out.printf("숫자 입력(1 ~ 45):");
		    int input = sc.nextInt();
		    
		    // 1~45 사이가 아니라면 다시 입력 
		    if(input < 1 || input > 45) {
		    	System.out.printf("1 - 45 사이의 숫자만 입력!!!\n");
		    	i -=  1;
		    	continue; 
		    }
		    
		    // 중복 검사를 해서 통과하지 못하면 다시 입력 
		    // 처음에는 할 필요가 없어서 i>0보다  클 때 
		    int j = 0;
		    if(i > 0) {
		        for(j=0; j<=i; j+=1) {
		        	if(input == lottoAr[j]) {
		        		break;
		        	}
		        }
		        // 반복문이 끝까지 수행되지 않았다면 
		        // break를 만나서 중단 
		        if(j != i+1 ) {
		        	System.out.printf("중복된 숫자는 안됩니다!!\n");
		        	i -= 1; 
		        	continue; 
		        }
		    }
		    		    
		    // 유효성 검사를 통과하면 데이터를 배열에 저장 
		    lottoAr[i] = input;
		    
		}
	
		
		// 데이터 정렬 - 전에는 직접 정렬했는데 
		// API메소드를 활용해 정렬 
		Arrays.sort(lottoAr);
		
		for(int temp : lottoAr) {
			System.out.printf("%3d\t", temp);
		}
		
		sc.close();
		

	}

}

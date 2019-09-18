package Mapandso;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		
		//Person클래스의 객체를 만들어서 데이터를 저장 
        Person person = new Person(); 
        person.setName("유관순");
        person.setAge(19);
        person.setJob("학생");
        
        //Person객체의 내용을 하나씩 출력 
        System.out.printf("이름:%s\n", person.getName());
        System.out.printf("나이:%d\n", person.getAge());
        System.out.printf("직업:%s\n", person.getJob());
        System.out.printf("\n");
        
        // Map에 데이터를 저장 
        Map<String, Object> map = 
        		new LinkedHashMap<String, Object>();
        map.put("이름", "리처드 스톨만");
        map.put("나이", 66);
        map.put("직업", "개발자");
        map.put("철학", "자유 소프트웨어는 자유이지 공짜는 아니다.");
        
        //모든 key를 전부 가져오기 
        Set<String> keyset = map.keySet();
        
        // 데이터 출력 -  map에 변화가 생겨도 이부분은 수정할 필요가 
        //없습니다. 
        //Apple은 데이터를  Map구조로 넘기는 것을 많이 합니다. 
        for(String key : keyset) {
        	System.out.printf(
        			"%s:%s\n", key, map.get(key));
        }
        
        
        
	}
}

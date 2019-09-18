package define;

public class API {

	/*
	 ** LIST 구조 
	 3. !!!Stack : java.util.stack - 클래스로 제공  
	 => LIFO(Last In First Out)형태의 자료 구조 : 마지막에 삽입한 데이터가 먼저 출력되는 자료구조 
	 => 삽입과 삭제가 Top이라는 포인터에서 수행 
	 => 삽입하는 동작을 push라고 하고 꺼내는 동작을 pop이라고 함 
	 => 메소드(함수)가 실행될 때 하나의 	Stack을 할당 받아서 실행되는 메모리의 자료 구조  
	 => 프로그램에서는 작업 내역을 저장하는 용도로 사용 하면 좋습니다. 
	      작업 취소를 할때 가장 가까이에 있는 작업을 취소하기 때문입니다. 
	 => peek는 가장 마지막 데이터를 지우지 않고 리턴하는 메소드  	 
	 
	 4. Queue: java.util.Queue - 인터페이스 
    => FIFO(First In First Out) 형태의 자료구조 : 먼저 삽입한 데이터가 먼저 출력되는 자료구조 
    => 삽입하는 동작을 push라고 하기도 하고 add라고 하기도 합니다. 삽입과  삭제가 반대 방향에서 수행됨 
    =>꺼내는 동작은 pop이나 peek를 이용합니다. 
    => java에서 java.util.Queue라는 인터페이스로 제공하고 이를 구현한 클래스로 LinedList와 
         PriorityQueue가 있습니다. 
    => 운영체제의 스케쥴링에 이용 (작업순서에 활용) 
    => 작업의 순서를 저장하는 용도로 사용, 공장 자동화 같은 곳에서 많이 사용합니다.   
       
       트리의 순회
       for(   ):  가운데 - 왼쪽 - 오른쪽 순서로 순회, 저장순서 알고 싶을 때 사용   
       poll: 왼쪽 - 가운데 - 오른쪽  순서로 순회, 크기 비교 알고 싶을 때 사용 
        
	 5. Deque  = ArrayDeque
   => 양쪽에서 삽입과 삭제를 할 수 있는 자료 구조 
   => 새로방향으로 나누면 Stack이 되고 가로방향으로 나누면 Queue가 됩니다. 
   =>java애서는 java.util.Deque라는 인터페이스로 제공하고 arrayDeque라는 클래스가 Deque를 
      implements한 클래스 입니다. 
   => 삽입하는 메소드가 2가지(앞에 삽입하는 메소드 - push와 뒤에 삽입하는 메소드- add)이고 
        꺼내는 메소드도 2가지(앞에서 꺼내는 메소드 - poll 와 뒤에서 꺼내는 메소드- pop)입니다. 
   => 사용하는 곳은 GUI프로그래밍에서 스크롤에 이용합니다.
         스크롤은 양방향 모두 가능해야 합니다. 
        스마트폰에서는 데이터 출력에 이용하는 ListView나 MapView, webView등에 이용합니다. 
   
   ** 자료구조 공부를 할 때는 Queue나 Deque로 알아야 하고 Java Programming만 한다고 할 때는 
       구현된 클래스 이름을 기억해야 합니다. 
   
   ** Set 
   => 데이터를 중복없이 저장하는 자료구조 
   => 데이터의 저장 순서를 알 수 없습니다.
   인덱스를 이용해서는 접근할 수 없습니다. 
   [인덱스]를 통해서 접근이 안되고 get메소드도 없습니다. 
   => 빠른 열거를 이용해서만 데이터를 접근할 수 있습니다. 
	=> java에서는 java.util.Set라는 인터페이스로 제공 
	=> 구현된 클래스는 HashSet, LinkedHashSet, TreeSet이 있습니다. 
	HashSet 은 해싱을 이용해서 데이터를 저장하기 떄문에 저장 순서를 전혀 알 수 없습니다. 
	보통의 경우 Set이라고 하면 HashSet입니다.     
	
	LinkedHashSet: 저장순서를 기억하고 있어서 데이터를 추출하면 저장된 순서대로 데이터가 추출됩니다.
	 
	TreeSet: 크기순서를 기억하고 있어서(정렬은 Tree를 이용) 추출하면 크기 순서대로 데이터가 추출됩니다. 
	
	=> 실제 구현된 경우는 스마트폰의 터치 이벤트가 Set을 사용합니다. 
	
** 반복문 안에서 마지막 continue는 의미가 없음 	   

** !!! Map - HashTable, Dictionary 

	=> 데이터를 저장할 때 key와 value를 쌍으로 저장하는 자료구조 
	=> List는 데이터를 저장할 때 인덱스(위치번호) 와 value를 저장하는 자료구조 
	=> 이름인덱스(key) 와 value를 저장하는 자료구조 
	=> 2개의 Generic을 적용 
	=> key의 자료형과 value의 자료형입니다. 
	key는 특별한 경우가 아니면 String 
	value는 여러가지 자료형을 사용할 수 있지만 대부분 Object(최상위 클래스) 
	=> java에서는 java.util.Map이라는 인터페이스로 제공 
	=> key는 Set으로 만듭니다.
	key값은 중복될 수 없습니다. 
	=>실제 구현된 클래스는 HashMap, LinkedHashMap, TreeMap 
	HashMap은 key의 순서를 알 수 없습니다. 
	LinkedHashMap은 key가 저장된 순서대로 만들어져 있습니다. 
	TreeMap은 key가 크기 순서대로 만들어져 있습니다. 
	 
	 1. 생성자 
	 HashMap < key의 자료형, Value의 자료형 > () 
	 
	 2. 주요 메소드 
	 1) 데이터의 저장 및 수정 
	 put(key, value): 존재하지 않는 key이면 추가가 되고 존재하는 key이면 수정 
	 
	 2) 데이터 삭제 
	 remove(key): key에 해당하는 데이터를 삭제하고 리턴 
	 
	 3) 데이터 가져오기 
	 get(key): key에 해당하는 데이터를 리턴 - 형 변환해서 사용 
	      자바는 없는 key를대입하면 null을 리턴 
	      어떤 언어는 예외를 발생시킵니다. 
	      다른 언어할 때는 이 부분을 확인
	 모든 언어가 Map구조는 지원하고 javascript, python, R등은 객체가 Map구조입나니다. 
	 
	  4) 모든 key를 가져오는 메소드 
	  Set keySet() 
	  
	  5)데이터 개수
	  int size() 
	 
	 3. Map은 교재에 나오는 이상 공부를 해야 합니다. 
	  => Map은 하나의 행(레코드)을 만드는 자료구조: DTO클래스 대신 사용이 가능 
	  => 2차원 배열 대신에 배열 -> Map ->배열로 만드는 구조를 생각해봐야 합니다. 
	  이미지 프로세싱 부분을 제외하고는 2차원 배열 대신에 Map의 배열을 사용 
	  => Map은 key를 알지 못해도 전체 데이터 출력이 가능 
	  => 관계형 데이터베이스가 DTO의 List구조이고 NoSQL이 Map의 List구조 
	   Swift는 데이터를 제공할 때 Map구조인 Dictionary를 많이 사용 
	   
	 4.하나의 생을 나타내는 자료구조 
	 1)DTO클래스를 만드렁서 사용
	 => 속성들을 변수로 생성해서 사용 
	 => 사용자체는 쉬움 
	 => 대부분의 IDE가 자신이 소유한 속성을 Code Sense로 보여주기 때문에 이름을 기억하지 않아도 사용하기가 쉬움 
	 => 이름을 가지고 출력해야하기 때문에 클래스 구조가 변경되면 출력하는 부분도 변경해야함  
	 
	 2)Map을 이용 
	 => 속성들을 key로 생성해서 사용 
	 => Code Sense를 이용해서 key를 확인할 수 없기 때문에 사용이 어려울 수 있음 
	 => 이름 없이 출력이 가능하기 때문에 데이터 저장부분이 변경되더라도 출력하는 부분을 변경할 필요가 없음 
	  
	  3)MVC(Model View Controller)패턴 
	  => 데이터를 만드는 부분과 출력하는 부분 그리고 둘을 연결해주는 부분을 나누어 구현을 해서 데이터에 변경이 생기더라도
	  출력하는 부분을 변경하지 않고 출력할 수 있도록 디자인 하는 패턴  
	  
	  4)배열들의 모임 
	  =>배열들을 바로 배열에 넣어서 배열을 만들면 각각의 배열을 위치로 구분해야 합니다., 
	  이 경우 다른 배열이 추가하게 되면 출력을 할 때 수정을 해야 합니다. 
	  
	  =>분류를 해야하는 데이터 모임들을 가지고 데이터 모임을 만들때는 바로 데이터모임을 만들지 말고 
	  데이터의 모임과 특징을 표현하는 Map을 생성해서 Map의 모임을 만들어야 데이터가 추가되더라도 
	  출력하는 부분을 수정하지 않아도 됩니다.
	  
	   스마트폰 애플리케이션을 이런 형태로 만들지 않으면 데이터가 변경될 때마다 출력하는 부분을 
	   수정하기 때문에 다시 마켓에 업로드 해서 심사를 받아야 하고 유저는 다시 다운로드를 받아야 합니다. 
	   
  ** Properties 
	  => 속성과 값을 쌍으로 저장하는 자료구조 
	  =>Map은 Generic을 활용해서 모든 자료형이 가능하지만 Properties는 key와 value모두 string만 가능 
	  => 환경설정에 관련된 내용들을 저장하고 읽어오는 용도로 사용됩니다. 
	  => 파일로 저장할 때는 Text파일에 key=value형태로 하고 XML(태그를 이용해서 데이터를 표현)파일로
	   만들어서 사용합니다. 
	  => apple에서는 Property List(plist)라고 합니다. 
	  1. 저장 
	  setProperty( String key, String value) 
	  
	   2. 가져오기 
	   String getProperty(string key) 
	   
	   3. 파일에 저장하거나 전송 
	   store(출력스트림, string 주석) 
	   
	   4.xml	로 저장
	   storeToXML(출력스트림, String 주석) 
	   
	    5.아직까지 프로젝트 설정 파일은 xml형태의 프로퍼티 저장방식을 많이 사용합니다. 
	    최근에 등장한 IDE는 json(Map)형식을 이용 
	    
	**자료구조 클래스 
	 동일한 데이터들의 모임 
	 - 배열: 크기 고정 
	 - List:ArrayList, LinkedList, Stack, queue, Deque 
	 - Set: Hashset, LinkedHashSet, TreeSet - 중복된 데이터를 2번 저장하지 않는다 
	 Link-순서대로, Tree-크기순서 
	 
	 여러 개의 데이터를 묶어서 하나를 표현하는 데이터의 모임 : key와 value를 쌍으로 저장 
	 - Map : 모든 자료형 사용이 가능 ,HashMap, LinkedHashMap, TreeMap  
	 - Properties: 문자열만 사용이 가능 
	
  **Collections 클래스 
	  => 데이터모임과 관련된 메소드를 소유한 클래스 
	  => 직접 객체 생성하는 경우는 없고 기존 데이터의 모임들을 변경해서 리턴하는 static 메소드를 주로 이용
	  => synchronized(동기화): 2개의 스레드가 서로 수정하려고 할때 작업의 순서를 결정해서 동시에 
	  수정할 수없도록 하는 것 
	  =>unmodifiable: 수정할 수 없는 읽기 전용 
  
    멀티 스레드 환경에서 안전한 List만들기 
    List<String> list = new ArrayList<>(); 
    List<String>safelist = Collections.synchronizedCollection(list); 
    
    기존의 데이터를 변경하지 못하도록 만들기 
    List<String>readOnlyList = Collections.unmodifiableCollection(list); 
    
    => Set, Map모두 동일 
    
   **java.util.Random 
   =>랜덤한 숫자 데이터를 리턴시켜주는 클래스
   => 컴퓨터는 랜덤을 만들 떄 난수표를 생성해서 하나씩 순서대로 추출 
   seed가 난수표의 번호입니다.
   seed가 같으면 난수표의 내용이 같기 때문에 순서대로 동일하게 추출됩니다. 
   => 정적 실행언어와 동적 실행언어가 기본 seed를 생성하는 방법이 다릅니다. 
   정적실행 언어(C)는 seeds설정을 하지 않으면 seed가 기본적으로 모두 같습니다. 
   동적실행언어(java)는 seed설정을 하지 않으면 seed가 현재 시간을 가지고 설정합니다. 
   seed설정을 하지 않으면 어떤 값인지 예측할 수 없습니다. 
   
   1. 생성자 
   Random()
   Random(long seed)
   
   2. 주요메소드
   float nextFloat()
   int nextInt() 
   int nextInt(int su): su 로 나눈 나머지를 랜덤하게 리턴 
   
   3. 이클래스의 용도 
   => 랜덤하게 데이터를 추출: 머신러닝이나 데이터 검증에서 이용 
   => 게임에서 아이템이나 몬스터 생성등에 이용하는데 시드를 설정해서 일정한 패턴을 갖도록 합니다. 
    
** 연습문제 
=> 내가 입력한 6개의 로또 숫자와  Random이 생성한 6개의 숫자가 몇 개가 일치하는지 확인하는 프로그램 

** 날짜 관련 클래스 
1. java.util.Date 		  
=> 날짜 정보를 저장하는 클래스 
=> 2038년 까지만 사용 가능 
1) 생성자 
Date(): 현재 날짜 및 시간을 갖는 객체가 생성 
Date(long timeInMillis): 1970년 1월 1일 자정이후 지나간 1/1000초 단위의 시간을 입력해서 생성 
Date(년,월,일): 년은 1900년 이후 지나온 년도 월은 -1해서 설정 
Date(년,월,일,시,분,초)

2) 주요 메소드 
toString(): 날짜 및 시간을 자세하게 문자열로 만들어서 리턴 
 날짜와 시간을 부분적으로 리턴해주는 get메소드 
 
3)관계형 데이터베이스의 날짜 타입과 바로 연동이 가능 

2. java.util.Calendar 
=>2038년 이후에도 사용 가능한 날짜 클래스 
=> 추상클래스라서 생성자를 이용한 객체 생성이 안됨 
=> getInstance()라는 static메소드를 이용해서 객체생성을 할 수 잇음 
현재 날짜 및 시간을 가지고 객체가 생성됩니다. 
1) 날짜 및 시간 설정
set(static final field, 값) 

 2) 날짜 및 시간을 가져오기 
 get(static final field) 
 
 3) toString재정의 되어 있는데 아주 자세하게 날짜 및 시간정보를 문자열로 만들어서 리턴 
 
 4) long getTimeInMillis():1970년 1월 1일 자정 이후에 지나온 시간을 long으로 리턴 
 
 5)setTime(Fate객체): Date객체를 가지고 Calendar객체를 생성 
 => Calendar가 Date보다 정확하게 시간을 표현하는데 데이터베이스와 직접 연동이 안됨 
 
 3. java.util.GregorianCalendar 
 =>Calendar를 상속받아서 만들어진 날짜 관련 클래스 
 
 4.java.sql.Date 
 =>데이터베이스와 직접 연동 가능 
 =>매개변수가 없는 생성자가 없음 
 => toString 메소드가 가 날짜 만 문자열로 리턴해서 바로 출력하는 것이 편리 
 
 5. 불기와 관련된 날짜 클래스도 별도로 제공 
 
 6. 날짜와 관련된 작업 중 중요한 것은 원하는 날짜 및 시간을 만들어서 Date로 만들수 있는지 
 

	  
	  
	 
	 */
}

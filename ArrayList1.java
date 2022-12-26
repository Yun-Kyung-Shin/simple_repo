package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);	
		
		list1.add(new Integer(5));	//박싱...? 객체, ...?
		list1.add(new Integer(4));	
		list1.add(new Integer(2));	
		list1.add(new Integer(0));	
		list1.add(new Integer(1));	
		list1.add(new Integer(3));	
		
		//subList() : arrayList에서 일부를 뽑아서 새로운 배열을 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); //1이상 4미만
		
		print(list1,list2);
		
		//Collection : 인터페이스 / Collections : 유틸에 들어있는 클래스
		//오름차순 정렬
		Collections.sort(list1);	
		Collections.sort(list2);
		
		//오름차순 정렬 후 뒤집어주기 -> 내림차순 정렬
		Collections.reverse(list1);
		Collections.reverse(list2);
		
		print(list1, list2);
		
		//containsAll() : 모든 요소가 모두 포함되어 있는지 확인
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));	//2번의 전부가 1에 포함되어있는가
		
		//add() : 내용을 추가, 위치(인덱스)도 지정 가능
		list2.add("B");
		list2.add("C");
		
		list2.add(3, "A");
		
		print(list1, list2);
		
		//set() : 해당 위치(인덱스)에 있는 내용을 변경
		list2.set(3, "AA");
		
		print(list1,list2);
		
		//indexOf() : 지정된 객체의 위치(인덱스)를 알려줌
		list1.add(0,"1");	//문자 1
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		
		print(list1,list2);
		
		//remove() : 해당 인덱스의 값이 삭제
		list1.remove(1);
		list1.remove(new Integer(1)); //숫자 1이 지워짐 (객체로 넣으면!)
		
		print(list1,list2);
		
		//retainAll() : 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1,list2);
		
		
		
		//삭제 -> 전부 지워지지 않음
//		for(int i=0;i<list2.size();i++) {
//			list2.remove(i);
//		}
//		print(list1,list2);
		
		//삭제 -> 전부 다 삭제..
//		for(int i=list2.size()-1; i>=0 ;i--) {
//			list2.remove(i);
//		}
//		print(list1,list2);
		
		//list2에서 list1과 겹치는 부분을 삭제 (응용)	-> 삭제를 할 때 뒤에서부터 지워야한다는 것을 기억!
		for(int i=list2.size()-1; i>=0 ;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
	}
	
	
	//출력을 위한 메서드 생성
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
	
}

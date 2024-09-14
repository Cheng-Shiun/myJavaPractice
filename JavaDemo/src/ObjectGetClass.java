package src;

import java.util.HashMap;
import java.util.Map;

public class ObjectGetClass {
	public static void main(String[] args) {
		// 當對象為物件(non-primitive data type)時，可使用 getClass().getName() 回傳資料型態
		Map<String, Object> map = new HashMap<>();
		map.put("name", "Tommy");
		System.out.println(map.getClass().getName());   // getClass().getName() 可以取得參數的資料型態
		
		// primitive data type 需強制轉型為包裝類 如: Integer, Double, Boolean
		int age = 18;
		System.out.println(((Object)age).getClass().getName());
		
		boolean isPass = false;
		System.out.println(((Object)isPass).getClass().getName());
	}
}

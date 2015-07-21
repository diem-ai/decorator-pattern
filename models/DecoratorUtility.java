package models;

public class DecoratorUtility {

	public static int MAX_DECORATION = 6;
	
	public static boolean checkMaxNumOfDecoration(Class<?> clazz){
		if (clazz == null || clazz.equals(Object.class)) return true;
		int counter = 0;
		Class<?> superClazz = clazz.getSuperclass();
		while( ! (superClazz.equals(Object.class))){
			counter ++;
			superClazz = superClazz.getSuperclass();
		}
		System.out.println("counter " + counter);
		if (counter > MAX_DECORATION)
			return false;
		return true;
	}
	
}

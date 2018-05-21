package c2;
//这是懒汉模式
public class Singleton1 {
	private static Singleton1 ins;
	private Singleton1() {
		
	}
	public static Singleton1 getIns() {
		if(ins==null) {
			ins=new Singleton1();
		}
		return ins;
	}
}


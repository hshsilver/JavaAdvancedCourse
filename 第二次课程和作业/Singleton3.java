package c2;
//��̬���ڲ�����
public class Singleton3 {
	private static class Singleton33{
		private static Singleton3 ins = new Singleton3();
	}
	private Singleton3() {
		System.out.println("Singleton loads");
	}
	public static Singleton3 getIns() {
		return Singleton33.ins;
	}
}

package c2;
//����ģʽ
public class Singleton2 {
		private static Singleton2 ins = new Singleton2();
		private Singleton2() {
			
		}
		public static Singleton2 getIns() {
			return ins;
		}
	}


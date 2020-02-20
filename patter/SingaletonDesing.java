package dilip.desing.patter;

public class SingaletonDesing {

}

class SingalTonDesingPattern {

	private static SingalTonDesingPattern singalton = null;

	private SingalTonDesingPattern() {
		System.out.println(singalton);
		if (singalton != null) {
			singalton = null;
		}

	}

	public SingalTonDesingPattern getInstance() {
		if (singalton != null) {
			return singalton;
		}
		return new SingalTonDesingPattern();
	}

	public synchronized SingalTonDesingPattern getInstances() {
		if (singalton != null) {
			return singalton;
		}
		return new SingalTonDesingPattern();
	}

	public static SingalTonDesingPattern getInstances2() {

		if (singalton == null) {
			synchronized (SingalTonDesingPattern.class) {
				if (singalton == null) {
					return new SingalTonDesingPattern();
				}
			}
		}
		return singalton;

	}

}
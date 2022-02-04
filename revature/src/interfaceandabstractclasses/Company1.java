package interfaceandabstractclasses;

public class Company1 implements SafetyGuidelines2022{
	@Override
	public void protectHead() {
		System.out.println("Hard hat");
	}
	@Override
	public void protectToes() {
		System.out.println("Steel toe");
	}
}

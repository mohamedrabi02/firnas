package firnas;

public class Interfacedemo2 {
	public static void main(String[] args) {
		Party evilParty=new PorkeyParty();
		evilParty.politicalService();
	}

}
abstract class Party{
	public abstract void politicalService();
}
interface Shaitan{
	private void doDestruction() {
		System.out.println("do destruct good...");
	}
	private void spreadHate() {
		System.out.println("spread hate and create restlesness and unemployment");
	}
	public default void partyAgenda() {
		spreadHate();
		doDestruction();
		breakParties();
		killPeople();
		appointEvilGovernors();
		destroyCountry();
	}
	private void destroyCountry() {
		System.out.println("country destroyed....");
	}
	private void breakParties() {
		System.out.println("buy mlas");
	}
	private void killPeople() {
		System.out.println("kill people in the name of caste and relegion");
	}
	private void appointEvilGovernors() {
		System.out.println("appoint evil governors...");
	}
	public void electMla();
}
class PorkeyParty extends Party implements Shaitan{
	@Override
	public void politicalService() {
		electMla();
	}
	@Override
	public void electMla() {
		this.partyAgenda();
	}
}
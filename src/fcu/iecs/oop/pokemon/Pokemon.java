package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private int cp;
	Pokemon(String name,int cp){
		this.name=name;
		this.cp=cp;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp =this.cp+cp;
	}
	public String getName() {
		return name;
	}
}

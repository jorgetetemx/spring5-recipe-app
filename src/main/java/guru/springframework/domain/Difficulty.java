package guru.springframework.domain;

public enum Difficulty {
	EASY, MODERATE, KIND_OF_HARD, HARD;
	
	public String getName(){
		return this.name();
	}
}

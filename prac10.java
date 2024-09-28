abstract class Instrument
{
	abstract void play();
	String what()
	{
		/*
			hello :)
			this is comment inside WHAT
		*/
		return "W H A T ? ";
	}
	abstract void adjust();
}

class Wind extends Instrument
{
	void play()
	{
		System.out.println("Wind instrument is played");
	}
	String what()
	{
		// System.out.println("flute is played");
		return "flute is played";
	}
	void adjust()
	{
		System.out.println("flute is adjusted");
	}
}

class Percussion extends Instrument
{
	void play()
	{	
		System.out.println("Percussion Instrument is played");
	}
	String what()
	{
		// System.out.println("tabla is played");
		return "tabla is played";
	}
	void adjust()
	{
		System.out.println("tabla is adjusted");
	}
}

class Stringed extends Instrument
{
	void play()
	{
		System.out.println("Stringed Instrument is played");
	}
	String what()
	{
		// System.out.println("guitar is played");
		return "guitar is played";
	}
	void adjust()
	{
		System.out.println("instrument is adjusted");
	}
}

class Woodwind extends Wind
{
	void play()
	{
		System.out.println("Woodwind Instrument is played");
	}
	String what()
	{
		// System.out.println("(name of woodwind instrument) is played");
		return "(name of woodwind instrument) is played";
	}
}

class Brass extends Wind
{
	void play()
	{
		System.out.println("Brass Instrument is played");
	}
	String adjust()
	{
		// System.out.println("(Brass Instrument's name) is adjusted");
		return "(Brass Instrument's name) is adjusted";
	}
}

public class prac10 {
	public static void main(String[] args) {

	}
}

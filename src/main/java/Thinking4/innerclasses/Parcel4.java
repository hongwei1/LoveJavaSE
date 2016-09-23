package Thinking4.innerclasses;

//: innerclasses/Parcel4.java
//Nesting a class implements interface.
class Parcel4
{
	private class PContents implements Contents
	{
		private int i = 11;

		@Override
		public int value()
		{
			return i;
		}
	}

	protected class PDestination implements Destination
	{
		private String label;

		private PDestination(String whereTo)
		{
			label = whereTo;
		}

		@Override
		public String readLabel()
		{
			return label;
		}
	}

	public Destination destination(String s)
	{
		return new PDestination(s);
	}

	public Contents contents()
	{
		return new PContents();
	}
}

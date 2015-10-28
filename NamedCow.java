
class NamedCow extends Cow
{
	private String name;

   	public NamedCow(String type, String name1, String sound){
   		mySound=sound;
   		myType=type;
   		name=name1;
   	}

   	public String getName(){
   		return name;
   	}
}
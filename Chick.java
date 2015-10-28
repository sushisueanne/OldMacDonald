
class Chick implements Animal 
{     
   private String mySound1, mySound2;
   private String myType;

   	public Chick(String type, String sound, String sound1){
   		mySound1=sound;
   		mySound2=sound1;
   		myType=type;
   	}

   	public Chick(){
   		mySound1="unknown";
   		mySound2="unknown";
   		myType="unknown";
   	}

   	public String getSound(){
   		if((int)(Math.random()*2)==0)
   		return mySound1;
   		else return mySound2;
   	}

   	public String getType(){
   		return myType;
   	}
}
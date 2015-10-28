
class Cow implements Animal 
{     
   public String mySound;
   public String myType;

    public Cow(String type, String sound){
        mySound=sound;
        myType=type;
    }

    public Cow(){
        mySound="unknown";
        myType="unknown";
    }

    public String getSound(){
        return mySound;
    }

    public String getType(){
        return myType;
    }
}
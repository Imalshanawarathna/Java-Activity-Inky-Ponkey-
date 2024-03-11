public class Inky{

public Inky(String pinky){
System.out.println(pinky);
}

public Inky(String pinky,String blynky,String rinky){

System.out.println(blynky + " " + pinky);
System.out.println(pinky + " " + rinky);
System.out.println(blynky + " " + pinky + " " + rinky);
}


public static void main(String args[]){

String pinky = "Donky";

Inky ponky = new Inky(pinky);

string blynky = "pinky";
string rinky = "Monkey";

Inky ponky2 = new Inky(pinky,blynky,rinky);

}
}





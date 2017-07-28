package guviproject;
import java.util.*;
public class Pro11 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String d=s.next();
	System.out.println(areworking(d));
	 	}
public static boolean areworking(String d){
String u=d.toLowerCase();
if(u.equals("monday") || u.equals("tuesday") ||u.equals("wednesday")||u.equals("thursday")||u.equals("friday")||u.equals("saturday")){
	return true;
}
else{
	return false;
}

	}

}

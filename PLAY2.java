package guviproject;

import java.util.Scanner;

public class PLAY2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
int a[]=new int [n];
int tp[]=new int [n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	
}
System.out.println("enter the k element");
int k=s.nextInt();
for(int i=n-k;i<n;i++){
	tp[i]=a[i];
	System.out.println(tp[i]);
}

for(int i=0;i<n-k;i++){
	tp[i]=a[i];
System.out.println(tp[i]);
}


	}
}

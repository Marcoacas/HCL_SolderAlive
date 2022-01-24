package com.SoldersAlive;

import java.util.*;

//A group of soldiers sitting in circle and have only one sword with them. Instead of getting caught by
//enemies they decide to die. So the plan is every soldier kills person sitting right to him
//and passes sword. But one soldier intends to get caught, problem is where should he sit in circle
//so that we wont get killed.

public class SolderAliveVerification {

	public static void main(String[] args) {
		CheckIfAlive(10);
		
	}

public static int CheckIfAlive(int n) {

LinkedList<Integer> lastSolder = new LinkedList<Integer>();
for (int i=1;i<=n;i++) {
    lastSolder.add(i);
}
int index=0; 
while(lastSolder.size() != 1) { 
    if(index > lastSolder.size()-1) { 
        index=0;
    }
    else {
        if(index+1 == lastSolder.size()){ 
             System.out.println("Soldier "+(lastSolder.get(index)) + " killed soldier " + lastSolder.getFirst());
             lastSolder.removeFirst();
        }else {
             System.out.println("Soldier "+(lastSolder.get(index)) + " killed soldier " + lastSolder.get(index+1));
             lastSolder.remove (index+1); 
         }
        index++; 
}
}
System.out.println("Soldier left:"+ lastSolder.getFirst());
//At this point only one soldier is left so return the soldier that is alive
return lastSolder.getFirst();

}
}

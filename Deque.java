/*
DEQUE - creating, inserting and deleting elements from front and rear
*/
package deque;
import java.util.Scanner;
public class Deque {

    int deque[]=new int[100];
int f;
int r;

Deque(){
    f=-1;
    r=-1;
}
// insert from rear
public void rins(int x){
    if(r==deque.length-1){
        System.out.println("overflow");  
    }
    else if(f==-1){
        f=0;
        r=0;
        deque[r]=x;
    }
    else{
        r++;
        deque[r]=x;
    }
}

// insert from front
public void fins(int x){
    if(f==0){
        System.out.println("overflow");
       
    }
    else if(f==-1&&r==-1){
        f=0;
        r=0;
        deque[f]=x;
               
    }
    else{
      f--;
      deque[f]=x;
    }
}

// delete from rear
public void rdel(){
    if(r==-1){
        System.out.println("underflow");
    }
    else if(r==0&&f==0){
       
        int temp=deque[r];
        r=-1;
        f=-1;
    }
    else{
        int temp=deque[r];
        r--;
    }
}

// delete from front
public void fdel(){
    if(f==-1){
        System.out.println("underflow");
    }
    else if(f==r&&r==0){
        int temp=deque[f];
        f=-1;
        r=-1;
       
    }
    else{
        int temp=deque[f];
        f++;
     
    }
}
    public static void main(String[] args) {
        Deque ob=new Deque();
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements to be filled");
        int num=in.nextInt();
        for(int i=0;i<num;i++){
            if(i==0){
                System.out.println("enter element");
                int u=in.nextInt();
                ob.fins(u);
            }
            else{
                System.out.println("enter element");
                int u=in.nextInt();
                ob.rins(u);
            }
        }
        System.out.println("deque is");
        for(int i=ob.f;i<=ob.r;i++){
            System.out.println(ob.deque[i]);
        }
       
       
        System.out.println("enter 1 for insertion from front");
        System.out.println("enter 2 for insertion from rear");
        System.out.println("enter 3 for deletion from front");
        System.out.println("enter 4 for deletion from rear");
       
       
        int ch=in.nextInt();

        if(ch==1){
            System.out.println("enter number to be inserted");
            int y=in.nextInt();
            ob.fins(y);

       
        }
          if(ch==2){
            System.out.println("enter number to be inserted");
            int y=in.nextInt();
            ob.rins(y);

       
        }
          System.out.println("deque is");
        for(int i=ob.f;i<=ob.r;i++){
            System.out.println(ob.deque[i]);
        }
        if(ch==3){
            ob.fdel();
        }
        if(ch==4){
            ob.rdel();
        }
        System.out.println("new deque");
         for(int i=ob.f;i<=ob.r;i++){
            System.out.println(ob.deque[i]);
        }
    }
   
}
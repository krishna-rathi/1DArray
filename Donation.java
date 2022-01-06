import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int a[] = new int[n];


        int ma=0; //max element
        long cnt=0; //output2
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt(); //take input
           // ma=ma>=a[i]?ma:a[i]; //ternary operator
            if(ma>=a[i])
              {
                  //do nothing
              }
            else {
                ma = a[i];
            }
            System.out.print(ma-a[i] + " ");
            //max element encountered till now - current element
            cnt+=ma-a[i];
            cnt+=a[i];
        }

        System.out.println();
        System.out.println(cnt);
            
    }
       
}

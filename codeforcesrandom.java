import java.util.*;
public class computer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ops=0;
            if(a>b && a%b==0){
                int q=a/b;
                while(q%8==0){
                    q=q/8;
                    ops++;
                }
                while(q%4==0){
                    q=q/4;
                    ops++;
                }
                while(q%2==0){
                    q=q/2;
                    ops++;
                }
                
            }
            else if(a<b && b%a==0){
                int q=b/a;
                while(q%8==0){
                    q=q/8;
                    ops++;
                }
                while(q%4==0){
                    q=q/4;
                    ops++;
                }
                while(q%2==0){
                    q=q/2;
                    ops++;
                }
                
            }
            System.out.println(ops);
        }
    }
}

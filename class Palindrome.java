class Palindrome
{
    public static void main(String[]args)
    {
        int num = 1232109;
        int temp=num;
    
        int rev=0;
        while(num!=0){
            int a = num%10;
            rev = rev*10 + a;
            num = num/10;
        }
        System.out.print(rev);
        if(temp==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("not a Palindrome Number");
        }
        
        
        
    }
}
class Handle{
    public static void main(String []args) {
        int a=12,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("Thank you for your Patience");

    }
}
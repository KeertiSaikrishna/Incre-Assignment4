public class Main {
    public static void main(String[] args) {
        try{
            Main obj = new Main();
            obj.throwexc(1);
        }
        catch(NullPointerException | IndexOutOfBoundsException | ArithmeticException exc){
            System.out.println(exc);
        }
        finally {
            System.out.println("finally block");
        }
    }

    void throwexc(int i){
        if(i==1)
            throw new NullPointerException();
        else if (i==2)
            throw new IndexOutOfBoundsException();
        else
            throw new ArithmeticException();
    }
}

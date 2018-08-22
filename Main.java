public class Main {
    public static void main(String[] args) {
        try{
            throwexc(15);
        }
        catch(firstException | secondException | thirdException exc){
            System.out.println(exc);
        }
        finally {
            System.out.println("finally block");
        }
    }

    static void throwexc(int i) throws firstException ,secondException,thirdException{
        if(i==1)
            throw new firstException("first custom Exception");
        else if (i==2)
            throw new secondException("second custom Exception");
        else if(i==3)
            throw new thirdException("third custom Exception");
        else
            throw new NullPointerException();
    }
}

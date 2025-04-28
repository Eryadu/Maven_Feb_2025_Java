package april26FunctionalInterface;

public class main {
    public static void main(String[] args) {
        IUtil iUtil =  x -> {
            if(x%2==0)
            {
                return  true;
            }
            return false;
        };

        System.out.println(iUtil.Abs(45));

    Test test = x -> x;
        System.out.println(test.display(12));
    }

}

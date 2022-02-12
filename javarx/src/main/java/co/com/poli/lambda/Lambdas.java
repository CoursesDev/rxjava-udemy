package co.com.poli.lambda;

public class Lambdas {
    public static void main(String[] args) {
       GenericInterface<String, String> fun = s -> s.substring(1, 5);

        System.out.println(fun.excecute("Basic"));

        GenericInterface<String, Integer> fun2 = s -> s.length();
        System.out.println(fun2.excecute("Basic"));
    }
}

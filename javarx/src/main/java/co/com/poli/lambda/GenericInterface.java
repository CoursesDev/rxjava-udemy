package co.com.poli.lambda;

@FunctionalInterface
public interface GenericInterface <T, R>{
    R excecute(T t);
}

package co.com.poli.funcionesordensuperior;

public class HigherOrderFunction {
    public static void main(String[] args) {
        IFactory<Integer> createFactory = createFactory(() -> Math.random()*100, r -> r.intValue());
        Integer product = createFactory.create();
        System.out.println(product);
    }

    public static <T,R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T,R> configurator){
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }
}

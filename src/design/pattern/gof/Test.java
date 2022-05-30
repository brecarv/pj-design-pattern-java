package design.pattern.gof;

import design.pattern.gof.singleton.SingletonEager;
import design.pattern.gof.singleton.SingletonLazy;
import design.pattern.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        /*Singleton*/
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}

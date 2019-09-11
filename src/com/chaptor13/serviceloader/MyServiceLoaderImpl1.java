package com.chaptor13.serviceloader;

public class MyServiceLoaderImpl1 implements IMyServiceLoader {
    @Override
    public String sayHello() {
        return "hello1";
    }

    @Override
    public String getName() {
        return "name1";
    }
}

public class MyServiceLoaderImpl2 implements IMyServiceLoader {
    @Override
    public String sayHello() {
        return "hello2";
    }

    @Override
    public String getName() {
        return "name2";
    }
}

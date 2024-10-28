package com.finalAndEffectiveFinal;

class Example {
    int count = 0;

    public void increment() {
        Runnable r = () -> { count++; };
        r.run();
        System.out.println(count); // Output: 1
    }
}

package day54_abstraction;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public abstract class MenuItem {
    public abstract void prepare();
    public abstract void serve();
}
class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Stretch the dough, put the sauce, put the cheese and toppings and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Serve in a plate or box");
    }
}
class Salad extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("Chop veggies, and dressings");
    }

    @Override
    public void serve() {
        System.out.println("Put into a bowl, and serve it with a fork");
    }
}

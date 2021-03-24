package dev.perfectbogus.interfacing;

public class ClassInsideInterfaceImpl implements ClassInsideInterface{

    @Override
    public void haveAClassInterface() {
        System.out.println("do nothing");
        ClassAInsideInterface a = new ClassAInsideInterface(){
            //we are making the concrete abstract class
        };
    }
}

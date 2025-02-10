package java8_feature1;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;



interface demo1{
   default void show(){
        System.out.println("hello,I m parent1");
    }
        }

interface demo2{
    default void show(){
        System.out.println("hello,I m parent2");
    }
}

class demo3 implements demo1,demo2{
@Override
public void show(){
    demo2.super.show();
    }
}

public class question_3  {
    public static void main(String[] args) {


   demo3 d=new demo3();
   d.show();
};};

package com.ttn;
import  com.google.gson.Gson;

/**
 * Hello world!
 *
 */
class rohit {
    @Override
    public String toString() {
        return "hi rohit";
    }
    String s;

    rohit(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
public class question2
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Gson gson = new Gson();
        rohit r = new rohit("rohit");
        System.out.println(gson.toJson(r));
    }
}

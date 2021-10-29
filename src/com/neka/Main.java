package com.neka;

class Outer{
    int a;                  //variable
    public void show(){     //method
        System.out.println("Displaying outer class");
    }
//just like the way you have static var and method, you can also have static method
    static class Inner{           //creating a class within a class
        public void display(){     //method
            System.out.println("Displaying inner class");
        }
    }
}
public class Main {

    public static void main(String[] args) {
//accesing outer class
        Outer obj = new Outer();
        obj.show();

        //accessing inner class
       // Outer.Inner obj1 = obj.new Inner();
        //syntax - Outerclass.innerclass obj = OuterclassObject. new InnerclassName

        //displaying static inner class
        Outer.Inner obj1 = new Outer.Inner();
        //as inner class is static we don't need obj to access it
        obj1.display();

        //Therefore types oc class

        //Main class
        //Inner class
        //Member class --- ?
        //Static class
    }
}

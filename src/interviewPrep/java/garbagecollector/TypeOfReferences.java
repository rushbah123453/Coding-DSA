
/*
* We Have 4 Types of Refrences
* Strong Reference
* Weak Reference
* Soft Reference (type of weak reference)
* Phantom Refrence (type of weak reference)
* */


package interviewPrep.java.garbagecollector;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class TypeOfReferences {

    public static void main(String[] args)
    {

        //For Weak Reference


        // Strong Reference
        Gfg g = new Gfg();
        System.out.println("Weak Reference");
        g.x();



        //Creating weak reference pointing to Strong Reference
        WeakReference<Gfg> weakref = new WeakReference<Gfg>(g);


        //Now we are making strong reference to point to null to call GC
        //Now weak reference dont have any reference to strong or soft reference
        //Sowhen Gc will run , it will vanich away
        g = null;



        //Here even if g=null , we will get the reference of g
        //Because GC did not run yet
        g = weakref.get();
        System.out.println("Before Garbage Collector Ran");
        g.x();

        g=null;
        System.gc();
        System.out.println("After Garbage Collector Ran for weak reference");

        try {

            g = weakref.get();
            g.x();
        }catch (Exception e){
            System.out.println("JVM removed me from memory after GC: "+e.getMessage());
        }



        //For Soft Reference


        //Strong Reference
        Gfg s = new Gfg();
        System.out.println("Soft Reference");
        s.x();

        //Creating Soft Reference pointing to strong reference
        SoftReference<Gfg> softref = new SoftReference<Gfg>(s);


        //Now we are making strong reference to point to null to call GC
        //Now Soft reference dont have any reference to strong or soft reference
        //Sowhen GC Will run only if JVM is less in heap memoory even if it is eligible for GC
        s = null;



        //Here even if g=null , we will get the reference of g
        //Because GC did not run yet
        s = softref.get();
        System.out.println("Before Garbage Collector Ran");
        s.x();

        s=null;
        System.gc();
        System.out.println("After Garbage Collector Ran for Soft reference");

try {
    s = softref.get();
    s.x();
    System.out.println("I will be only removed if JVM is low on memory");
}catch (Exception e){
    System.out.println("JVM removed me from memory after GC: "+e.getMessage());
}



    }


}
class Gfg
{
    //code
    public void x()
    {
        System.out.println("I am still in Memory of JVM ");
    }
}

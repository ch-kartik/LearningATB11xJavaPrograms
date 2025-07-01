package ex_19_OOPs_Inheritance.Multiple_Inheritance;

public class Son_Multiple  // extends Mother_Multiple, Father_Multiple {

    // You can't have multiple inheritance
    // You can't take from multiple people - Classes

    // Java doesn't support multiple inheritance to avoid "Diamond Problem" and to maintain simplicity and clarity in inheritance hierarchy.

    // DIAMOND PROBLEM
    // Imagine a scenario with four classes: Class A, Class B, Class C and Class D
    // Class A has a method named doSomething().
    // Class B and Class C both inherit from Class A and might override or implement doSomething() in their own ways.
    // Class D attempts to inherit from both Class B and Class C.
    // Now, if an object of ClassD calls doSomething(), it becomes ambiguous which version of the method should be executed:
    // the one from ClassB or the one from ClassC? This ambiguity is the core of the diamond problem.

}
    // Example:

// This code demonstrates the concept, but Java will not allow ClassD to extend both ClassB and ClassC.

class ClassA {
    public void doSomething() {
        System.out.println("Doing something from ClassA");
    }
}

class ClassB extends ClassA {
    @Override
    public void doSomething() {
        System.out.println("Doing something from ClassB");
    }
}

class ClassC extends ClassA {
    @Override
    public void doSomething() {
        System.out.println("Doing something from ClassC");
    }
}

// This would cause a compile-time error in Java:
// class ClassD extends ClassB, ClassC {
//     // Ambiguity arises if doSomething() is called on ClassD object
// }


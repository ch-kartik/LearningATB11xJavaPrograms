package ex_19_OOPs_Inheritance.Hybrid_Inheritance;

public class Lab186_Hybrid_Inheritance {

    // Not possible by using classes
    // As it will lead to Diamond Problem
}

class GF{}

class Father extends GF{}
class Mother extends GF{}
// class Son extends Mother, Father{}

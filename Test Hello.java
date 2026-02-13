package com.scsvmv.javalab;
import com.scsvmv.javalab.hello.Hello;
/*
*TestHello class
*Demonstrates passig command-line aragument
/*
public class TestHello {


public static void main(string[]args) {

// Using hello class from parent package
Hello simpleHello =new Hello();
simpleHello.wish();

//Using Hello class from child package
com.scsvmv.javalab.hello.Hello h =
new com.scsvmv.javalab.hello.Hello();

//Check for command-line argument
if(args.length>0){
h.wish(args[0]);    //pass CLI argument
h.wishWithDate(args[0]);
} else {
   System.out.println("Usage:");
   System.out.println("java com.scsvmv.java lab.TestHello<name>");
   System.out.println("Example:");
   System.out.println("java com.scsvmv.javalab.TestHello Student");
            }
      }
}



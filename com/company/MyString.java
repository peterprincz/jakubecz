package com.company;

/*
    Implmenet the String class by yourself using char and char[]!
 */

public class MyString {

   public  MyString() {

    }

    public MyString(char[] chars) {

    }

    public char chartAt(Integer index){
        return 'a';
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public boolean endsWith(char c){
       return false;
    }

    public boolean startsWith(char c){
        return false;
    }

    public boolean equalsIgnoreCase(MyString anotherMyString){
        return false;
    }

    public MyString replace(char[] target, char[] replacement){
       return null;
    }

    public MyString subString(int beginIndex, int endIndex){
       return null;
    }
}

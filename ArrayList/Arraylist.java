import java.util.ArrayList;
class MyArraylist {

    public static void main(String args[]){
        System.out.println("Hello world");
        //Java collection framework
        ArrayList<Integer> myList = new ArrayList<Integer>();
        ArrayList<String> myStringList = new ArrayList<String>();
        myList.add(1);
        myList.add(56);
        myList.add(5);
        myList.add(8);
        myStringList.add("Happy");
        myStringList.add("Aditya");
        myStringList.add("Mummy");
        myStringList.add("Papa");
        System.out.println(myStringList);
        System.out.println(myList);
        System.out.println(myStringList.size());
    }
        }
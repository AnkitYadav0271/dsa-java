import java.util.ArrayList;
class MdArrayList{

    public static void main(String args[]){
        System.out.println("Hello Happy how are you");
        ArrayList<ArrayList < Integer>> mdArray = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(34);
        list.add(35);
        list.add(32);
        list.add(64);
        list2.add(23);
        list2.add(66);
        list2.add(53);
        list2.add(73);
        mdArray.add(list);
        mdArray.add(list2);

       for (int i = 0 ; i < mdArray.size();i++){
           ArrayList<Integer> currentList = mdArray.get(i);
           for (int j = 0; j < currentList.size(); j++){
               System.out.println(currentList.get(j));
           }
       }
    }
}
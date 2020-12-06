public class Main {
    static int [] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        add(10);
        add(1, 15);
        remove(11);
        removeElement(15);
        //clear();
        System.out.println(get(6));
        set(0, 10);
        System.out.println(size());
        System.out.println(indexOf(5));
        System.out.println(contains(100));
        for (int j : arr) {
            System.out.println(j);
        }
    }

    static void add (int element){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[arr.length] = element;
        arr = arr2;
    }

    static void add (int index, int element){
        int[] arr2 = new int[arr.length+1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            arr2[i+1] = arr[i];
        }
        arr2[index] = element;
        arr = arr2;
    }

    static void remove (int index){
        int[] arr2 = new int[arr.length-1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        }
        for (int i = index; i < arr2.length; i++) {
            arr2[i] = arr[i+1];
        }
        arr = arr2;
    }

    static void removeElement (int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                remove(i);
                break;
            }
        }
    }

    static void clear (){
        arr = new int[0];
    }

    static int get(int index){
        return arr[index];
    }

    static void set(int index, int element){
        arr[index] = element;
    }

    static int size(){
        return arr.length;
    }

    static void toArray(){
        int [] arr2 = arr;
    }

    static int indexOf(int element){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    static boolean contains(int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }

}




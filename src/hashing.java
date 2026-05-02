import java.util.HashMap;

public class hashing {
    public static void main() {
//        HashMap<Integer,Integer> mao=new HashMap<>();
//        mao.put(0,100);
//        mao.put(1,200);
//        System.out.println(mao.containsKey(1));
//        System.out.println(mao);
//        mao.get(0);


        HashMap<Integer, String> map = new HashMap<>();


                map.put(1, "Apple");
                map.put(2, "Banana");
                map.put(3, "Cherry");

                // Step 3: Display the HashMap
                System.out.println("HashMap: " + map);

                // Step 4: Access a value using its key
                String fruit = map.get(2);
                System.out.println("Value at key 2: " + fruit);

                // Step 5: Check if a key exists
                if (map.containsKey(3)) {
                    System.out.println("Key 3 exists with value: " + map.get(3));
                }

                // Step 6: Remove a key-value pair
                map.remove(1);
                System.out.println("After removing key 1: " + map);

                // Step 7: Iterate through the HashMap
                System.out.println("Iterating through HashMap:");
                for (Integer key : map.keySet()) {
                    System.out.println("Key: " + key + ", Value: " + map.get(key));
                }
            }
        }




package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

//        ArrayList<Man> mans = new ArrayList<>();
//        Collections.addAll(mans,
//                new Man(1, 25, "Anton"),
//                new Man(2, 18, "Petr"),
//                new Man(3, 45, "Ivan")
//        );
//
//        Man foundMan = mans.stream().filter(man -> man.getId() == 3).findFirst().orElseThrow();
//
//        System.out.println(foundMan);

//
//        Map<Integer, Man> mans = new HashMap<>();
//
//        mans.put(1, new Man(1, 25, "Anton"));
//        mans.put(2, new Man(2, 18, "Petr"));
//        mans.put(3, new Man(3, 45, "Ivan"));
//        mans.put(3, new Man(3, 48, "Ivan2"));
//
//        //Man foundMan = mans.get(3);
//
//        System.out.println(mans);

//        Set<Man> mans = new HashSet<>();
//        mans.add(new Man(1, 25, "Anton"));
//        mans.add(new Man(1, 46, "Anton"));
//        mans.add(new Man(3, 45, "Ivan"));
//
//        System.out.println(mans);
//
//        Man man = new Man(1, 25, "Anton");


//        Set<Integer> integers = new LinkedHashSet<>();
//
//        Random random = new Random();
//
//        while (integers.size() < 10) {
//            integers.add(random.nextInt(10));
//        }
//
//        System.out.println(integers);

        //--------

//        Map<String, Integer> settings = new HashMap<>();
//
//        FileReader fileReader = new FileReader("setting.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String currentLine = "";
//
//        while ((currentLine = bufferedReader.readLine()) != null) {
//            String[] parts = currentLine.split("=");
//
//            settings.put(parts[0], Integer.parseInt(parts[1]));
//        }
//
//        bufferedReader.close();
//        fileReader.close();
//
//        System.out.println(settings);
//
//        int speed = settings.get("gun1_speed");
//        System.out.println(speed);

        //--------

//        GlobalData.add("user_id", 121);
//
//        int userId = GlobalData.getInteger("user_id").orElse(-1);
//
//        System.out.println(userId);
//
//        boolean removeResult1 = GlobalData.remove("user_id");
//        System.out.println(removeResult1);
//
//        boolean removeResult2 = GlobalData.remove("user_id");
//        System.out.println(removeResult2);
//
//        int userIdFake = GlobalData.getInteger("user_id").orElse(-1);
//        System.out.println(userIdFake);

    }

}

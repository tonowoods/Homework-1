package lbk.homework.day0812.javaPrcatice;

import lombok.Getter;

import java.util.*;

@Getter
public class Food implements GameItem {

    private Map<String, Integer> foods;

    public Food(){
        foods = new HashMap<>();

        foods.put("사과", 20);
        foods.put("귤", 10);
        foods.put("포도", 30);
        foods.put("빵", 100);

    }



    public void viewMyItem() {
        int cnt = 0;
        System.out.print("현재 보유중인 아이템들 : ");
        for(String key : getFoods().keySet()){
            if (foods.containsKey(key)) {
                System.out.println( key + " " + (cnt + 1) + "ea");
            } else {
                System.out.print( key + " ");
            }

        }
    }
    @Override
    public Integer eat(String key) {
        System.out.println(key + "를 먹었습니다.");
        return foods.get(key);
    }

    @Override
    public void eat(String key, int num) {
        System.out.println("내가 " + key + "*" + num + "를 먹었습니다.");

        for (int i = 0; i < num; i++) {
            System.out.println( foods.get(key) + "이/가 회복되었습니다.");
        }
    }
}

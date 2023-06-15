package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>(numberOfDishes);
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int c = 0;
        while (!queue.isEmpty()){
            int n = queue.poll();
            c++;
            if(c % everyDishNumberToEat == 0){
                list.add(n);
            } else {
                queue.add(n);
            }
        }
        return list;
    }
}

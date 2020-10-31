package Hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> total_importance(ArrayList<ArrayList<Integer>> list_of_importance, ArrayList<ArrayList<Integer>> list_of_subordinates){
        int total = 0;
        int index = 0;
        ArrayList<Integer> list_of_total = new ArrayList<Integer>();
        for (int i = 0; i < list_of_importance.size(); i++){
            total += list_of_importance.get(i).get(1);
            index = list_of_importance.get(i).get(0) - 1;
            for (int j = 0; j < list_of_subordinates.get(index).size(); j++){
                int ap = list_of_subordinates.get(index).get(j);
                total += list_of_importance.get(ap - 1).get(1);
            }
            list_of_total.add(total);
            total = 0;
        }
        return list_of_total;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list_of_importance = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> f_list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> list_of_subordinates = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> s_list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Enter the number of employee: ");
            int m = sc.nextInt();
            f_list.add(m);
            System.out.print("Enter the importance of employee: ");
            int importance = sc.nextInt();
            f_list.add(importance);
            list_of_importance.add((ArrayList<Integer>) f_list.clone());
            f_list.clear();
            System.out.print("Enter the number of subordinates: ");
            int number_of_subordinates = sc.nextInt();
            for (int j = 0; j < number_of_subordinates; j++){
                System.out.print("Enter the subordinate: ");
                int subordinate = sc.nextInt();
                s_list.add(subordinate);
            }
            list_of_subordinates.add((ArrayList<Integer>) s_list.clone());
            s_list.clear();
        }
        //System.out.println(list_of_importance);//закончил ввод чисел, следующие строки с list_of_subordinates
        //System.out.println(list_of_subordinates);//закончил ввод подчинённых следующая логика
        //System.out.println(total_importance(list_of_importance, list_of_subordinates));
        ArrayList<Integer> total_list = total_importance(list_of_importance, list_of_subordinates);
        Collections.sort(total_list);
        Collections.reverse(total_list);
        System.out.println(total_list.get(0));

    }
}
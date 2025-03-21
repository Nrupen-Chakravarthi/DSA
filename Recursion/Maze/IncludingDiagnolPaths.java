package Recursion.Maze;

import java.util.ArrayList;

public class IncludingDiagnolPaths {
    public static void main(String[] args) {
        System.out.println(diagnolPathsIncluded("",3,3));
        System.out.println(diagnolPathsIncluded("",3,3).size());
    }
    static ArrayList<String> diagnolPathsIncluded(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(diagnolPathsIncluded(p + "D", r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(diagnolPathsIncluded(p + 'V', r - 1, c));
        }
        if(c > 1){
            list.addAll(diagnolPathsIncluded(p + 'H', r, c - 1));
        }
        return list;
    }
}

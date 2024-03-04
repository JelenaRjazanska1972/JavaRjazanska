package homework14;

import java.util.Scanner;

public class hobbiArrays {
    public static void main(String[] args) {

        String[] hobby = new String[6];
        hobby[0] = "чтение";
        hobby[1] = "спорт";
        hobby[2] = "кулинария";
        hobby[3] = "коллекционирование";
        hobby[4] = "туризм";
        hobby[5] = "рукоделие";
        int number = 1;
        for (int i = 0; i < 6; i++) {
            System.out.println(hobby[i] + " " + "Nr.: " + number++);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите Ваше хобби!");
        String word = scanner.nextLine().toLowerCase();
        for (String hobbyList : hobby) {
            if (hobbyList.equals(word)) {
                System.out.println("Хобби входит в список популярных: " + word);
                break;
            }


        }
        System.out.println("Хобби не входит в список популярных");
        System.out.println("Выберете номер любимого хобби из списка!");
        number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Ваше любимое хобби из списка: " + hobby[0]);
        } else if (number == 2) {
            System.out.println("Ваше любимое хобби из списка: " + hobby[1]);
        } else if (number == 3) {
            System.out.println("Ваше любимое хобби из списка: " + hobby[2]);
        } else if (number == 4) {
            System.out.println("Ваше любимое хобби из списка: " + hobby[3]);
        } else if (number == 5) {
            System.out.println("Ваше любимое хобби из списка: " + hobby[4]);
        } else {
            System.out.println("Ваше любимое хобби из списка: " + hobby[5]);
        }
        String newHobby[] = new String[4];

        newHobby[0] = "охота и рыбалка";
        newHobby[1] = "садоводство";
        newHobby[2] = "фотография";
        newHobby[3] = "астрология";

        String[]sumHobby = new String[10];
        for (int i=0; i < 6; i ++){
            sumHobby[i] = hobby[i];
        }
        for (int i = 0; i < 4; i++ ) {
            sumHobby[i + 6] = newHobby[i];
        }


int [] rating={1,2,3,4,5,6,7,8,9,10};
        for (String s:sumHobby){

    if (s.equals("чтение")){
        rating[0]=1;
        System.out.println(rating [0] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("спорт")){
        rating[1]=2;
        System.out.println(rating [1] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("кулинария")){
        rating[2]=3;
        System.out.println(rating [2] + " место " + s + " " + "в рейтинге хобби "   );}
    else if (s.equals("коллекционирование")){
        rating[3]=4;
        System.out.println(rating [3] + " место " + s + " " + "в рейтинге хобби "   );}
    else if (s.equals("туризм")){
        rating[4]=5;
        System.out.println(rating [4] + " место " + s + " " + "в рейтинге хобби "   );}
    else if (s.equals("рукоделие")){
        rating[5]=6;
        System.out.println(rating [5] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("охота и рыбалка")){
        rating[6]=7;
        System.out.println(rating [6] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("садоводство")){
        rating[7]=8;
        System.out.println(rating [7] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("фотография")){
        rating[8]=9;
        System.out.println(rating [8] + " место " + s + " " + "в рейтинге хобби "  );}
    else if (s.equals("астрология")){
        rating[9]=10;
    System.out.println(rating [9] + " место " + s + " " + "в рейтинге хобби "  );}
    else {break;}
    }}}






















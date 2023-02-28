package sk.stuba.fei.uim.oop;

public class cvicenie1 {

    static int metoda(int num1, int num2){
        int answer=0;

        if(num1>num2){
            answer = 1;
        }
        else if(num1==num2){
            answer = 0;
        }
        else if(num1<num2){
            answer = -1;
        }

        return answer;
    }
    public static void main(String[] argumentyZKonzoly) {
        System.out.println(metoda(5,6));


    }


}


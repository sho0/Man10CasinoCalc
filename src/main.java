import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nsho-pc on 2017/07/18.
 */
public class main {
    public static void main(String args[]){
        int win = 239;
        int lose = 158265;
        //maou 3 win : 239 lose : 158265
        int winRate = lose/win;
        int timesToWin = 10000;
        boolean running = true;
        List<Integer> winsData = new ArrayList<>();
        int spinTimes = 0;
        for(int i = 0; i < timesToWin; i++){
            spinTimes = 0;
            running = true;
            while (running){
                Random r = new Random();
                int result = r.nextInt(winRate);
                if(result == 0){
                    running = false;
                    spinTimes++;
                    winsData.add(spinTimes);
                }
                spinTimes++;
            }
        }
        double avr = 0;
        for(int i = 0; i < winsData.size(); i++){
            System.out.println(winsData.get(i));
            avr = avr + winsData.get(i);
        }
        System.out.println(avr/winsData.size());
    }
}

import java.util.*;

public class C_100_Song {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        
        //総持ち時間を秒に変換する
        int totalTime = M*60 + S;
        
        //曲の長さを秒で保持する
        int[] songs = new int[N];
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int t = x*60 + y;
            songs[i] = t;
        }
        
        //短い順にソートする
        Arrays.sort(songs);

        int count = 0;
        int usedTime = 0;

        //曲をできるだけ多く入れる
        for(int time : songs) {
            if(usedTime + time <= totalTime) {
                usedTime += time;
                count++;
            } else {
                break;
            }
        }
        
        System.out.println(count);

        sc.close();
    }
}
package idea.monkey.peach;

public class MonkeyNum {

    static int num;

    public static void main(String[] args) {
        MonkeyNum.Monkey(num);
    }

    public static int Monkey(int num){
        num = 1;
        for(int day=10;day>=1;day--){
            if(day==10){
                System.out.println("第"+day+"天，一共有"+num+"个桃子。");
            }
            if(day<=9){
                num = 2*(num+1);
                System.out.println("第"+day+"天，一共有"+num+"个桃子。");
            }
        }
        return num;
    }

}

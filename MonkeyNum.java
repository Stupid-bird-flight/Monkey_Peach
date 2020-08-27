package idea.monkey.peach;

public class MonkeyNum {
    //定义全局变量，计算返回桃子数量
    static int num;
    
    public static void main(String[] args) {
        //调用桃子计算方法，获取每天的桃子数量
        num=MonkeyNum.Monkey(num);
        System.out.println("第一天，一共有"+num+"个桃子。");
    }

    public static int Monkey(int num){
        num = 1;
        for(int day=10;day>=1;day--){
            /*if(day==10){
                System.out.println("第"+day+"天，一共有"+num+"个桃子。");
            }*/
            if(day<=9){
                num = 2*(num+1);
                /*System.out.println("第"+day+"天，一共有"+num+"个桃子。");*/
            }
        }
        return num;
    }

}

package com;

import java.util.*;

public class Mahjong {
    public static void main(String[] args) {
        System.out.println("欢迎来到德莱联盟：");
        Scanner sc=new Scanner(System.in);
        String  Start=sc.next();
        if("开始".equals(Start)){

            List<Mahjong_Card> list=Clear_Card();
            System.out.println("开始游戏界面");
            List<Mahjong_Card> list_one=list.subList(0,13);
            List<Mahjong_Card> list_two=list.subList(13,26);
            List<Mahjong_Card> list_three=list.subList(26,39);
            List<Mahjong_Card> list_flour=list.subList(39,52);
            System.out.println("玩家一："+list_one);
            System.out.println("玩家二："+list_two);
            System.out.println("玩家三："+list_three);
            System.out.println("玩家四："+list_flour);

        }

    }

    private static List<Mahjong_Card> Clear_Card() {
        List<Mahjong_Card> list_Clear=new ArrayList<>();
        String Card_color[]={"条子","万子","筒子"};
        String Card_num[]={"1","2","3","4","5","6","7","8","9"};

//        Random random=new Random();
//        int time=0;
//        for(int i=0;i<108;i++) {
//            Mahjong_Card mahjong_card;
//            do {
//                int color= random.nextInt(3);
//                int num= random.nextInt(9);
//                mahjong_card=new Mahjong_Card(Card_color[color],Card_num[num],time);
//            }while (list_Clear.contains(mahjong_card));
//            time++;
//            if(time>=4){
//                    time=0;
//                }
//            list_Clear.add(mahjong_card);
//        }
        Mahjong_Card mahjong_card;
        int x,y,z;
        for(x=0;x<4;x++){
            for(y=0;y<3;y++){
                for(z=0;z<9;z++){
                    mahjong_card=new Mahjong_Card(Card_color[y],Card_num[z],x);
                    list_Clear.add(mahjong_card);
                }
            }
        }
        Collections.shuffle(list_Clear);
        return list_Clear;
    }
}

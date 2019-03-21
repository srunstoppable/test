package com.experiment.Utils;

import com.experiment.entity.Userinfo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import org.apache.ibatis.reflection.SystemMetaObject;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.TreeMap;
//
public class Test {
    public static void main(String args[]) {
        int i=0,k=10;
//        System.out.println(++i);
//        System.out.println(i);
        while(k-- > 0){
            i=i++;
        }
        System.out.println(i);
//        System.out.println(test());
//        Userinfo userinfo=new Userinfo().setId(null);
//        System.out.println(userinfo);

//        String s="helloafacfahellohEllohelLo";
//        String str="hello";
//        int count = 0;
//        for (int i=0;i<s.length()-4;i++){
//            if (s.substring(i,i+5).equalsIgnoreCase(str)){
//                count++;
//            }
//
//        }
//         System.out.println(2 << 3);

//        ConcurrentHashMap<String,Result>chm = new ConcurrentHashMap<>();

//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//

//        System.out.println(i1==i2);
//        System.out.println(i3.equals(i4));


//        String a=new String("sb");
//        String b=new String("sb");
//        System.out.println(a==b);
//
//        long i=Math.round(12.3);
//        double j=Math.ceil(12.3);
//        Math.floor(12.3);
//        public Double getFeeService() {
//            double fee = 0D;
//            if (cont20gp == null && cont40gp == null && cont40hq == null) {
//                fee = 3 * 50D;
//            }
//            if (cont20gp == null && cont40gp !=null && cont40hq !=null ){
//                fee = (cont40gp+cont40hq) * 50D;
//            }
//            if (cont20gp != null && cont40gp ==null && cont40hq !=null){
//                fee = (cont20gp+cont40hq) * 50D;
//            }
//            if (cont20gp != null && cont40gp !=null && cont40hq ==null){
//                fee = (cont20gp+cont40gp) * 50D;
//            }
//            if (cont20gp == null & cont40gp == null & cont40hq !=null){
//                fee = cont40hq * 50D;
//            }
//            if (cont20gp == null & cont40gp != null & cont40hq ==null){
//                fee = cont40gp * 50D;
//            }
//            if (cont20gp != null & cont40gp == null & cont40hq ==null){
//                fee = cont20gp* 50D;
//            }
//            if (cont20gp != null & cont40gp != null & cont40hq != null){
//                fee = (cont20gp + cont40gp + cont40hq) * 50D;
//            }
//            return fee;
//        }


//        String mobile="^(13[0-9]|14[0-9]|15[0-9]|17[0-9]|18[0-9])\\d{8}$";
//
//        String test="18052444172";
//        Pattern pattern=Pattern.compile(mobile);
//        Matcher m=pattern.matcher(test);
//        System.out.println(""+m.matches());
//            new Thread(() -> System.out.println("这是一个thread")).start();
//            Runnable runnable=() ->  System.out.println("这是一个runnable");
//            runnable.run();
//
//
//            List list=Arrays.asList(1,3,5.8,13,4,7);
//            Arrays.sort(list,(Integer x,Integer y)- >(x.compareTo(y)) );
            //java 8 新特性
//            list.forEach((i) ->System.out.println(i));
//            list.forEach(System.out::println);

    }
    static int test() {
        int x = 1;
        try {
            return x;
        } finally {
            ++x;
        }
    }
}
//        List <Integer>list= Arrays.asList(1,2,3,4,5);
//        List <Integer>list1=list.stream().map( x -> x*2).collect(Collectors.toList());
//        System.out.println(list1);
//
//        List<Userinfo>userinfoList=new ArrayList<>();
//        for (int i = 0 ; i < 5; i++){
//            userinfoList.add(new Userinfo().setId("1000"+i).setName("测试"+i));
//        }
//        List<String>stringList=userinfoList.stream().map( x -> x.getName()).collect(Collectors.toList());
//        System.out.println(stringList);
//        testInt testInt=(a,b) -> a+b ;
//        System.out.println(testInt.compute(5,6));
//        String[] atp = {"Rafael Nadal", "Novak Djokovic",
//                "Stanislas Wawrinka",
//                "David Ferrer","Roger Federer",
//                "Andy Murray","Tomas Berdych",
//                "Juan Martin Del Potro"};
//        List<String> players =  Arrays.asList(atp);
//
//// 以前的循环方式
//        for (String player : players) {
//            System.out.print(player + "; ");
//        }

// 使用 lambda 表达式以及函数操作(functional operation)
//        players.forEach((player) -> System.out.println(player + "; "));
//
// 在 Java 8 中使用双冒号操作符(double colon operator)
//        players.forEach(System.out::print);
//
//    }
//}
//    interface testInt{
//        int compute(int a,int b);
//        }
//
////            String s="(10-3.5)*(4.3+2.4)/5@";
////            String s2=Compute.change(s);
////            System.out.println(s2);
////           System.out.println(Compute.compute(s2));
//
////        SequenceStack sequenceStack=new SequenceStack();
////        int [] a={3,8,5,17,9,30,15,22};
////        for(int i=0;i<a.length;i++)
////            sequenceStack.push(a[i]);
////        System.out.println(sequenceStack.pop()+","+sequenceStack.pop()+","+sequenceStack.pop());
////        sequenceStack.push(68);
////        System.out.println(sequenceStack.peek()+","+sequenceStack.pop()+","+sequenceStack.pop());
////        while (!sequenceStack.isEmpty()) System.out.println(sequenceStack.pop()+" ");
////        System.out.println();
////        sequenceStack.clear();
////        int a[]={1,2,3,4,5,5,5,6,6};
////        int i= Arrays.binarySearch(a,5);System.out.println(i);
//        String str="\n" +
//                "{\"list\":[\n" +
//                "{\n" +
//                "    \"userid\":\"10004\",\n" +
//                "    \"teams\":\"2018\",\n" +
//                "    \"FormulaId\":1,\n" +
//                "    \"a\":1.2 ,\n" +
//                "    \"b\":1.1,\n" +
//                "    \"c\":1.2,\n" +
//                "    \"d\":1.3,\n" +
//                "    \"e\":2,\n" +
//                "    \"f\":1,\n" +
//                "    \"g\":2\n" +
//                "},\n" +
//                "{\n" +
//                "\"userid\":\"10005\",\n" +
//                "\"teams\":\"2018\",\n" +
//                "\"FormulaId\":1,\n" +
//                "\"a\":1.2 ,\n" +
//                "\"b\":1.1,\n" +
//                "\"c\":1.2,\n" +
//                "\"d\":1.3,\n" +
//                "\"e\":2,\n" +
//                "\"f\":1,\n" +
//                "\"g\":2\n" +
//                "},\n" +
//                "{\n" +
//                "\"userid\":\"10006\",\n" +
//                "\"teams\":\"2018\",\n" +
//                "\"FormulaId\":1,\n" +
//                "\"a\":1.2 ,\n" +
//                "\"b\":1.1,\n" +
//                "\"c\":1.2,\n" +
//                "\"d\":1.3,\n" +
//                "\"e\":2,\n" +
//                "\"f\":1,\n" +
//                "\"g\":2\n" +
//                "}\n" +
//                "]\n" +
//                "}";
//        JSONObject jsonObject=JSONObject.parseObject(str);
//        JSONArray s=jsonObject.getJSONArray("list");
//        for(int i=0;i<s.size();i++){
////            JSONObject jo=s.getJSONObject(i);
////            System.out.println(jo);
//            JSONObject j=s.getJSONObject(i);
//            System.out.println(j);
//            Map map=(Map)j;
//            String string="(a*b*(1+c+d*(e-1))+f*(a*b*(1+c+d*(e-1)))*g)";
//            StringBuffer stringBuffer=new StringBuffer();
//            char[] c=string.toCharArray();
//            for(char c1:c){
//                if(c1>=97&&c1<=122) {
//                    Iterator iterator=map.entrySet().iterator();
//                    while (iterator.hasNext()){
//                        Map.Entry entry=(Map.Entry)iterator.next();
//                        if (entry.getKey().equals(String.valueOf(c1)))
//                            stringBuffer.append(entry.getValue());
//                    }
//
//                }
//                else {
//                    stringBuffer.append(c1);
//                }
//            }
//            stringBuffer.append("@");
//            System.out.println(stringBuffer);
//            String sss=Compute.change(stringBuffer.toString());
//            System.out.println(Compute.compute(sss));
//        }
//
//
////        JSONObject jsonObject=JSONObject.parseObject(str);
////        System.out.println(jsonObject);
////        System.out.println(s);
////        Map map=(Map)jsonObject;
////        Iterator iterable=map.entrySet().iterator();
////        while(iterable.hasNext()){
////            Map.Entry entry=(Map.Entry)iterable.next();
////            String key=(String)entry.getKey();
////            if(key.equals("createTime")) {
////                String value =  entry.getValue().toString();
//
////            }
////        }
////
//    }
//}

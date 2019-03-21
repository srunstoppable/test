package com.experiment.Utils;

public class Compute {

    public static String change(String str){
           SequenceStack sck=new SequenceStack();
           sck.push('@');
           char[] a=str.toCharArray();
           StringBuffer sb=new StringBuffer();
           int i=0;
           char ch=a[i];
           while(i<a.length){
               while(ch==' ') ch=a[++i];
               if(ch=='@') break;
               if(ch=='('){
                   sck.push(ch);
                   ch=a[++i];
               }
               else if (ch==')'){
                   while((Character)sck.peek()!='(') sb.append(sck.pop());
                   sck.pop();
                   ch=a[++i];
               }
               else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                   char w=(Character)sck.peek();
                   while(precedence(w)>=precedence(ch)){
                       sb.append(sck.pop());
                       w=(Character)sck.peek();
                   }
                   sck.push(ch);
                   ch=a[++i];
               }
               else{
                   if((ch<'0' || ch>'9' ) && (ch!='.')){
                       System.out.println("表达式错误!");
                       System.exit(1);
                   }
                   while((ch>='0'&& ch<='9') || ch=='.'){
                       sb.append(ch);
                       ch=a[++i];
                   }
                   sb.append(' ');
               }
        }
        ch=(Character)sck.pop();
           while(ch!='@'){
               if(ch=='@'){
                   System.out.println("表达式错误");
                   System.exit(1);
               }
               else{
                   sb.append(ch);
                   ch=(Character)sck.pop();
               }
           }
                return new String(sb);
    }
    public static int precedence(char op) {
        switch(op){
            case '+':
                case '-': return 1;
            case '*':
            case '/': return 2;
            case '(':
                case '@':
                    default: return 0;


        }
    }
    public static double compute(String str){
            SequenceStack sck=new SequenceStack();
            double x,y;
            char []a =str.toCharArray();
            int i=0;
            while(i<a.length) {
                while(a[i]==' ') i++;
                switch (a[i]){
                    case '+':
                        x=(Double)sck.pop()+(Double)sck.pop();
                        i++;
                        break;
                    case '-':
                        x=(Double)sck.pop();
                        x=(Double)sck.pop()-x;
                        i++;
                        break;
                    case '*':
                        x=(Double)sck.pop()*(Double)sck.pop();
                        i++;
                        break;
                    case '/':
                        x=(Double)sck.pop();
                        if(Math.abs(x)>0) x=(Double)sck.pop()/x;
                        else{
                            System.out.println("除数为0，退出运行！");
                            System.exit(1);
                        }
                        i++;
                        break;
                    default:
                        if((a[i]<'0'||a[i]>'9')&& a[i]!='.'){
                            System.out.println("非法字符，退出运行！");
                            System.exit(1);
                        }
                        x=0.0;
                        while ((a[i]>=48 && a[i]<=57)) {
                            x=x*10+a[i]-48;i++;
                        }
                        if(a[i]=='.'){
                            i++;
                            y=0.0;
                            double j=10.0;
                            while(a[i]>=48&& a[i]<=57){
                                y=y+(a[i]-48)/j;
                                i++; j*=10;
                            }
                            x+=y;
                        }
                }
                sck.push(x);
            }
        if(sck.isEmpty()){
            System.out.println("栈为空！");
            System.exit(1);
        }
        x=(Double)sck.pop();
        if(!sck.isEmpty()){
            System.out.println("表达式格式错!");
            System.exit(1);
        }
        return (double)Math.round(x*100)/100;

    }
}

public class program4 {
    public static void main(String[] args) {
        char[] s=new char[]{'h','e','l','l','o'};
        
           String str=String.valueOf(s);  
          
          StringBuffer sb=new StringBuffer(str);
          String str1=sb.reverse().toString();
          System.out.println(str1);
    }
    }


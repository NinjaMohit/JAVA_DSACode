//Self Length fuction created User define
class stringDemo16 {

    static int myStrLen(String str){
        char arr[]=str.toCharArray();


        int count=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        String str1="Mohit";
        int len=myStrLen(str1);
        System.out.println(len);
    }
}
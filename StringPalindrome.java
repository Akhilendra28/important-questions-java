class Main{
    public static void main(String[] args){
        String str="ANANT";
        String nstr="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.print("Original String is: "+str);
        System.out.print("\n");
        System.out.print("Reverse String is: "+nstr);
        System.out.print("\n");
        if(str.equals(nstr)){
            System.out.print(" Palindrome");
        }
        else {
            System.out.print("NOT Palindrome");
        }
    }
}

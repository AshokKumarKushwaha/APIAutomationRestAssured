public class StringReverse {
    public static void main(String[] args) {
        String str = "ashok";
        String revstring ="";
        for (int i =str.length()-1;i>=0; i--){
            revstring =revstring+str.charAt(i);

        }
        System.out.println(revstring);
    }
}

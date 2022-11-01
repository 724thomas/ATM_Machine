public class test {
    public static void main(String[] args) {

        System.out.println(

                solution("cccCCC")

        );
    }

    public static String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)>90){
                answer+=(char)((int)my_string.charAt(i)-32);
            }else{
                answer+=(char)((int)my_string.charAt(i)+32);
            }
        }
        return answer;
    }
}

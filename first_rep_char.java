public class first_rep_char {
    public static void main(String[] args) {
        String s = "abcdesfghij";
        // System.out.println(s.indexOf("j"));
        // System.out.println(s.lastIndexOf("i"));
        repeating(s);
        String ss= s.replaceAll("abc", "xyz");
        System.out.println(ss);
    }
    public static void repeating(String s){
        char ch[] = s.toCharArray();
        for(char c: ch){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
           
            
        }
         
         
       
            }
}

package string;

public class StringDemo {

    public static void main(String[] args) {

        String s="codekul";//litrals
        String s1=new String("codekul");//new key
        String s2="codekul";
      /*  s.concat(" Institute");
        System.out.println("s : "+s.hashCode());
        System.out.println("s : "+s);
        s=s.concat(" institute");
        System.out.println("s : "+s);
        System.out.println("s : "+s.hashCode());
        System.out.println("s1 : "+s1.hashCode());
        System.out.println("s2 : "+s2.hashCode());*/

        System.out.println(System.currentTimeMillis());
        if (s==s2) {
            System.out.println(s + "==" + s2);

        }else{
                System.out.println(s + "!=" + s2);
            }
    }



}

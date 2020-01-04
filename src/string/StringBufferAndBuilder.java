package string;

public class StringBufferAndBuilder {

    public static void main(String[] args) {

        StringBuffer buffer=new StringBuffer("codekul");
        StringBuilder builder=new StringBuilder("codekul");
        System.out.println("buffer : "+buffer.hashCode());
        buffer.append(" institute");
        System.out.println("buffer : "+buffer);
        System.out.println("buffer : "+buffer.hashCode());


    }

}

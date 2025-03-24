public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("I am a programmer");
        sb.append("world");
        System.out.println(sb);
        sb.insert(5," ");
        System.out.println(sb);
        int n=sb.length();
        System.out.println(n);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.setCharAt(0,'H');
        System.out.println(sb);
        sb.replace(0,5,"Minni");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(7,"is");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(7,17,"Developer");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}

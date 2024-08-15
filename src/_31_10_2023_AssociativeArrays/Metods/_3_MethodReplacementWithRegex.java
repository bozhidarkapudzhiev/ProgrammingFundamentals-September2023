package _31_10_2023_AssociativeArrays.Metods;

public class _3_MethodReplacementWithRegex {
    public static void main(String[] args) {
        String text="abc123def456";
        String result=text.replaceAll("\\d","#");
        System.out.println(result);
    }
}

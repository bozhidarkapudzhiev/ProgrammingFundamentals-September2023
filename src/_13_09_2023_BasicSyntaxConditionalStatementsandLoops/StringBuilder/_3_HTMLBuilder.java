package _13_09_2023_BasicSyntaxConditionalStatementsandLoops.StringBuilder;

public class _3_HTMLBuilder {
    public static void main(String[] args) {
        StringBuilder html = new StringBuilder();
        html.append("<html>\n\t")
                .append("<head>\n\t\t")
                .append("<title>Simple Page</title>\n\t")
                .append("</head>\n\t")
                .append("<body>\n\t\t")
                .append("<h1>Welcome to the Sample Page</h1>\n\t\t")
                .append("<p>This is a sample paragraph.</p>\n\t")
                .append("</body>\n")
                .append("</html>");
        System.out.println(html);
    }
}

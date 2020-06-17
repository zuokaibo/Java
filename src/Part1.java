public class Part1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
//       The error is resolved by toggling the allow-unrelated-histories switch. After a git pull or git merge command, add the following tag:
//
//git pull origin master --allow-unrelated-histories
//More information can be found here, ​ on Git’s official documentation.
    }

    public String findSimpleGene (String dna){
        int start = dna.indexOf("ATG");
        if (start == -1) {
            return "There is no ATG";
        }
        int stop = dna.indexOf("TAA", start+3);
        if (stop == -1) {
            return "There is no TAA";
        }




    }

}

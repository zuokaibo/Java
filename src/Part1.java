public class Part1 {
    public static void main(String[] args) {
        System.out.println("Hello Java");
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

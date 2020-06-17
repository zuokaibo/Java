public class Part1 {

    public static void main(String[] args) {

        public void testSimpleGene (String dna) {
            String first = "cccatggggtttaaataataataggagagagagagagagttt";
            String second = "atggggtttaaataataatag";
            String third = "atgcctag";
            String fourth = "";
            String fifth = "ATGCCCTAG";
            String sixth = "ATGCCCTAG";
            String result = findSimpleGene(dna);



        }
    }

    public String findSimpleGene(String dna) {
        int start = dna.indexOf("ATG");
        if (start == -1) {
            return "There is no ATG";
        }
        int stop = dna.indexOf("TAA", start + 3);
        if (stop == -1) {
            return "There is no TAA";
        }
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop + 3);
        }
    }
}






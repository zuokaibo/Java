public class Part1 {

    public static void main(String[] args) {
        testSimpleGene();
    }

    public static void testSimpleGene() {
        String first = "CCCATGGGGTTTAAATAATAATAGGAGAGAGAGAGAGAGTTT";
        String second = "ATGGGGTTTAAATAATAATAG";
        String third = "ATGCCTAG";
        String fourth = "";
        String fifth = "ATGCCCTAG";
        String result3;
        String result4;
        String result5;
        String result2;
        result3 = findSimpleGene(third);
        result4 = findSimpleGene(fourth);
        result5 = findSimpleGene(fifth);
        result2 = findSimpleGene(second);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result2);
    }

    public static String findSimpleGene(String dna) {

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

        return dna;
    }
}






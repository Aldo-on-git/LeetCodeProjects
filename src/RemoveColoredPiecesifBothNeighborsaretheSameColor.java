public class RemoveColoredPiecesifBothNeighborsaretheSameColor {
    public static void main(String[] args){
        System.out.println(winnerOfGame("BBBBBAAAAAABBBBB"));
    }

    public static boolean winnerOfGame(String colors){
        int Ascore=0,Bscore=0;

        for(int i=0;i<colors.length()-2;i++){
            String subColors = colors.substring(i,i+3);

            if(subColors.replace("A","").equals("")){
                Ascore++;
            }
            if(subColors.replace("B","").equals("")){
                Bscore++;
            }
        }

        return Ascore>Bscore;
    }
}

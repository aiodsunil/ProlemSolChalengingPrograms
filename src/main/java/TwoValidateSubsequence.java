import java.util.List;

public class TwoValidateSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx=0;
        for(Integer value:array){
            if(seqIdx==sequence.size())
                return true;
            if(sequence.get(seqIdx)==value){
                seqIdx+=1;
            }

        }
        return seqIdx==sequence.size();
    }
}

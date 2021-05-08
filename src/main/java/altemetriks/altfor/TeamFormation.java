package altemetriks.altfor;

import java.util.ArrayList;
import java.util.List;

public class TeamFormation {

    public static void main(String[] arg) {
        List<Integer> input = new ArrayList<>();
        input.add(17);
        input.add(12);
        input.add(10);
        input.add(2);
        input.add(7);
        input.add(2);
        input.add(11);
        input.add(20);
        input.add(8);
        int teamSize = 3;
        int k = 4;
        System.out.println(teamFormation(input, teamSize, k));
    }

    private static int teamFormation(List<Integer> input, int teamSize, int k) {
        List<Integer> firstTeam;
        List<Integer> lastTeam;
        List<Integer> maxoTeam = new ArrayList<>();


        Integer maxo;
        int lengthSize = input.size();
        for (int i = 0; i < teamSize && k < lengthSize; i++) {
            firstTeam = input.subList(0, k);
            lastTeam = input.subList(lengthSize - k, lengthSize);
            maxo = Math.max(firstTeam.stream().max(Integer::compare).orElse(0), lastTeam.stream().max(Integer::compare).orElse(0));
            maxoTeam.add(maxo);
            input.remove(maxo);
            lengthSize--;

         }
        return maxoTeam.stream().mapToInt(Integer::valueOf).sum();
    }

}

